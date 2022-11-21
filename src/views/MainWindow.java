/*
 * File: MainWindow.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * 
 * GNU GPL v2
 */

package views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow extends JFrame {
    public JLabel titleLabel;
    public JPanel asidePanel;
    public JLabel asideLabel;
    public JTextField asideField;    
    public JPanel bsidePanel;
    public JLabel bsideLabel;
    public JTextField bsideField;
    public JPanel buttonsPanel;
    public JButton calcButton;
    public JButton aboutButton;
    public JPanel perimeterPanel;
    public JLabel perimeterLabel;
    public JTextField perimeterField;
    public JPanel areaPanel;
    public JLabel areaLabel;
    public JTextField areaField;
    /*
     * Az oldal és b oldal bekérése egyetlen felhasználói felületen 
     * történik. Középen lesz két gomb. Az egyik a számító, másik
     * a névjegy gomb. Talán jobb lenne külön panelen az eredmény,
     * vagy lehet felesleges. Itt most egyelőre a főablakon fog
     * megjelenni.
     * 
     */
    public MainWindow() {
        this.titleLabel = new JLabel("Téglalap kerület, terület");
        this.asidePanel = new JPanel();
        this.asideLabel = new JLabel("a oldal");
        this.asideField = new JTextField();
        this.bsidePanel = new JPanel();
        this.bsideLabel = new JLabel("b oldal");
        this.bsideField = new JTextField();
        this.buttonsPanel = new JPanel();
        this.calcButton = new JButton("Számít");
        this.aboutButton = new JButton("Névjegy");
        this.perimeterPanel = new JPanel();
        this.perimeterLabel = new JLabel("Kerület");
        this.perimeterField = new JTextField();
        this.areaPanel = new JPanel();
        this.areaLabel = new JLabel("Terület");
        this.areaField = new JTextField();

        this.asidePanel.setLayout(new BoxLayout(this.asidePanel, BoxLayout.LINE_AXIS));
        this.bsidePanel.setLayout(new BoxLayout(this.bsidePanel, BoxLayout.LINE_AXIS));
        this.perimeterPanel.setLayout(new BoxLayout(this.perimeterPanel, BoxLayout.LINE_AXIS));
        this.areaPanel.setLayout(new BoxLayout(this.areaPanel, BoxLayout.LINE_AXIS));

        this.asidePanel.add(this.asideLabel);
        this.asidePanel.add(this.asideField);
        this.bsidePanel.add(this.bsideLabel);
        this.bsidePanel.add(this.bsideField);
        
        this.buttonsPanel.add(this.calcButton);
        this.buttonsPanel.add(this.aboutButton);
        this.perimeterPanel.add(this.perimeterLabel);
        this.perimeterPanel.add(this.perimeterField);
        this.areaPanel.add(this.areaLabel);
        this.areaPanel.add(this.areaField);


        this.add(this.titleLabel);
        this.add(this.asidePanel);
        this.add(this.bsidePanel);
        this.add(this.buttonsPanel);
        this.add(this.perimeterPanel);
        this.add(this.areaPanel);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    
}
