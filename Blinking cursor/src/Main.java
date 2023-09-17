import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Blinking Cursor Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField();
        frame.add(textField);

        Timer timer = new Timer(500, new ActionListener() {
            private boolean cursorVisible = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                cursorVisible = !cursorVisible;
                if (cursorVisible) {
                    textField.setCaretColor(Color.BLACK); // Zmena farby kurzoru
                } else {
                    textField.setCaretColor(frame.getBackground()); // Skrytie kurzoru
                }
            }
        });
        timer.start();

        frame.setVisible(true);
    }
}
