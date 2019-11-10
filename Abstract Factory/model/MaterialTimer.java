package model;

import java.util.Date;

public class MaterialTimer implements model.TimerInterface {

    public String color;
    public String border;
    public int size;

    public MaterialTimer(String color, int size){
        this.color = color;
        this.size = size;
        this.border = "rounded";
    }

    @Override
    public Date giveMeTheTime() {
        return new Date();
    }

}