package com.valrae.locationshare;

import java.util.Calendar;

import com.google.android.gms.maps.model.LatLng;

class User {

    /*
     * Users have a - current state
     *              - 
     *            many - past states
     *                 - friends (Users), some of whom are sharing
     *                 - 
     *                 
     * User state - location
     *            - status
     *            - beginning
     *            - end
     */
    
    private String status;
    private LatLng location;
    private Calendar beginning;
    private Calendar end;
    
    User() {
        
    }
    
    User(LatLng loc, String status, Calendar beginning, Calendar end) {
        
    }

    String getStatus() {
        return status;
    }

    LatLng getLocation() {
        return location;
    }

    Calendar getBeginning() {
        return beginning;
    }

    Calendar getEnd() {
        return end;
    }

    void setStatus(String status) {
        this.status = status;
    }

    void setLocation(LatLng location) {
        this.location = location;
    }

    void setBeginning(Calendar beginning) {
        this.beginning = beginning;
    }

    void setEnd(Calendar end) {
        this.end = end;
    }

    // Talks to the server to get necessary information about this user
    public boolean initiate() {
        
        return true;
    }
    
    
}
