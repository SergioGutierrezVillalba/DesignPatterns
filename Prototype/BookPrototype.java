abstract class Book implements Cloneable{
    public Book clone() throws CloneNotSupportedException{
        return (Book) super.clone();
    }
}