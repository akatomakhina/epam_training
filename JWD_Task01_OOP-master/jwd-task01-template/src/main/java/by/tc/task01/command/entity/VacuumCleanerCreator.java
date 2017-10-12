package by.tc.task01.command.entity;

import by.tc.task01.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

import java.util.Map;

public class VacuumCleanerCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(Integer.parseInt((String)applianceLine.get("POWER_CONSUMPTION")));
        vacuumCleaner.setFilterType((String)applianceLine.get("FILTER_TYPE"));
        vacuumCleaner.setBagType((String)applianceLine.get("BAG_TYPE"));
        vacuumCleaner.setWandType((String)applianceLine.get("WAND_TYPE"));
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt((String)applianceLine.get("MOTOR_SPEED_REGULATION")));
        vacuumCleaner.setCleaningWidth(Integer.parseInt((String)applianceLine.get("CLEANING_WIDTH")));
        return vacuumCleaner;
    }
}
