import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window {
    
    public Window(){
        JFrame frame = new JFrame("Contoh Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// kalau windownya di close maka program di terminal berhenti karena code ini
        frame.setSize(420, 550);//mengatur panjang dan tinggi suatu window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Window window = new Window();

    }    
}
