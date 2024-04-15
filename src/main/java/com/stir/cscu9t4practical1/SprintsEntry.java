package com.stir.cscu9t4practical1;

// Subclass for run/sprints training sessions
public class SprintsEntry extends TrainingSession {
    private int numberOfSprints; // Additional attribute for number of sprint
    private int revovery;

    public SprintsEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int numSprints, int rev) {
        super(n, d, m, y, h, min, s, dist);
        this.numberOfSprints = numSprints;
        this.revovery = rev;
    }

    @Override
    public String getTrainingSessionDetails() {
        String result = getName() + " completed a run/sprints training session of " + getDistance() + " km with "
                + numberOfSprints + " sprints in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear();
        return result;
    }


    public int getNumberofSprints() {
        return numberOfSprints;
    }

    public int getRecovery() {
        return revovery;
    }


}
