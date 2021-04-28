
package modele;

/**
 *
 * @author aimab
 */
public class notesM extends user{
    private String title,date_note, Textfoto;
    
    public notesM() {
        super();
    }

    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsername() {
        return super.getUsername(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId_user() {
        return super.getId_user(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitle() {
        return title;
    }

    public String getDate_note() {
        return date_note;
    }

    public String getTextfoto() {
        return Textfoto;
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