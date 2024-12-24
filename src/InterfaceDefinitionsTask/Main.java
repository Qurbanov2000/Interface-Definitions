package InterfaceDefinitionsTask;

public class Main {
    public static void main(String[] args) {
        PluginManager pm = new PluginManager();
        pm.loadPlugins();
        pm.runPlugins();
    }
}
