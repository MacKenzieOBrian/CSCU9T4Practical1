package com.stir.cscu9t4practical1;

// Subclass for cycle training sessions
public class CycleEntry extends TrainingSession {
    private String terrain;
    private String tempo;

    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String t, String tem) {
        super(n, d, m, y, h, min, s, dist);
        terrain = t;
        tempo = tem;
    }

    @Override
    public String getTrainingSessionDetails() {
        return getName() + " cycled " + getDistance() + " km in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + " on "
                + terrain + " at " + tempo + " tempo";
    }

    public String getTerrain() {
        return terrain;
    }

    public String getTempo() {
        return tempo;
    }
}