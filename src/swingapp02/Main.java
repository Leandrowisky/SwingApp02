package swingapp02;

import java.awt.Dimension;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Runnable t = new Runnable(){
            public void run(){
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(t);
    }
    
    public static void criarGUI(){
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(400,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing App 02");
        
        JCheckBox box2 = new JCheckBox("Box2");
        JCheckBox box = new JCheckBox("XekiBocsi");
        JPanel panel = new JPanel();
        JButton button = new JButton("Xablau");
        JButton button2 = new JButton("Xablau2");
        JLabel label = new JLabel("Ola Mundo!");
        final JTextField field = new JTextField(10);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Valor Digitado: "+ field.getText());
                //System.out.println("Valor Digitado:"+ field.getText());
            }
        });
        
        box.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    System.out.println("Selecionado");
                }
            }
        });
        
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Item Selecionado: "+ box.isSelected());
            }
        });
        
        panel.add(button);
        panel.add(label);
        panel.add(field);
        panel.add(box);
        panel.add(button2);
        frame.getContentPane().add(panel);
        
        frame.pack();
        frame.setVisible(true);
        
        
    }
    
}
