import model.*;

class AbstractFactoryExample {
    public static void main(String[] args) {

        MaterialWidgetFactory materialWidgetFactory = new MaterialWidgetFactory();
        ClassicWidgetFactory classicWidgetFactory = new ClassicWidgetFactory();

        MaterialBar matBar = (MaterialBar) materialWidgetFactory.CreateScrollBar();
        MaterialTimer matTimer = (MaterialTimer) materialWidgetFactory.CreateTimer();

        ClassicBar classicBar = (ClassicBar) classicWidgetFactory.CreateScrollBar();
        ClassicTimer classicTimer = (ClassicTimer) classicWidgetFactory.CreateTimer();

        System.out.println("We are material widgets : ");
        System.out.println("(Matbar says): my border is " + matBar.border + " and my color is " + matBar.color);
        System.out.println("(MaterialTimer says): my border is " + matTimer.border + " and my color is " + matTimer.color);

        System.out.println("========================================");

        System.out.println("We are classic widgets : ");
        System.out.println("(ClassicBar says): my border is " + classicBar.border + " and my color is " + classicBar.color);
        System.out.println("(ClassicTimer says): my border is " + classicTimer.border + " and my color is " + classicTimer.color);

    }
}