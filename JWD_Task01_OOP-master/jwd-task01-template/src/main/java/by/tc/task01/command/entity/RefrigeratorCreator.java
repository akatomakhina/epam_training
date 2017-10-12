package by.tc.task01.command.entity;

import by.tc.task01.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.util.Map;

public class RefrigeratorCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Integer.parseInt((String) applianceLine.get("POWER_CONSUMPTION")));
        refrigerator.setWeight(Integer.parseInt((String)applianceLine.get("WEIGHT")));
        refrigerator.setFreezerCapacity(Integer.parseInt((String)applianceLine.get("FREEZER_CAPACITY")));
        refrigerator.setOverallCapacity(Double.parseDouble((String)applianceLine.get("OVERALL_CAPACITY")));
        refrigerator.setHeight(Integer.parseInt((String)applianceLine.get("HEIGHT")));
        refrigerator.setWidth(Integer.parseInt((String)applianceLine.get("WIDTH")));
        return refrigerator;
    }
}
