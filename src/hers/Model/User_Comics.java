package hers.Model;

public class User_Comics {

    private int ID_USER_COMICS;
    private String COMICS_USER_NAME;
    private String COMICS_PASSWORD_USER;

    public User_Comics(int ID_USER_COMICS,
            String COMICS_USER_NAME, String COMICS_PASSWORD_USER) {
        this.ID_USER_COMICS = ID_USER_COMICS;
        this.COMICS_USER_NAME = COMICS_USER_NAME;
        this.COMICS_PASSWORD_USER = COMICS_PASSWORD_USER;
    }

    public int getID_USER_COMICS() {
        return ID_USER_COMICS;
    }

    public void setID_USER_COMICS(int ID_USER_COMICS) {
        this.ID_USER_COMICS = ID_USER_COMICS;
    }

    public String getCOMICS_PASSWORD_USER() {
        return COMICS_PASSWORD_USER;
    }

    public void setCOMICS_PASSWORD_USER(String COMICS_PASSWORD_USER) {
        this.COMICS_PASSWORD_USER = COMICS_PASSWORD_USER;
    }

    public String getCOMICS_USER_NAME() {
        return COMICS_USER_NAME;
    }

    public void setCOMICS_USER_NAME(String COMICS_USER_NAME) {
        this.COMICS_USER_NAME = COMICS_USER_NAME;
    }
}
