package qmframework;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.*;
import java.awt.event.InputEvent;

public class MouseController {
    private Robot robot;

    public MouseController() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void moveMouse(int x, int y) {
        robot.mouseMove(x, y);
    }

    public void leftClick() {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void rightClick() {
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }
}