package model;

import java.util.Date;

public class ClassicTimer implements model.TimerInterface {

    public String color;
    public String border;
    public int size;

    public ClassicTimer(String color, int size) {
        this.color = color;
        this.size = size;
        this.border = "squared";
    }

	@Override
    public Date giveMeTheTime() {
        return new Date();
    }
}