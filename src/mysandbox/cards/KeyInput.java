package mysandbox.cards;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.lang.Thread.sleep;

public class KeyInput implements KeyListener {
    private JFrame frame;
    private boolean wait = true;
    private int waitCode = KeyEvent.VK_SPACE;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.exitOnCtrlC(e);
        this.setWaitToTrueOnWaitCode(e);
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
        this.waitCode = keyCode;
        while (this.wait) {
            sleep(100);
        }
        this.wait = true;
    }

    public void waitUntilKeyPressed() throws InterruptedException {
        this.waitUntilKeyPressed(this.waitCode);
    }

    private void exitOnCtrlC(KeyEvent e) {
        if (e.getModifiersEx() == KeyEvent.CTRL_DOWN_MASK && e.getKeyCode() == KeyEvent.VK_C) {
            System.exit(0);
        }
    }

    private void setWaitToTrueOnWaitCode(KeyEvent e) {
        if (e.getKeyCode() == this.waitCode) {
            this.wait = false;
        }
    }
}
