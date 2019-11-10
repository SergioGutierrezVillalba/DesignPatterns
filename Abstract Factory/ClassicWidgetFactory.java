import model.*;

class ClassicWidgetFactory implements WidgetFactory{

    public ClassicWidgetFactory(){}

    @Override
    public Object CreateTimer() {
        return new ClassicTimer("blue", 50);
    }

    @Override
    public Object CreateScrollBar() {
        return new ClassicBar("blue", 40);
    }
}