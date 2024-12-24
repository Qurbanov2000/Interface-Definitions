package InterfaceDefinitionsTask;

public class DataAnalyzer implements DataProcessor{
    @Override
    public void processData(String data) {
        System.out.println(data);
    }

    @Override
    public void execute() {
        System.out.println("Executing DataAnalyzer...");
    }
}
