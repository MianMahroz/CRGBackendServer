package com.bestercapitalmedia.chiragh.property;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiraghPropertyService {
	
	@Autowired
	private PropertyRepository propertyRepository;
	
	public PropertyDetailFetchDTO getPropertyByRefNo(String refNo) {
		ModelMapper mapper = new ModelMapper();
		Chiraghproperty chiraghproperty = propertyRepository.findPropertyByRefNo(refNo);
		if (chiraghproperty != null)
			return mapper.map(chiraghproperty, PropertyDetailFetchDTO.class);
		else
			return null;
	}

}
