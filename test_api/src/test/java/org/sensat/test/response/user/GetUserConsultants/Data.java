package org.sensat.test.response.user.GetUserConsultants;

import java.util.List;

@lombok.Data
public class Data{
	private List<AdvisorFeaturesItem> advisorFeaturesItems;
	private int totalRecords;
}