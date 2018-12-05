import javax.swing.*;
import java.awt.*;
/**
 * Created by nigelfrazier on 12/4/18.
 */
public class Window extends JFrame {
    private JLabel window1;
    public Window() {
        super("The Title Bar");  	// inheritance
        setLayout(new FlowLayout());		// use option+ Enter to add library
        window1 = new JLabel("Hello, World!");
        window1.setToolTipText("This will appear on hover");
        add(window1);
    }

}
