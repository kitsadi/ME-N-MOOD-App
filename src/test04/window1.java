
package test04;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class window1 {
    private ArrayList mood = new ArrayList();
    private ButtonGroup group;
    private int day,index,f_day,day_duplicate;
    private user_pass data = new user_pass();
    public window1() throws IOException{//start
        day_duplicate = 1;
        
        ImageIcon saveimge = new ImageIcon("st_new__1_-removebg-preview (1).png");
        JFrame f1 = new JFrame("ME E MOOD");
        JButton b1 = new JButton(saveimge);
        
        BufferedImage img1 = ImageIO.read(new File("1.1.png"));
        JLabel lb = new JLabel();
        lb.setIcon(new ImageIcon(img1));
        lb.setBounds(90, 80, 500, 200);
        f1.getContentPane().add(lb);
        
        BufferedImage img = ImageIO.read(new File("button (17).png"));
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(img));
        label.setBounds(130, 80, 400, 500);
        f1.getContentPane().add(label);
        
        b1.setBounds(120, 380, 151, 58);
        b1.setBorder ( BorderFactory.createLineBorder(new Color(249,244,245)) );
        b1.setBackground(new Color(249,244,245));
        f1.add(b1);
        f1.setResizable(false);       
        f1.getContentPane().setBackground(new Color(249,244,245));
        f1.setLayout(null);
        f1.setSize(400, 600);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f1.dispose();
            try {
                window2();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        });
        
    }

    public void window2() throws IOException{//login
        JFrame f2 = new JFrame("ME E MOOD");
        //solve start art
        JLabel la_fill = new JLabel("please fill username and pass word");//ddddd
        la_fill.setVisible(false);///dddddddddddd
        f2.add(la_fill);///5555
        JLabel la_not_correct = new JLabel("password or user not corret");//ddddd
        la_not_correct.setVisible(false);///dddddddddddd
        f2.add(la_not_correct);//55555555
        la_fill.setBounds(95, 390, 300, 20);//ddddddd
        la_fill.setForeground(new Color(231,40,38));
        la_not_correct.setBounds(120, 390, 300, 20);//5555
        la_not_correct.setForeground(new Color(231,40,38));
        
        ImageIcon login = new ImageIcon("login 2.png");
        JButton b2 = new JButton(login);
        
        BufferedImage lc = ImageIO.read(new File("loco__5_-removebg-preview.png"));
        JLabel loco = new JLabel();
        loco.setIcon(new ImageIcon(lc));
        loco.setBounds(95, 10, 500, 200);
        f2.getContentPane().add(loco);
        
        b2.setBorder ( BorderFactory.createLineBorder(new Color(249,244,245)) );
        b2.setBackground(new Color(249,244,245));
        b2.setBounds(120, 330, 151, 58);
        f2.add(b2);
        
        BufferedImage name = ImageIO.read(new File("button (23).png"));
        JLabel la_user =  new JLabel();
        la_user.setIcon(new ImageIcon(name));
        la_user.setBounds(30, 220, 144, 48);
        f2.getContentPane().add(la_user);
        
        BufferedImage pass = ImageIO.read(new File("button (24).png"));
        JLabel la_pass = new JLabel();
        la_pass.setIcon(new ImageIcon(pass));
        la_pass.setBounds(35, 260, 144, 48);
        f2.getContentPane().add(la_pass);
        
        BufferedImage dont = ImageIO.read(new File("button (19).png"));
        JLabel la_dont = new JLabel();
        la_dont.setIcon(new ImageIcon(dont));
        f2.getContentPane().add(la_dont);
        
        BufferedImage create = ImageIO.read(new File("button (21).png"));
        JLabel la_create = new JLabel();
        la_create.setIcon(new ImageIcon(create));
        f2.getContentPane().add(la_create);
        
        
        JTextField t_user = new JTextField(20);
        t_user.setBackground(new Color(93,87,161));
        t_user.setBorder ( BorderFactory.createLineBorder(new Color(27,21,19),2) );
        t_user.setForeground(Color.WHITE);
        
        JPasswordField t_pass = new JPasswordField(20);
        t_pass.setBackground(new Color(93,87,161));
        t_pass.setBorder ( BorderFactory.createLineBorder(new Color(27,21,19),2) );
        t_pass.setForeground(Color.WHITE);
        
        
        la_dont.setBounds(90, 420, 222, 36);
        
        la_create.setBounds(110, 450, 180, 45);
        
        t_user.setText("");
        t_pass.setText("");
        
        t_user.setBounds(180, 230, 150, 30);
        t_pass.setBounds(180, 270, 150, 30);
        
   
        f2.add(la_user);
        f2.add(la_pass);
        f2.add(la_dont);
        f2.add(la_create);
        
        f2.add(t_user);
        f2.add(t_pass);
        
        f2.getContentPane().setBackground(new Color(249,244,245));
        f2.setLayout(null);
        f2.setSize(400, 600);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);
        f2.setResizable(false);
        //stop art
        la_create.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    f2.dispose();
                    try {
                        window3();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
            }
        });
        b2.addActionListener(new ActionListener() { //button login and check
        public void actionPerformed(ActionEvent e) {
            String userid_input = t_user.getText();
            String password_input = String.valueOf(t_pass.getPassword());
            if (data.get_user_name().contains(userid_input)){
                index = data.get_user_name().indexOf(userid_input);
                String x,y;
                x = (String) data.get_user_name().get(index);
                y = (String) data.get_pass_word().get(index);
                if(y.equals(password_input)){
                    f2.dispose();
                    try {
                        window4();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
                else{
                    la_fill.setVisible(false);//555
                    la_not_correct.setVisible(true);//55555
                }

            }
            if (t_user.getText().equals("") || t_pass.getText().equals("")  ){
                la_fill.setVisible(true);///dddddddddddd
                la_not_correct.setVisible(false);//55555
            }
            else {
                System.out.print("");
            }
        }
        });
        
    }
    public void window3() throws IOException{ //register
        //start art
        JFrame f3 = new JFrame("ME E MOOD");

        BufferedImage ck = ImageIO.read(new File("button (30).png"));
        JLabel la_re_click = new JLabel();
        la_re_click.setIcon(new ImageIcon(ck));
        la_re_click.setBounds(90, 420, 130, 47);
        f3.getContentPane().add(la_re_click);
       
        BufferedImage lg3 = ImageIO.read(new File("button (33).png"));
        JLabel la_re_login = new JLabel();
        la_re_login.setIcon(new ImageIcon(lg3));
        la_re_login.setBounds(202, 422, 88, 47);
        f3.getContentPane().add(la_re_login);
        
        JLabel la_re_save = new JLabel("Save");///555555
        la_re_save.setForeground(new Color(37,116,91));
        la_re_save.setFont(new Font("Save", Font.BOLD, 18));
        la_re_save.setBounds(170, 270, 300, 60);
        
        JLabel la_re_fill = new JLabel("please fill username and pass word");///55555
        la_re_fill.setForeground(new Color(231,40,38));
        la_re_fill.setFont(new Font("please fill username and pass word", Font.BOLD, 14));
        la_re_fill.setBounds(70, 270, 300, 70);
        
        BufferedImage regis_loco = ImageIO.read(new File("Regis_loco__1_-removebg-preview.png"));
        JLabel la_register = new JLabel();
        la_register.setIcon(new ImageIcon(regis_loco));
        la_register.setBounds(75, 30, 250, 100);
        f3.getContentPane().add(la_register);
        
        la_re_save.setVisible(false);///65555
        la_re_fill.setVisible(false);///5555
        f3.add(la_re_save);
        f3.add( la_re_fill);
        
        ImageIcon cancel = new ImageIcon("cancel__2_-removebg-preview.png");
        JButton b3 = new JButton(cancel);
        b3.setBorder ( BorderFactory.createLineBorder(new Color(249,244,245)) );
        b3.setBackground(new Color(249,244,245));
        b3.setBounds(60, 370, 120, 50);
        f3.add(b3);
        
        ImageIcon regis = new ImageIcon("regis__1_-removebg-preview.png");
        JButton b4 = new JButton(regis);
        b4.setBorder ( BorderFactory.createLineBorder(new Color(249,244,245)) );
        b4.setBackground(new Color(249,244,245));
        b4.setBounds(200, 370, 120, 50);
        f3.add(b4);
        
        BufferedImage user = ImageIO.read(new File("user__5_-removebg-preview.png"));
        JLabel la_re_user = new JLabel();
        la_re_user.setIcon(new ImageIcon(user));
        la_re_user.setBounds(25, 150, 144, 40);
        f3.getContentPane().add(la_re_user);
        
        BufferedImage ps = ImageIO.read(new File("ps__1_-removebg-preview.png"));
        JLabel la_re_pass = new JLabel();
        la_re_pass.setIcon(new ImageIcon(ps));
        la_re_pass.setBounds(25, 190, 144, 40);
        f3.getContentPane().add(la_re_pass);
        
        BufferedImage age = ImageIO.read(new File("age__5_-removebg-preview.png"));
        JLabel la_re_age = new JLabel();
        la_re_age.setIcon(new ImageIcon(age));
        la_re_age.setBounds(30, 240, 90, 30);
        f3.getContentPane().add(la_re_age);
        
        BufferedImage sex = ImageIO.read(new File("sex__2_-removebg-preview.png"));
        JLabel la_re_sex = new JLabel();
        la_re_sex.setIcon(new ImageIcon(sex));
        la_re_sex.setBounds(200, 240, 80, 25);
        f3.getContentPane().add(la_re_sex);
        
        JTextField t_re_user = new JTextField(20);
        t_re_user.setBackground(new Color(37,116,91));
        t_re_user.setBorder ( BorderFactory.createLineBorder(new Color(27,21,19),2) );
        t_re_user.setForeground(Color.WHITE);
        
        JPasswordField t_re_pass = new JPasswordField(20);
        t_re_pass.setBackground(new Color(37,116,91));
        t_re_pass.setBorder ( BorderFactory.createLineBorder(new Color(27,21,19),2) );
        t_re_pass.setForeground(Color.WHITE);
        
        JTextField t_re_age = new JTextField(20);
        t_re_age.setBackground(new Color(37,116,91));
        t_re_age.setBorder ( BorderFactory.createLineBorder(new Color(27,21,19),2) );
        t_re_age.setForeground(Color.WHITE);
        
        JTextField t_re_sex = new JTextField(20);
        t_re_sex.setBackground(new Color(37,116,91));
        t_re_sex.setBorder ( BorderFactory.createLineBorder(new Color(27,21,19),2) );
        t_re_sex.setForeground(Color.WHITE);
        
        
        t_re_user.setBounds(170, 160, 180, 25);
        t_re_pass.setBounds(170, 200, 180, 25);
        t_re_age.setBounds(120, 240, 70, 25);
        t_re_sex.setBounds(280, 240, 70, 25);
        
        
        f3.add(t_re_user);
        f3.add(t_re_pass);
        f3.add(t_re_age);
        f3.add(t_re_sex);
        
        f3.getContentPane().setBackground(new Color(249,244,245));
        f3.setLayout(null);
        f3.setSize(400, 600);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setLocationRelativeTo(null);
        f3.setVisible(true);
        f3.setResizable(false);
        
        //stop art
        la_re_login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (t_re_user.getText().equals("") || t_re_pass.getText().equals("")){
                    la_re_fill.setVisible(true);////555555555555555555
                     la_re_save.setVisible(false);///55555555555


                }
                else if (e.getClickCount() == 1) {
                    f3.dispose();
                    try {
                        window2();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (t_re_user.getText().equals("") || t_re_pass.getText().equals("")){
                la_re_fill.setVisible(true);
                
            }
            else{
                la_re_fill.setVisible(false);
                la_re_save.setVisible(true);
                String userid_input = (String)t_re_user.getText();
                String password_input = String.valueOf(t_re_pass.getPassword());
                data.user_pass_re(userid_input,  password_input);
            }
        }
        });
        
        b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f3.dispose();
            try {
                window2();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        });
        
    }
    public void window4() throws IOException{
        //start art
        JFrame f4 = new JFrame("ME E MOOD");
        
        BufferedImage loco4 = ImageIO.read(new File("me__2_-removebg-preview.png"));
        JLabel la_me = new JLabel();
        la_me.setIcon(new ImageIcon(loco4));
        la_me.setBounds(40, 30, 300, 75);
        f4.getContentPane().add(la_me);
        
        BufferedImage adv = ImageIO.read(new File("adv__5_-removebg-preview.png"));
        JLabel la_adv = new JLabel();
        la_adv.setIcon(new ImageIcon(adv));
        la_adv.setBounds(15, 120, 350, 250);
        f4.getContentPane().add(la_adv);
        
        BufferedImage adv1 = ImageIO.read(new File("pg__3_-removebg-preview.png"));
        JLabel la_adv1 = new JLabel();
        la_adv1.setIcon(new ImageIcon(adv1));
        la_adv1.setBounds(20, 260, 350, 250);
        f4.getContentPane().add(la_adv1);
        
        ImageIcon next = new ImageIcon("nt__1_-removebg-preview.png");
        JButton b4 = new JButton(next);
        b4.setBorder ( BorderFactory.createLineBorder(new Color(249,244,245)) );
        b4.setBackground(new Color(249,244,245));
        b4.setBounds(230, 480, 120, 50);
        f4.add(b4);
        
        BufferedImage d = ImageIO.read(new File("button (36).png"));
        JLabel la_day = new JLabel();
        la_day.setIcon(new ImageIcon(d));
        la_day.setBounds(100, 410, 68, 36);
        f4.getContentPane().add(la_day);
        
        JTextField t_day = new JTextField("");
        t_day.setBackground(new Color(37,116,91));
        t_day.setBorder ( BorderFactory.createLineBorder(new Color(27,21,19),2) );
        t_day.setForeground(Color.WHITE);
        t_day.setBounds(170, 415, 120, 25);
        f4.add(t_day);
        
        f4.setLayout(null);
        
        f4.getContentPane().setBackground(new Color(249,244,245));
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.setVisible(true);
        f4.setSize(new Dimension(400, 600));
        f4.setResizable(false);
        f4.setLocationRelativeTo(null);
        //stop art
        
        day = 0;
        
        b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
             if (!t_day.getText().equals("")){
                 f_day =  Integer.parseInt(t_day.getText());
                 f_day = f_day-1;
                 f4.dispose();
                 try {
                     window5_1();
                 } catch (IOException ex) {
                     java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                 }
             }
 
        }
        });
        
    }
        public void window5_1() throws IOException{
       
        JFrame f5 = new JFrame("ME E MOOD");
        
        JRadioButton rb1 = new JRadioButton("",false);
        JRadioButton rb2 = new JRadioButton("",false);
        JRadioButton rb3 = new JRadioButton("",false);
        JRadioButton rb4 = new JRadioButton("",false);
        JRadioButton rb5 = new JRadioButton("",false);
        JRadioButton rb6 = new JRadioButton("",false);
        
        JLabel la_head = new JLabel();
        JLabel la_n = new JLabel();
        JLabel la_mood = new JLabel();
        JLabel la_day = new JLabel();
        JLabel la_dayCount = new JLabel("" + day_duplicate);
        JLabel la_date = new JLabel();
        day_duplicate++;
        
        JTextField t_n = new JTextField("");
        JTextField t_date = new JTextField("");
        
        rb1.setBounds(72, 195, 20, 20);
        rb1.setBackground(new Color(0,97,77));
        
        rb2.setBounds(72, 250, 20, 20);
        rb2.setBackground(new Color(0,97,77));
        
        rb3.setBounds(72, 311, 20, 20);
        rb3.setBackground(new Color(0,97,77));
        
        rb4.setBounds(225, 200, 20, 20);
        rb4.setBackground(new Color(0,97,77));
        
        rb5.setBounds(225, 255, 20, 20);
        rb5.setBackground(new Color(0,97,77));
        
        rb6.setBounds(225, 312, 20, 20);
        rb6.setBackground(new Color(0,97,77));
        
        BufferedImage Head = ImageIO.read(new File("Head.png"));
        la_head.setBounds(65, 8, 260, 60);
        la_head.setIcon(new ImageIcon(Head));
        
        BufferedImage note = ImageIO.read(new File("MoodNote.png"));
        la_n.setBounds(13, 360, 110, 30);
        la_n.setIcon(new ImageIcon(note));
        
        BufferedImage Mymood = ImageIO.read(new File("Mymood.png"));
        la_mood.setBounds(13, 140, 360, 226);
        la_mood.setIcon(new ImageIcon(Mymood));
        
        BufferedImage DayCount = ImageIO.read(new File("DayCount.png"));
        la_day.setBounds(25, 70, 70, 30);
        la_day.setIcon(new ImageIcon(DayCount));
        
        la_dayCount.setBounds(100, 70, 70, 30);
        
        BufferedImage Date = ImageIO.read(new File("Date.png"));
        la_date.setBounds(30, 110, 71, 30);
        la_date.setIcon(new ImageIcon(Date));
        
        t_n.setBounds(13, 390, 360, 110);
        t_n.setBackground(new Color(249,171,216));
        t_n.setBorder ( BorderFactory.createLineBorder(new Color(27,21,19),2) );
        t_n.setForeground(Color.BLACK);
        
        t_date.setBounds(105, 115, 180, 20);
        t_date.setBackground(new Color(231,40,38));
        t_date.setBorder ( BorderFactory.createLineBorder(new Color(27,21,19),2) );
        t_date.setForeground(Color.BLACK);
        
        ImageIcon Save = new ImageIcon("Save.png");
        JButton b5 = new JButton(Save);
        b5.setBorder ( BorderFactory.createLineBorder(new Color(249,244,245)) );
        b5.setBackground(new Color(249,244,245));
        b5.setBounds(250, 510, 120, 38);
        
        f5.add(rb1);
        f5.add(rb2);
        f5.add(rb3);
        f5.add(rb4);
        f5.add(rb5);
        f5.add(rb6);
        f5.add(t_n);
        f5.add(la_n);
        f5.add(la_head);
        f5.add(la_mood);
        f5.add(la_day);
        f5.add(la_dayCount);
        f5.add(la_date);
        f5.add(t_date);
  
        f5.setLayout(null);
        f5.add(b5);
        f5.setSize(400, 600);
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f5.setLocationRelativeTo(null);
        f5.setVisible(true);
        f5.setResizable(false);
        
        group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        group.add(rb4);
        group.add(rb5);
        group.add(rb6);
        
        
        b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(day<f_day){
                if (rb1.isSelected()== true){
                    mood.add(1);
                    f5.dispose();
                    int i=0;
                    try {
                        window5_1();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
                if (rb2.isSelected()== true){
                    mood.add(2);
                    f5.dispose();
                    int i=0;
                    try {
                        window5_1();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
                if (rb3.isSelected()== true){
                    mood.add(3);
                    f5.dispose();
                    int i=0;
                    try {
                        window5_1();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
                if (rb4.isSelected()== true){
                    mood.add(4);
                    f5.dispose();
                    int i=0;
                    try {
                        window5_1();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
                if (rb5.isSelected()== true){
                    mood.add(5);
                    f5.dispose();
                    int i=0;
                    try {
                        window5_1();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
                if (rb6.isSelected()== true){
                    mood.add(6);
                    f5.dispose();
                    int i=0;
                    try {
                        window5_1();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
            }
            else{
                if (rb1.isSelected()== true){
                    mood.add(1);
                    f5.dispose();
                    int i=0;
                    try {
                        window6();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
                if (rb2.isSelected()== true){
                    mood.add(2);
                    f5.dispose();
                    int i=0;
                    try {
                        window6();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
                if (rb3.isSelected()== true){
                    mood.add(3);
                    f5.dispose();
                    int i=0;
                    try {
                        window6();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
                if (rb4.isSelected()== true){
                    mood.add(4);
                    f5.dispose();
                    int i=0;
                    try {
                        window6();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
                if (rb5.isSelected()== true){
                    mood.add(5);
                    f5.dispose();
                    int i=0;
                    try {
                        window6();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
                if (rb6.isSelected()== true){
                    mood.add(6);
                    f5.dispose();
                    int i=0;
                    try {
                        window6();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    day++;
                }
            }
        }
        });
        
    }

    // fix
        public void window6() throws IOException{
        JFrame f6 = new JFrame("ME E MOOD");
        int mood_cal = 0;
        
        
        JLabel la_Day = new JLabel("" + (f_day+1));
        la_Day.setBounds(170, 89, 70, 30);
        la_Day.setForeground(Color.WHITE);
        
        
        JLabel image_good = new JLabel("good");
        image_good.setVisible(false);
        image_good.setBounds(305, 94, 100, 20);
        image_good.setForeground(Color.WHITE);
        
        JLabel image_bad = new JLabel("bad");
        image_bad.setVisible(false);
        image_bad.setBounds(305, 94, 100, 20);
        image_bad.setForeground(Color.WHITE);
        
        JLabel la_headavg = new JLabel();
        BufferedImage Headavg = ImageIO.read(new File("Headavg.png"));
        la_headavg.setBounds(15, 0, 360, 66);
        la_headavg.setIcon(new ImageIcon(Headavg));
        
        JLabel la_urmood = new JLabel();
        BufferedImage urmood = ImageIO.read(new File("urmood.png"));
        la_urmood.setBounds(30, 90, 325, 30);
        la_urmood.setIcon(new ImageIcon(urmood));
        
        JLabel la_good = new JLabel();
        BufferedImage good = ImageIO.read(new File("good.png"));
        la_good.setBounds(15, 140, 357, 290);
        la_good.setIcon(new ImageIcon(good));
        la_good.setVisible(false);
        
        JLabel la_bad = new JLabel();
        BufferedImage bad = ImageIO.read(new File("bad.png"));
        la_bad.setBounds(15, 140, 357, 290);
        la_bad.setIcon(new ImageIcon(bad));
        la_bad.setVisible(false);
        
        ImageIcon Finish = new ImageIcon("Finish.png");
        JButton b6 = new JButton(Finish);
        b6.setBorder ( BorderFactory.createLineBorder(new Color(249,244,245)) );
        b6.setBackground(new Color(249,244,245));
        b6.setBounds(250, 480, 120, 38);
        
        
        for(int i=0;i<mood.size();i++){
            mood_cal = mood_cal + (int)mood.get(i);
        }
        if (((mood_cal*100)/(6*mood.size()))>50){
            //System.out.print("good");
            image_good.setVisible(true);
            la_good.setVisible(true);
        }
        else{
            //System.out.print("bad");
            image_bad.setVisible(true);
            la_bad.setVisible(true);
        }
        
        f6.setLayout(null);
        f6.add(la_Day);
        f6.add(b6);
        f6.add(image_good);
        f6.add(image_bad);
        f6.add(la_headavg);
        f6.add(la_urmood);
        f6.add(la_good);
        f6.add(la_bad);
        f6.setSize(400, 600);
        f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f6.setLocationRelativeTo(null);
        f6.setVisible(true);
        f6.setResizable(false);
        
       
        b6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f6.dispose();
            
        }
        });
        
    }

    


}
