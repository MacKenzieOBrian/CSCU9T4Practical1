// GUI and main program for the Training Record
package com.stir.cscu9t4practical1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainingRecordGUI extends JFrame implements ActionListener {

    private JButton addRun = new JButton("Add Run");
    private JButton addSwim = new JButton("Add Swim");
    private JButton addCycle = new JButton("Add Cycle");
    private JButton lookUpByDate = new JButton("Look Up Date");

    private JTextField nameField = new JTextField(30);
    private JTextField dayField = new JTextField(2);
    private JTextField monthField = new JTextField(2);
    private JTextField yearField = new JTextField(4);
    private JTextField hoursField = new JTextField(2);
    private JTextField minsField = new JTextField(2);
    private JTextField secsField = new JTextField(2);
    private JTextField distField = new JTextField(4);

    private JTextArea outputArea = new JTextArea(5, 50);

    private TrainingRecord myAthletes = new TrainingRecord();

    public static void main(String[] args) {
        TrainingRecordGUI applic = new TrainingRecordGUI();
    } // main

    // set up the GUI
    public TrainingRecordGUI() {
        super("Training Record");
        setLayout(new FlowLayout());

        add(new JLabel(" Name:"));
        add(nameField);
        nameField.setEditable(true);

        add(new JLabel(" Day:"));
        add(dayField);
        dayField.setEditable(true);

        add(new JLabel(" Month:"));
        add(monthField);
        monthField.setEditable(true);

        add(new JLabel(" Year:"));
        add(yearField);
        yearField.setEditable(true);

        add(new JLabel(" Hours:"));
        add(hoursField);
        hoursField.setEditable(true);

        add(new JLabel(" Mins:"));
        add(minsField);
        minsField.setEditable(true);

        add(new JLabel(" Secs:"));
        add(secsField);
        secsField.setEditable(true);

        add(new JLabel(" Distance (km):"));
        add(distField);
        distField.setEditable(true);

        add(addRun);
        addRun.addActionListener(this);

        add(addSwim);
        addSwim.addActionListener(this);

        add(addCycle);
        addCycle.addActionListener(this);

        add(lookUpByDate);
        lookUpByDate.addActionListener(this);

        add(outputArea);
        outputArea.setEditable(false);

        setSize(720, 200);
        setVisible(true);

        blankDisplay();
    } // constructor

    // listen for and respond to GUI events
    // listen for and respond to GUI events
    public void actionPerformed(ActionEvent event) {
        String message = "";
        if (event.getSource() == addRun) {
            message = addTrainingSession("run", Integer.parseInt(dayField.getText()), Integer.parseInt(monthField.getText()), Integer.parseInt(yearField.getText()), Integer.parseInt(hoursField.getText()), Integer.parseInt(minsField.getText()), Integer.parseInt(secsField.getText()), Float.parseFloat(distField.getText()));
        } else if (event.getSource() == addSwim) {
            message = addTrainingSession("swim", Integer.parseInt(dayField.getText()), Integer.parseInt(monthField.getText()), Integer.parseInt(yearField.getText()), Integer.parseInt(hoursField.getText()), Integer.parseInt(minsField.getText()), Integer.parseInt(secsField.getText()), Float.parseFloat(distField.getText()));
        } else if (event.getSource() == addCycle) {
            message = addTrainingSession("cycle",Integer.parseInt(dayField.getText()), Integer.parseInt(monthField.getText()), Integer.parseInt(yearField.getText()), Integer.parseInt(hoursField.getText()), Integer.parseInt(minsField.getText()), Integer.parseInt(secsField.getText()), Float.parseFloat(distField.getText()));
        } else if (event.getSource() == lookUpByDate) {
            message = lookupTrainingSession();
        }
        outputArea.setText(message);
        blankDisplay();
    } // actionPerformed

    // add a new training session to the training record
    public String addTrainingSession( String name, int day, int month, int year, int hours, int minutes, int seconds, float dist) {
        TrainingSession session = new TrainingSession(name, day, month, year, hours, minutes, seconds, dist);
        myAthletes.addTrainingSession(session);
        return "Training session added successfully.";
    }

    // look up a training session in the training record
    public String lookupTrainingSession() {
        int m = Integer.parseInt(monthField.getText());
        int d = Integer.parseInt(dayField.getText());
        int y = Integer.parseInt(yearField.getText());
        outputArea.setText("looking up training session ...");
        String message = myAthletes .lookupTrainingSession(d, m, y);
        return message;
    } // lookupTrainingSession

    // clear the display
    public void blankDisplay() {
        nameField.setText("");
        dayField.setText("");
        monthField.setText("");
        yearField.setText("");
        hoursField.setText("");
        minsField.setText("");
        secsField.setText("");
        distField.setText("");
    } // blankDisplay
} // TrainingRecordGUI