package wowbot;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

class OpenGame{
    
    /**
     * This method open the game
     * @param file
     * @throws IOException
     * @throws InterruptedException 
     */
    public static void openWoW(File file) throws IOException {
        Desktop.getDesktop().open(file);
    }
}
