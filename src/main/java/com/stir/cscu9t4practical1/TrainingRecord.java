package com.stir.cscu9t4practical1;

import java.util.ArrayList;
import java.util.List;

public class TrainingRecord {
    private List<TrainingSession> tr;

    public TrainingRecord() {
        tr = new ArrayList<>();
    } //constructor

    // add a record to the list
    public void addTrainingSession(TrainingSession ts) {
        // Check if the training session already exists in the list
        boolean sessionExists = tr.stream()
                .anyMatch(session -> session.getDay() == ts.getDay() &&
                        session.getMonth() == ts.getMonth() &&
                        session.getYear() == ts.getYear());

        if (sessionExists) {
            System.out.println("Training session already exists for this day, month, and year.");
        } else {
            // If the training session is unique, add it to the list
            tr.add(ts);
        }
    }

    // look up the training session of a given day, month, and year
    public String lookupTrainingSession(int d, int m, int y) {
        StringBuilder result = new StringBuilder("No training sessions found");
        for (TrainingSession session : tr) {
            if (session.getDay() == d && session.getMonth() == m && session.getYear() == y) {
                if (result.toString().equals("No training sessions found")) {
                    result = new StringBuilder(session.getTrainingSessionDetails());
                } else {
                    result.append("\n").append(session.getTrainingSessionDetails());
                }
            }
        }
        return result.toString();
    }

    // Clear all training sessions
    public void clearAllTrainingSessions(){
        tr.clear();
    }

    public short getNumberOfTrainingSessions() {
        return (short)tr.size();
    }
} // TrainingRecord