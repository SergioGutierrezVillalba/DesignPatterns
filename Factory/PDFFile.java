class PDFFile implements MyFile {

    public void open(){
        System.out.println("Open PDF File");
    }

    public void close(){
        System.out.println("Close PDF File");
    }

    public void writeInside(){
        System.out.println("By default is not allowed to edit a PDF!");
    }
}