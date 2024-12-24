package InterfaceDefinitionsTask;

public class AdvancedPlugin implements DataProcessor,Exporter{
    @Override
    public void processData(String data) {
        System.out.println(data);
    }

    @Override
    public void export(String format) {
        System.out.println(format);
    }

    @Override
    public void execute() {
        System.out.println("Advanced Plugin");
    }
}
