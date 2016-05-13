package com.sx.models;

public enum SubscrType {TWELVE(12, "12 Sessies (12 weken)"), TWENTYFOUR(24, "24 Sessies (12 weken)");

    private int sessions;
    private String discription;


    private SubscrType(int sessions, String discription){
        this.sessions = sessions;
        this.discription = discription;
    }

    public int getSessions() {
        return sessions;
    }

    public void setSessions(int sessions) {
        this.sessions = sessions;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
