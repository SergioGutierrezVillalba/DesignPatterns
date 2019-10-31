class FictionBook extends Book {
    
    @Override
    public FictionBook clone() throws CloneNotSupportedException {
        System.out.println("Fiction Book Prototype Clone!");
        return (FictionBook)super.clone();
    }
}