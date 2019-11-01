class ExcelFile implements MyFile {

    public void open(){
        System.out.println("Open Excel File");
    }

    public void close(){
        System.out.println("Close Excel File");
    }

    public void writeInside(){
        System.out.println("Write inside the Excel File");
    }
}