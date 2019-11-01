class FactoryExample {
    public static void main(String[] args) {

        TextEditor txtEditor = new TextEditor();
        PDFFile aPDF = (PDFFile)txtEditor.createFile("PDF");
        ExcelFile aExcel = (ExcelFile)txtEditor.createFile("");

        txtEditor.editFile(aPDF);
        txtEditor.editFile(aExcel);
    }
}