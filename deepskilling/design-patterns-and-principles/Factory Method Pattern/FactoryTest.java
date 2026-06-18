public class FactoryTest {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        DocumentFactory pdfFactory = new PdfFactory();
        DocumentFactory excelFactory = new ExcelFactory();

        wordFactory.newDocument();
        pdfFactory.newDocument();
        excelFactory.newDocument();
    }
}