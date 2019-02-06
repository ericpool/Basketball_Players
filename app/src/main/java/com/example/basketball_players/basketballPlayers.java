package com.example.basketball_players;

public class basketballPlayers {
    private String name;
    private int jerseyNum;
    private int age;
    private int height_ft;
    private int height_in;


    public basketballPlayers(String name, int jerseyNum, int age, int height_ft, int height_in){
        this.name = name;
        this.jerseyNum = jerseyNum;
        this.age = age;
        this.height_ft = height_ft;
        this.height_in = height_in;
    }
    public String getAll(){
        return(String.format("%s #%d;  %d-years-old;  %d\'%d\"", this.name,this.jerseyNum,this.age,this.height_ft,this.height_in));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJerseyNum() {
        return jerseyNum;
    }

    public void setJerseyNum(int jerseyNum) {
        this.jerseyNum = jerseyNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight_ft() {
        return height_ft;
    }

    public void setHeight_ft(int height_ft) {
        this.height_ft = height_ft;
    }

    public int getHeight_in() {
        return height_in;
    }

    public void setHeight_in(int height_in) {
        this.height_in = height_in;
    }

}
