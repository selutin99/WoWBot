package wowbot;

import java.awt.AWTException;
import java.io.IOException;

public class WoWBot {

    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        BotWorker.openGame();
        BotWorker.authorization();
        
        BotWorker.openMailBox();
        BotWorker.sendMail();
    }
}
