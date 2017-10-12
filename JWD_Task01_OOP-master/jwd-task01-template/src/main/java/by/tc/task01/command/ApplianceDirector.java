package by.tc.task01.command;

import by.tc.task01.command.entity.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 10.10.2017.
 */
public class ApplianceDirector {
    private Map<String, Command> creator = new HashMap<String, Command>();

    public ApplianceDirector() {
        creator.put("Laptop",new LaptopCreator());
        creator.put("Oven",new OvenCreator());
        creator.put("Refrigerator", new RefrigeratorCreator());
        creator.put("Speakers", new SpeakersCreator());
        creator.put("TabletPC", new TabletPCCreator());
        creator.put("VacuumCleaner", new VacuumCleanerCreator());
    }

    public Command getCommand(String typeName){
        return creator.get(typeName);
    }
}
