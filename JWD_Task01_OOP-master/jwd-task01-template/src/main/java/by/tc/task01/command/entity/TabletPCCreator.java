package by.tc.task01.command.entity;

import by.tc.task01.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

import java.util.Map;

public class TabletPCCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(Integer.parseInt((String)applianceLine.get("BATTERY_CAPACITY")));
        tabletPC.setDisplayInches(Integer.parseInt((String)applianceLine.get("DISPLAY_INCHES")));
        tabletPC.setMemoryRom(Integer.parseInt((String)applianceLine.get("MEMORY_ROM")));
        tabletPC.setColor((String)applianceLine.get("COLOR"));
        return tabletPC;
    }
}
