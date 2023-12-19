
package test04;

import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class window1 extends Canvas {
    private int day;
    public window1() throws IOException{
        JFrame f1 = new JFrame("ME E MOOD");
        JButton b1 = new JButton("1");
        
        BufferedImage img = ImageIO.read(new File("october-12-2019-orion-nebula.jpg"));
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(img));
        label.setBounds(100, 200, 50, 50);
        f1.getContentPane().add(label);
        
        b1.setBounds(250, 200, 60, 100);
        f1.setLayout(null);
        f1.add(b1);
        f1.setSize(400, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f1.dispose();
            window2();
        }
        });
        
    }

    public void window2(){
        JFrame f2 = new JFrame("ME E MOOD");
        JButton b2 = new JButton("2");
        b2.setBounds(250, 200, 60, 100);
        f2.setLayout(null);
        f2.add(b2);
        f2.setSize(400, 500);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);
        b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f2.dispose();
            window3();
        }
        });
        
    }
    public void window3(){
        JFrame f3 = new JFrame("ME E MOOD");
        JButton b3 = new JButton("3");
        b3.setBounds(250, 200, 60, 100);
        f3.setLayout(null);
        f3.add(b3);
        f3.setSize(400, 500);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setLocationRelativeTo(null);
        f3.setVisible(true);
        b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f3.dispose();
            window4();
        }
        });
        
    }
    public void window4(){
        JFrame f4 = new JFrame("ME E MOOD");
        JButton b4 = new JButton("4");
        b4.setBounds(250, 200, 60, 100);
        f4.setLayout(null);
        f4.add(b4);
        f4.setSize(400, 500);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.setLocationRelativeTo(null);
        f4.setVisible(true);
        day = 0;
        b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f4.dispose();
            window5_1();
        }
        });
        
    }
        public void window5_1(){
        JFrame f5 = new JFrame("ME E MOOD");
        JButton b5 = new JButton("5");
        b5.setBounds(250, 200, 60, 100);
        f5.setLayout(null);
        f5.add(b5);
        f5.setSize(400, 500);
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f5.setLocationRelativeTo(null);
        f5.setVisible(true);
        b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(day<3){
                f5.dispose();
                int i=0;
                window5_1();
                day++;
            }
            else{
                f5.dispose();
                window6();
            }
        }
        });
        
    }

    
        public void window6(){
        JFrame f6 = new JFrame("ME E MOOD");
        JButton b6 = new JButton("6");
        b6.setBounds(250, 200, 60, 100);
        f6.setLayout(null);
        f6.add(b6);
        f6.setSize(400, 500);
        f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f6.setLocationRelativeTo(null);
        f6.setVisible(true);
        b6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f6.dispose();
      
        }
        });
        
    }

    


}
