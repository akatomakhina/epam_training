package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.io.IOException;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		Appliance appliance = null;
		try {
			appliance = applianceDAO.find(criteria);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		

		return appliance;
	}

}