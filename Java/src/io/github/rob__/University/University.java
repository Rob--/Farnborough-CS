package com.company;

public class University {

    private int rank;
    public String name;
    private String location;
    private String requirements;

    public University(int rank, String name, String location, String requirements){
        this.rank = rank;
        this.name = name;
        this.location = location;
        this.requirements = requirements;
    }

    public int getRank(){
        return this.rank;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public String getName() {
        return "my name is: " + this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setRequirement(String requirements){
        this.requirements = requirements;
    }

    public String getRequirements(){
        return this.requirements;
    }
}
