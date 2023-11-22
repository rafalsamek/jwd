package mysandbox.cards;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.lang.Thread.sleep;

public class KeyInput implements KeyListener {
    private JFrame frame;
    private boolean wait = true;
    private int waitUntilCode = KeyEvent.VK_SPACE;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.exitOnCtrlC(e);
        this.setWaitToTrueOnWaitUntilCode(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public JFrame getFrame() {
        return this.frame;
    }

    public KeyInput() {
        this.frame = new JFrame();
        this.frame.addKeyListener(this);
        this.frame.setVisible(true);
    }

    public void waitUntilKeyPressed(int keyCode) throws InterruptedException {
        this.waitUntilCode = keyCode;
        while (this.wait) {
            sleep(100);
        }
        this.wait = true;
    }

    public void waitUntilKeyPressed() throws InterruptedException {
        this.waitUntilKeyPressed(this.waitUntilCode);
    }

    private void exitOnCtrlC(KeyEvent e) {
        if (e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK && e.getKeyCode() == KeyEvent.VK_C) {
            System.exit(0);
        }
    }

    private void setWaitToTrueOnWaitUntilCode(KeyEvent e) {
        if (e.getKeyCode() == this.waitUntilCode) {
            this.wait = false;
        }
    }
}
