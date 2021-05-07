
package controle;

//import java.sql.SQLException;
import modele.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class factory  {
private static Connection conn = null;
private static PreparedStatement pstm = null;
   
   
public static void insertUser(user u){

    try {
            if(
                u.getUsername().equals("")
                ||u.getPassword().equals("")) {

                JOptionPane.showMessageDialog(null, "Entrer les informations completes SVP ! ");
            }else{

                conn = dbConn.getConnection();
                pstm = conn.prepareStatement(
                        "INSERT INTO user (username, password) VALUES (?,?)");

                pstm.setString(1, u.getUsername());
                pstm.setString(2, u.getPassword());
                pstm.executeUpdate();
                pstm.close();

                JOptionPane.showConfirmDialog(null, "Enregistrement effectue avec succes !! " );

            }
        }catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Probleme lors d'insertion de l'utilisateur" + ex.getLocalizedMessage());
        }
        

}

 public static void insertNote(notesM n){
       // conn = DbConnection.getConnection();
                try{
                    conn = dbConn.getConnection();
                    
                    //SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
                    //Date date = new Date(System.currentTimeMillis());
                    
                    //String dates = (formatter.format(date));
                    //SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
                    //appliquer le format obtenue a jchooser
                    //String dates = sp.format(n.getDate_note());
                    
                    java.util.Date date=new java.util.Date();
                    java.sql.Date dates=new java.sql.Date(date.getTime());
                    //java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
			
                    //PreparedStatement ps=con.prepareStatement("insert into record (date,time) values(?,?)");
                    //ps.setDate(1,sqlDate);
                    //ps.setTimestamp(2,sqlTime);
                    
                    
                    
                    pstm = conn.prepareStatement(
                            
                        "INSERT INTO notes(title, date_note, txtfoto, user) values (?,?,?,?)");
                            //"select id_user = ? from user where username = ?, password = ?");
                
                    pstm.setString(1, n.getTitle());
                    pstm.setDate(2, dates);
                    //pstm.setString(2, dates);
                    pstm.setString(3, n.getTextfoto());
                    pstm.setInt(4, n.getUser());
                    pstm.executeUpdate();
                    pstm.close();
                            
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Probleme d'insertion. Verifier si tout les champs sont bien saisie "+e.getLocalizedMessage());
                    System.err.print(e);
                }
                
                
    }

/*
public static void updateUser(user u){}
public static void deleteUser(user u){}

   */
   /*
 public int addRecordpatient(User a)
    {
        int i=0;
        Connection con;
        try {
            con = getCon();
        String qr="insert into signin(phone, name, password, gender, bgrp, age) values(?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(qr);
        ps.setInt(1, a.getPhone());
        ps.setString(2, a.getName());
        ps.setString(3, a.getPassword());
                ps.setString(4, a.getGender());
                ps.setString(5, a.getBgrp());
                ps.setInt(6, a.getAge());
        int j=ps.executeUpdate();

                if (j!=0)  //Just to ensure data has been inserted into the database
                {System.out.println("success"); }


        con.close();
} catch (Exception e) {

            System.out.println(e);
        } 
        //return i;
    return 0;
        }

}*/

/*
public static void updateNote(user u){}
public static void deleteNote(user u){}

   */
   
   
   
   
   
     //************ utilisateurs **************//


    /*
    public static void insertutilisateur(Utilisateurs u){
       // conn = DbConnection.getConnection();
                try{
       
                        conn = DbConnection.getConnection();
                            pstm = conn.prepareStatement(" INSERT INTO utilisateur (NomUser_Utilisateur,"
                                    + " tel_Utilisateur, adresse_Utilisateur, fonction_Utilisateur, username_Utilisateur,"
                                    + " password_Utilisateur,codeProfil_Profil) VALUES (?,?,?,?,?,?,?); ");
                            pstm.setString(1, u.getNom());
                            pstm.setString(2,u.getTelephone() );
                            pstm.setString(3, u.getAddresse());
                            pstm.setString(4, u.getFonction());
                            pstm.setString(5, u.getUsername());
                            pstm.setString(6, u.getPassword());
                            pstm.setInt(7, u.getCodeprofil());

                                pstm.executeUpdate();
                                pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
    }
    
    public static void updateutilisateur(Utilisateurs u){
        try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE utilisateur SET NomUser_Utilisateur ='"+u.getNom()+"',"
                + " tel_Utilisateur= '"+u.getTelephone()+"',"
                + "adresse_Utilisateur ='"+u.getAddresse()+"',"
                + "fonction_Utilisateur ='"+u.getFonction()+"',"
                + "username_Utilisateur='"+u.getUsername()+"',"
                + "password_Utilisateur ='"+u.getPassword()+"',password_Utilisateur ='"+u.getPassword()+"'"
                    + " WHERE iduser_Utilisateur = '"+u.getCode()+"'  ";
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
        
    
    }
    public static void deleteutilisateur(Utilisateurs u){
       
        try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from utilisateur  WHERE iduser_Utilisateur = '"+u.getCode()+"'";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
           
    }
    public static ArrayList<Utilisateurs> displayutilisateur(){
    
            ArrayList<Utilisateurs> listu=new ArrayList();
            Utilisateurs ut =null;
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT utilisateur.codeProfil_Profil,NomUser_Utilisateur,tel_Utilisateur,"
                                        + "adresse_Utilisateur,fonction_Utilisateur,"
                                        + "username_Utilisateur,password_Utilisateur,"
                                         + "nom_Profil FROM utilisateur,profil "
                                        + "WHERE utilisateur.codeProfil_Profil= profil.codeProfil_Profil");
                                while(rs.next()){
                                    ut=new Utilisateurs();
//                                    ut.setCode(rs.getInt("iduser_Utilisateur"));
                                    ut.setNom(rs.getString("NomUser_Utilisateur"));
                                    ut.setAddresse(rs.getString("adresse_Utilisateur"));
                                    ut.setFonction(rs.getString("fonction_Utilisateur"));
                                    ut.setUsername(rs.getString("username_Utilisateur"));
                                    ut.setPassword(rs.getString("password_Utilisateur"));
                                    ut.setCodeprofil(rs.getInt("codeProfil_Profil"));
                                    listu.add(ut);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listu;
                  
    
    }   */
    
}
    
    

