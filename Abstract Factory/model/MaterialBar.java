package model;

public class MaterialBar implements model.BarInteface{

    public String color;
    public String border;
    public int size;

    public MaterialBar(String color, int size){
        this.color = color;
        this.size = size;
        this.border = "rounded";
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