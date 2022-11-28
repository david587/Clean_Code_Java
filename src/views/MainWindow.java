/*
 * File: Main.java
 * Created Date: 2022-11-28
 * Author: Baráth Dávid
 * Github: https://github.com/david587
 * Copyright (c) 2020-2022 Baráth Dávid
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
    
    public MainWindow() {
        setPanels();
        setLayouts();
        setLabels();
        setField();
        setButtonsTexts();
        addSidepanels();
        addButtonpanels();
        addPerimeterpanels();
        addAreapanels();
        addMainview();
        exitOnClose();
    }

    public void setPanels(){
        this.asidePanel = new JPanel();
        this.bsidePanel = new JPanel();
        this.buttonsPanel = new JPanel();
        this.perimeterPanel = new JPanel();
        this.areaPanel = new JPanel();
    }
    public void setLayouts(){
        this.asidePanel.setLayout(new BoxLayout(this.asidePanel, BoxLayout.LINE_AXIS));
        this.bsidePanel.setLayout(new BoxLayout(this.bsidePanel, BoxLayout.LINE_AXIS));
        this.perimeterPanel.setLayout(new BoxLayout(this.perimeterPanel, BoxLayout.LINE_AXIS));
        this.areaPanel.setLayout(new BoxLayout(this.areaPanel, BoxLayout.LINE_AXIS));
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
    }
    
    public void setLabels(){
        this.titleLabel = new JLabel("Téglalap kerület, terület");
        this.asideLabel = new JLabel("a oldal");
        this.bsideLabel = new JLabel("b oldal");
        this.areaLabel = new JLabel("Terület");
        this.perimeterLabel = new JLabel("Kerület");
    }
    public void setField(){
        this.asideField = new JTextField();
        this.bsideField = new JTextField();
        this.areaField = new JTextField();
        this.perimeterField = new JTextField();
    }

    public void setButtonsTexts(){
        this.calcButton = new JButton("Számít");
        this.aboutButton = new JButton("Névjegy");
    }

    public void addSidepanels(){
        this.asidePanel.add(this.asideLabel);
        this.asidePanel.add(this.asideField);
        this.bsidePanel.add(this.bsideLabel);
        this.bsidePanel.add(this.bsideField);
    }

    public void addButtonpanels(){
        this.buttonsPanel.add(this.calcButton);
        this.buttonsPanel.add(this.aboutButton);
    }

    public void addPerimeterpanels(){
        this.perimeterPanel.add(this.perimeterLabel);
        this.perimeterPanel.add(this.perimeterField);
    }

    public void addAreapanels(){
        this.areaPanel.add(this.areaLabel);
        this.areaPanel.add(this.areaField);
    }

    public void addMainview(){
        this.add(this.titleLabel);
        this.add(this.asidePanel);
        this.add(this.bsidePanel);
        this.add(this.buttonsPanel);
        this.add(this.perimeterPanel);
        this.add(this.areaPanel);
    }

    public void exitOnClose(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
