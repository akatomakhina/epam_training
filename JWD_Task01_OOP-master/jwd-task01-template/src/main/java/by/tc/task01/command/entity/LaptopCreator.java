package by.tc.task01.command.entity;

import by.tc.task01.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

import java.util.Map;

public class LaptopCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(Double.parseDouble((String)applianceLine.get("BATTERY_CAPACITY")));
        laptop.setCpu(Double.parseDouble((String)applianceLine.get("CPU")));
        laptop.setDisplayInchs(Integer.parseInt((String)applianceLine.get("DISPLAY_INCHS")));
        laptop.setMemoryRom(Integer.parseInt((String)applianceLine.get("MEMORY_ROM")));
        laptop.setOs((String)applianceLine.get("OS"));
        laptop.setSystemMemory(Integer.parseInt((String)applianceLine.get("SYSTEM_MEMORY")));
        return laptop;
    }
}
