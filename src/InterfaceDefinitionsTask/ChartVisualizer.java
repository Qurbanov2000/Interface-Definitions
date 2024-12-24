package InterfaceDefinitionsTask;

public class ChartVisualizer implements Visualizer{
    @Override
    public void visualize() {
        System.out.println("Visualizing Chart");
    }

    @Override
    public void execute() {
        System.out.println("Executing Chart");
    }
}
