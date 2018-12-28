package entities;

public class Mailer {
    
    private int x;
    private int y;
    
    private String userName;
    private String mailTheme;
    private String message;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getUserName() {
        return userName;
    }

    public String getMailTheme() {
        return mailTheme;
    }
    
    public String getMessage() {
        return message;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMailTheme(String mailTheme) {
        this.mailTheme = mailTheme;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
