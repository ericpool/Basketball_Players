package com.example.basketball_players;

import com.google.firebase.database.Exclude;
import java.io.Serializable;

public class basketballPlayers implements Serializable
{
    public String name;
    public int jerseyNum;
    public int age;
    public int height_ft;
    public int height_in;
    //Firebase does not support serializable chars

    public basketballPlayers(String name, int jerseyNum, int age, int height_ft, int height_in)
    {
        this.name = name;
        this.jerseyNum = jerseyNum;
        this.age = age;
        this.height_ft = height_ft;
        this.height_in = height_in;
    }
    public basketballPlayers()
    {

        this.name = "NAME";
        this.jerseyNum = 0;
        this.age = 0;
        this.height_in = 0;
        this.height_ft = 0;

    }
    @Exclude
    public String getAll(){
        return(String.format("%s #%d;  %d-years-old;  %d\'%d\"", this.name,this.jerseyNum,this.age,this.height_ft,this.height_in));
    }
    @Exclude
    public String getName() {
        return name;
    }
    @Exclude
    public void setName(String name) {
        this.name = name;
    }
    @Exclude
    public int getJerseyNum() {
        return jerseyNum;
    }
    @Exclude
    public void setJerseyNum(int jerseyNum) {
        this.jerseyNum = jerseyNum;
    }
    @Exclude
    public int getAge() {
        return age;
    }
    @Exclude
    public void setAge(int age) {
        this.age = age;
    }
    @Exclude
    public int getHeight_ft() {
        return height_ft;
    }
    @Exclude
    public void setHeight_ft(int height_ft) {
        this.height_ft = height_ft;
    }
    @Exclude
    public int getHeight_in() {
        return height_in;
    }
    @Exclude
    public void setHeight_in(int height_in) {
        this.height_in = height_in;
    }

}
