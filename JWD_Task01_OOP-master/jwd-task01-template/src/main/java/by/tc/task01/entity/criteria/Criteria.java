package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private String applianceType;

	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getCriteria(){
		return criteria;
	}

	public String getApplianceType() {
		return applianceType;
	}

	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}

	public boolean subMap (Map<String, Object> parsedLine){
		for(Map.Entry<E,Object> pair : criteria.entrySet()){
				if (parsedLine.equals(parsedLine.get(pair.getKey().toString()).toString()+"="+pair.getValue().toString().trim())){
					return true;
				}
			}
			return false;
			/*String first = parsedLine.get(pair.getKey().toString()).toString();
			String second = pair.getValue().toString();
			if (!(first.equals(second))){
				return false;
			}*/
	}
}
