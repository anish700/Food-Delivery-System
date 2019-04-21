/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ThirdFrame {
    int k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12,k13,k14,k15,k16,k17,k18,k19,k20,k21,k22,k23,k24,k25,k26,k27,k28,k29,k30,k31,k32,k33,k34,k35,k36,k37;
    int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,s31,s32,s33,s34,s35,s36,s37;

    private JFrame f2 = new JFrame("Second");
    public JPanel p1x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p2x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p3x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p4x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p5x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p6x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p7x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p8x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p9x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p10x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p11x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p12x = new JPanel(new FlowLayout(FlowLayout.CENTER));

    public JButton order = new JButton("Place Order");
    public JButton back2 = new JButton("Go Back");

    public JLabel details = new JLabel("    ORDER YOUR FOOD   ");
    public JLabel Pizza = new JLabel("Pizza Rs.200/-   ");
    public JLabel Pasta = new JLabel("Pasta Rs.100/-   ");
    public JLabel Burger = new JLabel("Burger Rs.50/-   ");
    public JLabel Hotdog = new JLabel("HotDog Rs.80/-   ");
    public JLabel SoftDrink = new JLabel("SoftDrink Rs.30/-");
    public JLabel or2 = new JLabel("     OR     ");

    public JComboBox jcb = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb2 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb3 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb4 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb5 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb6 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb7 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb8 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb9 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb10 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});

    public JComboBox jcb11 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb12 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb13 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb14 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb15 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb16 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb17 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb18 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb19 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb20 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});

    public JComboBox jcb21 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb22 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb23 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb24 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb25 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb26 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb27 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb28 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb29 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb30 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});

    public JComboBox jcb31 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb32 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb33 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb34 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb35 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb36 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb37 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb38 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb39 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb40 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});

    public JComboBox jcb41 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb42 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb43 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb44 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb45 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb46 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb47 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb48 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb49 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});
    public JComboBox jcb50 = new JComboBox<String>(new String[]{"0", "1", "2", "3", "4", "5"});


    public JButton starters = new JButton("Starters");
    public JButton maincourse = new JButton("Main Course");
    public JButton drinks = new JButton("Beverages");
    public JButton desert = new JButton("Deserts");

    public ThirdFrame() {

        details.setFont(new Font("Algerian", Font.BOLD, 35));
        details.setForeground(Color.BLUE);
        Pizza.setFont(new Font("Monospaced", Font.BOLD, 20));
        Pasta.setFont(new Font("Monospaced", Font.BOLD, 20));
        Burger.setFont(new Font("Monospaced", Font.BOLD, 20));
        Hotdog.setFont(new Font("Monospaced", Font.BOLD, 20));
        SoftDrink.setFont(new Font("Monospaced", Font.BOLD, 20));
        or2.setFont(new Font("Monospaced", Font.BOLD, 25));

        starters.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 30));
        maincourse.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 30));
        drinks.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 30));
        desert.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 30));

        starters.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.orange, Color.red, Color.blue));
        maincourse.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.orange, Color.red, Color.blue));
        drinks.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.orange, Color.red, Color.blue));
        desert.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.orange, Color.red, Color.blue));

        starters.setBackground(Color.white);
        maincourse.setBackground(Color.white);
        drinks.setBackground(Color.white);
        desert.setBackground(Color.white);

        p1x.add(details);
                /*p2x.add(Pizza);
                p2x.add(jcb);
                p3x.add(Pasta);
                p3x.add(jcb2);
                p4x.add(Burger);
                p4x.add(jcb3);
                p5x.add(Hotdog);
                p5x.add(jcb4);
                p6x.add(SoftDrink);
                p6x.add(jcb5);
                p8x.add(order);
                p9x.add(or2);
                p10x.add(back2);*/

        p2x.add(starters);
        p3x.add(maincourse);
        p4x.add(drinks);
        p5x.add(desert);
        p6x.add(order);
        p6x.add(or2);
        p6x.add(back2);

        starters.setPreferredSize(new Dimension(300, 50));
        maincourse.setPreferredSize(new Dimension(300, 50));
        drinks.setPreferredSize(new Dimension(300, 50));
        desert.setPreferredSize(new Dimension(300, 50));

        f2.add(p1x);
        f2.add(p7x);
        f2.add(p2x);
        f2.add(p8x);
        f2.add(p3x);
        f2.add(p9x);
        f2.add(p4x);
        f2.add(p10x);
        f2.add(p5x);
        f2.add(p11x);
        f2.add(p6x);

        order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                                /*String s1 = jcb.getSelectedItem().toString();
                                int n1 = Integer.parseInt(s1);
                                String s2 = jcb2.getSelectedItem().toString();
                                int n2 = Integer.parseInt(s2);
                                String s3 = jcb3.getSelectedItem().toString();
                                int n3 = Integer.parseInt(s3);
                                String s4 = jcb4.getSelectedItem().toString();
                                int n4 = Integer.parseInt(s4);
                                String s5 = jcb5.getSelectedItem().toString();
                                int n5 = Integer.parseInt(s5);
                                double s = (n1*200)+(n2*100)+(n3*50)+(n4*80)+(n5*30);
                                double gst = (s*9)/100;
                                double sum = s+gst;

                                if(n1==0 && n2==0 && n3==0 && n4==0 && n5==0){
                                JOptionPane.showMessageDialog(null, "Please select atleast 1 item to proceed");
                                }
                                else {
                                JOptionPane.showConfirmDialog(null,"You have Ordered\n" + n1 + "  Pizza\n" + n2 + "  Pasta\n" + n3 + "  Burger\n" + n4 + "  HotDog\n" + n5 + "  SoftDrinks\n\nTotal Bill =" + sum + " (includes 9% GST) \nProceed to Pay\n\n");
                                f2.dispose();
                                }*/
                payment();
            }
        });
        back2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f2.dispose();
                new MyLogin();
            }
        });
        back2.setPreferredSize(new Dimension(130, 40));
        back2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        back2.setBackground(Color.white);

        order.setPreferredSize(new Dimension(200, 40));
        order.setFont(new Font("Arial Black", Font.PLAIN, 20));
        order.setBackground(Color.white);

        back2.setBorder(BorderFactory.createLineBorder(Color.black));
        order.setBorder(BorderFactory.createLineBorder(Color.black));

        starters.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //f2.dispose();
                startersAction();
                framest();
            }
        });
        maincourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //f2.dispose();
                framemc();
            }
        });
        drinks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //f2.dispose();
                framedr();
            }
        });
        desert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //f2.dispose();
                frameds();
            }
        });

        starters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                starters.setBackground(Color.WHITE);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                starters.setBackground(Color.YELLOW);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {

            }
        });
        maincourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maincourse.setBackground(Color.WHITE);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maincourse.setBackground(Color.YELLOW);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {

            }
        });
        drinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                drinks.setBackground(Color.WHITE);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drinks.setBackground(Color.YELLOW);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {

            }
        });
        desert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                desert.setBackground(Color.WHITE);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                desert.setBackground(Color.YELLOW);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {

            }
        });

        f2.setLayout(new GridLayout(11, 1));
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setSize(800, 600);
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);
    }

    public void framest() {
        JFrame fst = new JFrame("Starters");
        JPanel stveg = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lbveg = new JLabel("Starters Veg  ");
        JButton veg = new JButton();
        veg.setBackground(Color.GREEN);
        veg.setPreferredSize(new Dimension(25, 25));
        lbveg.setFont(new Font("Arial Blac", Font.ITALIC, 30));
        JButton next = new JButton("Next");
        JButton bac = new JButton("Cancel");

        next.setPreferredSize(new Dimension(100, 40));
        next.setFont(new Font("Arial Black", Font.PLAIN, 18));
        next.setBackground(Color.white);

        back2.setPreferredSize(new Dimension(130, 40));
        back2.setFont(new Font("Arial Black", Font.PLAIN, 18));
        back2.setBackground(Color.white);

        JPanel stnonveg = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lbnonveg = new JLabel("Starters Non Veg ");
        JButton nonveg = new JButton();
        nonveg.setBackground(Color.RED);
        nonveg.setPreferredSize(new Dimension(25, 25));
        lbnonveg.setFont(new Font("Arial Black", Font.ITALIC, 30));

        stveg.add(lbveg);
        stveg.add(veg);
        stnonveg.add(lbnonveg);
        stnonveg.add(nonveg);

        JPanel x1 = new JPanel(new GridLayout(5, 2));
        JPanel x2 = new JPanel(new GridLayout(5, 2));
        JPanel x3 = new JPanel();
        JPanel x4 = new JPanel();
        JPanel x5 = new JPanel();

        JLabel l1 = new JLabel("Veg_Burger_40/-");
        JLabel l2 = new JLabel("Coleslaw_Sandwich_30/-");
        JLabel l3 = new JLabel("Spring_Rolls_60/-");
        JLabel l4 = new JLabel("Garlic_Bread_80/-");
        JLabel l5 = new JLabel("Veg_Pasta_90/-");

        l1.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        l2.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        l3.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        l4.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        l5.setFont(new Font("MonoSpaced", Font.BOLD, 20));

        x1.add(l1);
        x1.add(jcb);
        x1.add(l2);
        x1.add(jcb2);
        x1.add(l3);
        x1.add(jcb3);
        x1.add(l4);
        x1.add(jcb4);
        x1.add(l5);
        x1.add(jcb5);

        fst.add(stveg);
        fst.add(x1);

        JLabel nl1 = new JLabel("Chicken_Burger_80/-");
        JLabel nl2 = new JLabel("Mutton_Sandwich_70/-");
        JLabel nl3 = new JLabel("Omellete_40/-");
        JLabel nl4 = new JLabel("Chilly_Chicken_100/-");
        JLabel nl5 = new JLabel("Chicken_Roll_90/-");

        nl1.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        nl2.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        nl3.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        nl4.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        nl5.setFont(new Font("MonoSpaced", Font.BOLD, 20));

        x2.add(nl1);
        x2.add(jcb6);
        x2.add(nl2);
        x2.add(jcb7);
        x2.add(nl3);
        x2.add(jcb8);
        x2.add(nl4);
        x2.add(jcb9);
        x2.add(nl5);
        x2.add(jcb10);

        x3.add(next);
        x3.add(back2);

        fst.add(x5);
        fst.add(stnonveg);
        fst.add(x2);

        fst.add(x4);
        fst.add(x3);

        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                fst.dispose();
            }
        });
        back2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                fst.dispose();
            }
        });

        fst.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fst.setSize(550, 800);
        fst.setVisible(true);
        fst.setLayout(new GridLayout(7, 1));
        fst.setLocationRelativeTo(null);
    }

    public void framemc() {
        JFrame fmc = new JFrame("Main Course");
        JPanel mcveg = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lbveg = new JLabel("Main Course Veg  ");
        JButton veg = new JButton();
        veg.setBackground(Color.GREEN);
        veg.setPreferredSize(new Dimension(25, 25));
        lbveg.setFont(new Font("Arial Black", Font.ITALIC, 30));
        JButton next = new JButton("Next");
        JButton back = new JButton("Cancel");

        next.setPreferredSize(new Dimension(100, 40));
        next.setFont(new Font("Arial Black", Font.PLAIN, 18));
        next.setBackground(Color.white);

        back.setPreferredSize(new Dimension(130, 40));
        back.setFont(new Font("Arial Black", Font.PLAIN, 18));
        back.setBackground(Color.white);

        JPanel mcnonveg = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lbnonveg = new JLabel("Main Course Non Veg ");
        JButton nonveg = new JButton();
        nonveg.setBackground(Color.RED);
        nonveg.setPreferredSize(new Dimension(25, 25));
        lbnonveg.setFont(new Font("Arial Black", Font.ITALIC, 30));

        mcveg.add(lbveg);
        mcveg.add(veg);
        mcnonveg.add(lbnonveg);
        mcnonveg.add(nonveg);

        JPanel x1 = new JPanel(new GridLayout(5, 2));
        JPanel x2 = new JPanel(new GridLayout(5, 2));
        JPanel x3 = new JPanel();
        JPanel x4 = new JPanel();
        JPanel x5 = new JPanel();

        JLabel l1 = new JLabel("Dal_Tadka_90/-");
        JLabel l2 = new JLabel("Mix_Veg_120/-");
        JLabel l3 = new JLabel("Shahi_Paneer_150/-");
        JLabel l4 = new JLabel("Veg_Fried_Rice_100/-");
        JLabel l5 = new JLabel("Rajma_Chawal_120/-");

        l1.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        l2.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        l3.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        l4.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        l5.setFont(new Font("MonoSpaced", Font.BOLD, 20));

        x1.add(l1);
        x1.add(jcb11);
        x1.add(l2);
        x1.add(jcb12);
        x1.add(l3);
        x1.add(jcb13);
        x1.add(l4);
        x1.add(jcb14);
        x1.add(l5);
        x1.add(jcb15);

        fmc.add(mcveg);
        fmc.add(x1);

        JLabel nl1 = new JLabel("Egg_Curry_100/-");
        JLabel nl2 = new JLabel("Butter_Chicken_180/-");
        JLabel nl3 = new JLabel("Mutton_Do_Pyaza_200/-");
        JLabel nl4 = new JLabel("Chicken_Rice_120/-");
        JLabel nl5 = new JLabel("Chicken_Biriyani_150/-");

        nl1.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        nl2.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        nl3.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        nl4.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        nl5.setFont(new Font("MonoSpaced", Font.BOLD, 20));

        x2.add(nl1);
        x2.add(jcb16);
        x2.add(nl2);
        x2.add(jcb17);
        x2.add(nl3);
        x2.add(jcb18);
        x2.add(nl4);
        x2.add(jcb19);
        x2.add(nl5);
        x2.add(jcb20);

        x3.add(next);
        x3.add(back);

        fmc.add(x5);
        fmc.add(mcnonveg);
        fmc.add(x2);

        fmc.add(x4);
        fmc.add(x3);

        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                fmc.dispose();
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                fmc.dispose();
            }
        });

        fmc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fmc.setSize(550, 800);
        fmc.setVisible(true);
        fmc.setLayout(new GridLayout(7, 1));
        fmc.setLocationRelativeTo(null);
    }

    public void framedr() {
        JFrame fdr = new JFrame("Beverages");
        JPanel x1 = new JPanel();
        JPanel x2 = new JPanel();
        JPanel x3 = new JPanel();
        JPanel x4 = new JPanel();
        JPanel x5 = new JPanel();
        JPanel x6 = new JPanel();
        JPanel x7 = new JPanel();
        JPanel x8 = new JPanel();
        JPanel x9 = new JPanel();
        JPanel x10 = new JPanel();
        JPanel x11 = new JPanel();
        JPanel x12 = new JPanel();

        JButton next = new JButton("Next");
        JButton back = new JButton("Cancel");

        next.setPreferredSize(new Dimension(100, 40));
        next.setFont(new Font("Arial Black", Font.PLAIN, 18));
        next.setBackground(Color.white);

        back.setPreferredSize(new Dimension(130, 40));
        back.setFont(new Font("Arial Black", Font.PLAIN, 18));
        back.setBackground(Color.white);

        JLabel l1 = new JLabel("Fresh_Lime_Soda_40/-      ");
        JLabel l2 = new JLabel("Blueberry_Mocktail_70/-   ");
        JLabel l3 = new JLabel("Virgin_Mojito_60/-        ");
        JLabel l4 = new JLabel("Oreo_Shake_80/-           ");
        JLabel l5 = new JLabel("Banana_Shake_50/-         ");
        JLabel l6 = new JLabel("Cappuccino_60/-           ");
        JLabel l7 = new JLabel("Cold_Coffee_70/-          ");
        JLabel l8 = new JLabel("Tea_30/-                  ");
        JLabel l9 = new JLabel("Ice_Tea_50/-              ");
        JLabel l10 = new JLabel("Soft_Drink_MRP         ");

        l1.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l2.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l3.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l4.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l5.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l6.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l7.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l8.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l9.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l10.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));

        x1.add(l1);
        x1.add(jcb21);
        x2.add(l2);
        x2.add(jcb22);
        x3.add(l3);
        x3.add(jcb23);
        x4.add(l4);
        x4.add(jcb24);
        x5.add(l5);
        x5.add(jcb25);
        x6.add(l6);
        x6.add(jcb26);
        x7.add(l7);
        x7.add(jcb27);
        x8.add(l8);
        x8.add(jcb28);
        x9.add(l9);
        x9.add(jcb29);
        x10.add(l10);
        x10.add(jcb30);

        x12.add(next);
        x12.add(back);

        fdr.add(x1);
        fdr.add(x2);
        fdr.add(x3);
        fdr.add(x4);
        fdr.add(x5);
        fdr.add(x6);
        fdr.add(x7);
        fdr.add(x8);
        fdr.add(x9);
        fdr.add(x10);
        fdr.add(x11);
        fdr.add(x12);

        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                fdr.dispose();
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                fdr.dispose();
            }
        });

        fdr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fdr.setSize(550, 800);
        fdr.setVisible(true);
        fdr.setLayout(new GridLayout(12, 1));
        fdr.setLocationRelativeTo(null);
        fdr.pack();
    }

    public void frameds() {
        JFrame fds = new JFrame("Deserts");
        JPanel x1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel x2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel x3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel x4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel x5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel x6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel x7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel x8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel x9 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel x10 = new JPanel();
        JPanel x11 = new JPanel();
        JPanel x12 = new JPanel();

        JButton next = new JButton("Next");
        JButton back = new JButton("Cancel");

        next.setPreferredSize(new Dimension(100, 40));
        next.setFont(new Font("Arial Black", Font.PLAIN, 18));
        next.setBackground(Color.white);

        back.setPreferredSize(new Dimension(130, 40));
        back.setFont(new Font("Arial Black", Font.PLAIN, 18));
        back.setBackground(Color.white);

        JLabel l1 = new JLabel("Ice_Cream_60/-                                ");
        JLabel l2 = new JLabel("Peanut_Butter_Waffle_120/-                 ");
        JLabel l3 = new JLabel("Chocolate_Tart_50/-                           ");
        JLabel l4 = new JLabel("Pinapple_Pastrey_40/-                       ");
        JLabel l5 = new JLabel("Doughnut_70/-                                   ");
        JLabel l6 = new JLabel("Choco_Browniwe_70/-                       ");
        JLabel l7 = new JLabel("Jalebi_50/-                                         ");
        //JLabel l8 = new JLabel("Tea                                       ");
        //JLabel l9 = new JLabel("Ice Tea                                   ");
        //JLabel l10 = new JLabel("Soft Drinks                              ");

        l1.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l2.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l3.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l4.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l5.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l6.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        l7.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        //l8.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        //l9.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));
        //l10.setFont(new Font("Arial Round MT Bold", Font.BOLD, 25));

        x1.add(l1);
        x1.add(jcb31);
        x2.add(l2);
        x2.add(jcb32);
        x3.add(l3);
        x3.add(jcb33);
        x4.add(l4);
        x4.add(jcb34);
        x5.add(l5);
        x5.add(jcb35);
        x6.add(l6);
        x6.add(jcb36);
        x7.add(l7);
        x7.add(jcb37);
        //x8.add(l8);
        //x8.add(jcb8);
        //x9.add(l9);
        //x9.add(jcb9);
        //x10.add(l10);
        //x10.add(jcb10);

        x12.add(next);
        x12.add(back);

        fds.add(x11);
        fds.add(x1);
        fds.add(x2);
        fds.add(x3);
        fds.add(x4);
        fds.add(x5);
        fds.add(x6);
        fds.add(x7);
        fds.add(x8);
        fds.add(x9);
        fds.add(x10);
        //fds.add(x11);
        fds.add(x12);

        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                fds.dispose();
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                fds.dispose();
            }
        });

        fds.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fds.setSize(550, 800);
        fds.setVisible(true);
        fds.setLayout(new GridLayout(12, 1));
        fds.setLocationRelativeTo(null);
        fds.pack();
    }

    public void payment() {
        JFrame pay = new JFrame("Payment Mode");
        JButton cod = new JButton("Pay On Delivery");
        JButton card = new JButton("Debit/Credit");
        JButton upi = new JButton("UPI");
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel lb = new JLabel("Choose Your Method of Payment");
        lb.setFont(new Font("Arial Round MT Bold", Font.ITALIC, 30));

        cod.setBorder(BorderFactory.createLineBorder(Color.black));
        card.setBorder(BorderFactory.createLineBorder(Color.black));
        upi.setBorder(BorderFactory.createLineBorder(Color.black));

        cod.setPreferredSize(new Dimension(200, 40));
        cod.setFont(new Font("Arial Black", Font.PLAIN, 20));
        cod.setBackground(Color.white);

        card.setPreferredSize(new Dimension(200, 40));
        card.setFont(new Font("Arial Black", Font.PLAIN, 20));
        card.setBackground(Color.white);

        upi.setPreferredSize(new Dimension(200, 40));
        upi.setFont(new Font("Arial Black", Font.PLAIN, 20));
        upi.setBackground(Color.white);

        p1.add(lb);
        pay.add(p1);

        p2.add(cod);
        p2.add(card);
        p2.add(upi);
        pay.add(p2);

        cod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cod.setBackground(Color.WHITE);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cod.setBackground(Color.YELLOW);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //newaccount.setBackground(Color.BLACK);
                //newaccount.setForeground(Color.WHITE);
            }
        });

        card.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                card.setBackground(Color.WHITE);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                card.setBackground(Color.YELLOW);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //newaccount.setBackground(Color.BLACK);
                //newaccount.setForeground(Color.WHITE);
            }
        });

        upi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                upi.setBackground(Color.WHITE);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upi.setBackground(Color.YELLOW);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //newaccount.setBackground(Color.BLACK);
                //newaccount.setForeground(Color.WHITE);
            }
        });

        cod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                pay.dispose();
                f2.dispose();
                JOptionPane.showMessageDialog(null, "Your Order is Placed !");
                new MyLogin();
            }
        });
        card.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                pay.dispose();
                f2.dispose();
                JOptionPane.showMessageDialog(null, "Your Order is Placed !");
                new MyLogin();
            }
        });
        upi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                pay.dispose();
                f2.dispose();
                JOptionPane.showMessageDialog(null, "Your Order is Placed !");
                new MyLogin();
            }
        });

        pay.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pay.setSize(800, 300);
        pay.setVisible(true);
        pay.setLayout(new GridLayout(2, 1));
        pay.setLocationRelativeTo(null);
    }
public void startersAction(){

}
}
