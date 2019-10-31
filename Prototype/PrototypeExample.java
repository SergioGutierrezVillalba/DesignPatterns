class PrototypeExample {
    public static void main(String[] args) {
        
        ScienceBook scienceBook = new ScienceBook();
        FictionBook fictionBook = new FictionBook();
        ScienceBook scienceBook2;
        FictionBook fictionBook2;

        try {
            scienceBook2 = scienceBook.clone();
            fictionBook2 = fictionBook.clone();   

        } catch (CloneNotSupportedException c){
            System.out.println(c);
        }
    }
}