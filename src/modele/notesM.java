
package modele;

/**
 *
 * @author aimab
 */
public class notesM {
    private int user;
    private String title,date_note, Textfoto;

    public int getUser() {
        return user;
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

    public void setUser(int user) {
        this.user = user;
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
