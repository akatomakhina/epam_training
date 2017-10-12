package by.tc.task01.dao.impl;

import by.tc.task01.command.ApplianceDirector;
import by.tc.task01.command.Command;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public <E> Appliance find(Criteria<E> criteria) throws IOException {
		File file = new File("src\\main\\resources\\appliances_db.txt");

		String type = criteria.getApplianceType();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		ApplianceDirector director = new ApplianceDirector();
		Command applianceCommand = director.getCommand(type);

		Map<String, Object> parsedLine;

		String line;

		while ((line = reader.readLine())!=null){
			if (type.equals(line.split(" ")[0])){
				parsedLine = parseLine(line);
				if (criteria.subMap(parsedLine)){
					return applianceCommand.execute(parsedLine);
				}
			}
		}
		return null;
	}

	private static Map<String,Object> parseLine (String line){
		Map<String,Object> parsedLine = new HashMap<>();
		Pattern pattern = Pattern.compile("\\s\\S+[=]\\S+[,|;]");
		Matcher matcher = pattern.matcher(line);

		while (matcher.find()) {
			String criterion = line.substring(matcher.start()+1, matcher.end() - 1);
			String[] criteria = criterion.split("=");
			parsedLine.put(criteria[0],criteria[1]);
		}
		return parsedLine;
	}
}
