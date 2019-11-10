import model.*;

class MaterialWidgetFactory implements WidgetFactory {

    @Override
    public Object CreateTimer() {
        return new MaterialTimer("red", 40);
    }

    @Override
    public Object CreateScrollBar() {
        return new MaterialBar("red", 50);
    }
    
}