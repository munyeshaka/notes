
package modele;

/**
 *
 * @author aimab
 */
public class notesM extends user{
    private int id_note;
    private String title,date_note, Textfoto;

    @Override
    public int getId_user() {
        return super.getId_user(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId_user(int id_user) {
        super.setId_user(id_user); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getId_note() {
        return id_note;
    }

    public String getTitle() {
        return title;
    }

    public String getdate_note() {
        return date_note;
    }
    public String getTextNote() {
        return Textfoto;
    }

    public void setId_note(int id_note) {
        this.id_note = id_note;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate_note(String date_note) {
        this.date_note = date_note;
    }

    public void setTextfoto(String Textfoto) {
        this.Textfoto = Textfoto;
    }

}
