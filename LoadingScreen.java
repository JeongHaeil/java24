package frame;

import javax.swing.*;
import java.awt.*;

public class LoadingScreen extends JWindow {
    public LoadingScreen(Dimension size) {
        setSize(size);
        getContentPane().add(new JLabel("Loading...", SwingConstants.CENTER), BorderLayout.CENTER);
    }
}
