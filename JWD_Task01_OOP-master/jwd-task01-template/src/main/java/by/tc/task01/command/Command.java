package by.tc.task01.command;

import by.tc.task01.entity.Appliance;

import java.util.Map;

/**
 * Created by user on 10.10.2017.
 */
public interface Command {
    Appliance execute(Map<String, Object> applianceLine);
}
