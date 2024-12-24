package InterfaceDefinitionsTask;

public class PDFExporter implements Exporter{
    @Override
    public void export(String format) {
        System.out.println("Exporting PDF file");
    }

    @Override
    public void execute() {
        System.out.println("Executing PDF Exporter");
    }
}
