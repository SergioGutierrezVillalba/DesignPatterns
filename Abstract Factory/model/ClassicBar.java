package model;

public class ClassicBar implements model.BarInteface {

    public String color;
    public String border;
    public int size;

    public ClassicBar(String color, int size){
        this.color = color;
        this.size = size;
        this.border = "squared";
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    
}