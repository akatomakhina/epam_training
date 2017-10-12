package by.tc.task01.command.entity;

import by.tc.task01.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import java.util.Map;

public class OvenCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        Oven oven = new Oven();
        oven.setPowerConsumption(Integer.parseInt((String) applianceLine.get("POWER_CONSUMPTION")));
        oven.setWeight(Integer.parseInt((String)applianceLine.get("WEIGHT")));
        oven.setCapacity(Integer.parseInt((String)applianceLine.get("CAPACITY")));
        oven.setDepth(Integer.parseInt((String)applianceLine.get("DEPTH")));
        oven.setHeight(Double.parseDouble((String)applianceLine.get("HEIGHT")));
        oven.setWidth(Double.parseDouble((String)applianceLine.get("WIDTH")));
        return oven;
    }
}
