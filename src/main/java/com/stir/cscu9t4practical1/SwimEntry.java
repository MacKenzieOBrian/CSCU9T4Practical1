package com.stir.cscu9t4practical1;

// Subclass for swim training sessions
public class SwimEntry extends TrainingSession {
    private String where;

    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String where) {
        super(n, d, m, y, h, min, s, dist);
        this.where = where;
    }

    @Override
    public String getTrainingSessionDetails() {
        String result = getName() + " completed a swim training session of " + getDistance() + " km in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + " at " + where;
        return result;
    }

    public String getWhere() {
        return where;
    }
}
