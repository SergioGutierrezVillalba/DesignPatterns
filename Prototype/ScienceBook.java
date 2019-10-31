class ScienceBook extends Book {

    @Override
    public ScienceBook clone() throws CloneNotSupportedException {
        System.out.println("Science Book Prototype Clone!");
        return (ScienceBook) super.clone();
    }
}