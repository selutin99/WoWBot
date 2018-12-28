package wowbot;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import entities.Authorization;
import entities.Game;
import entities.Mailer;
import java.io.UnsupportedEncodingException;

class BotWorker {
    
    private static Robot rb;
    private static Authorization authorization; 
    private static Game game;
    
    public static void openGame() throws IOException, InterruptedException{
        game = new Game();
        game.setGamePatch("D:/Games/World of Warcraft/WoWCircle 3.3.5a/Wow.exe");
        
        File file = new File(game.getGamePatch());
        OpenGame.openWoW(file);
        Thread.sleep(20000);
    }
    
    public static void authorization() throws AWTException, InterruptedException{
        rb = new Robot();
        
        authorization = new Authorization();
        authorization.setLogin("selutin991");
        authorization.setPassword("75297529S");
        
        //Set login
        Controllers.copyStringToClipboard(authorization.getLogin());
        Controllers.setField(rb);
        
        Controllers.tabulation(rb);
        
        Thread.sleep(2000);
        
        //Set password
        Controllers.copyStringToClipboard(authorization.getPassword());
        Controllers.setField(rb);

        Thread.sleep(2000);
        //Enter into world
        Controllers.pressEnter(rb);
        
        //Choose the first character
        Thread.sleep(10000);
        Controllers.pressEnter(rb);
    }
    
    public static void openMailBox() throws AWTException, InterruptedException{
        rb = new Robot();
        
        Mailer mailer = new Mailer();
        
        mailer.setX(530);
        mailer.setY(550);
        
        Thread.sleep(30000);
        Controllers.clickRightMouseButton(rb, mailer.getX(), mailer.getY());
        Thread.sleep(2000);
        
        mailer.setX(230);
        mailer.setY(556);
        
        Controllers.clickLeftMouseButton(rb, mailer.getX(), mailer.getY());
        
        Thread.sleep(2000);
    }
    
    
    public static void sendMail() throws AWTException, InterruptedException, UnsupportedEncodingException{
        rb = new Robot();
        
        Mailer mailer = new Mailer();
        
        mailer.setX(230);
        mailer.setY(530);
        
        mailer.setUserName("Nastafarinto");
        mailer.setMailTheme("Hola");
        mailer.setMessage("Let's fuck");
        
        //Set username
        Controllers.copyStringToClipboard(mailer.getUserName());
        Controllers.setField(rb);
        
        Controllers.tabulation(rb);
        
        Thread.sleep(2000);
        
        //Set mail theme
        Controllers.copyStringToClipboard(mailer.getMailTheme());
        Controllers.setField(rb);
        
        Controllers.tabulation(rb);

        Thread.sleep(2000);
        
        //Set mail message
        Controllers.copyStringToClipboard(mailer.getMessage());
        Controllers.setField(rb);

        Thread.sleep(2000);
        
        //Send mail
        Controllers.clickLeftMouseButton(rb, mailer.getX(), mailer.getY());
    }
    
}
