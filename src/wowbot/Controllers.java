package wowbot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

class Controllers {
    
    /**
     * Method copy login to clipboard
     * @param userField
     * @throws AWTException 
     */
    public static void copyStringToClipboard(String userField) throws AWTException{ 
        
        StringSelection stringSelection = new StringSelection(userField);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }
   
    /**
     * This method copy and paste param from clipboard to game field
     * @param rb 
     */
    public static void setField(Robot rb){
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
    }
    
    /**
     * This method make tab for switch to another field
     * @param rb 
     */
    public static void tabulation(Robot rb){
        rb.keyPress(KeyEvent.VK_TAB);
        rb.keyRelease(KeyEvent.VK_TAB);
    }
    
    /**
     * Method simulate enter key press
     * @param rb
     * @throws InterruptedException 
     */
    public static void pressEnter(Robot rb){
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
    
    /**
     * This method emulate right mouse click
     * @param rb 
     */
    public static void clickRightMouseButton(Robot rb, int x, int y) {
        rb.mouseMove(x, y);
        rb.mousePress(InputEvent.BUTTON3_MASK);
        rb.mouseRelease(InputEvent.BUTTON3_MASK);
    }
    
    /**
     * This method emulate left mouse click
     * @param rb 
     */
    public static void clickLeftMouseButton(Robot rb, int x, int y) {
        rb.mouseMove(x, y);
        rb.mousePress(InputEvent.BUTTON1_MASK);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}
