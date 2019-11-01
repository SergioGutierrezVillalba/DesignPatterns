class TextEditor implements Editor {

    TextEditor(){}

    @Override
    public MyFile createFile(String fileType){
        if(fileType == "PDF"){
            return new PDFFile();
        } 
        else {
            // this program returns an excel file by default.
            return new ExcelFile();
        }
    }

    @Override
    public void editFile(MyFile file){
        file.open();
        file.writeInside();
        file.close();
    }

}