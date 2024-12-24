package InterfaceDefinitionsTask;

import java.util.ArrayList;
import java.util.List;

public class PluginManager{
    private final List<Plugin> plugins;
    public PluginManager(){
        plugins = new ArrayList<Plugin>();
    }
    public void loadPlugins(){
        plugins.add(new DataAnalyzer());
        plugins.add(new ChartVisualizer());
        plugins.add(new AdvancedPlugin());
        plugins.add(new PDFExporter());
    }
    public void runPlugins (){
            for (Plugin p : plugins){
                p.execute();
                if (p instanceof DataAnalyzer){
                    DataAnalyzer da = (DataAnalyzer) p;
                    da.processData("This is Data Analyzer");
                }
                if (p instanceof ChartVisualizer){
                    ChartVisualizer cv = (ChartVisualizer) p;
                    cv.visualize();
                }
                if (p instanceof AdvancedPlugin){
                    AdvancedPlugin a = (AdvancedPlugin) p;
                    a.processData("This is Advanced Plugin");
                }
            }
    }
}
