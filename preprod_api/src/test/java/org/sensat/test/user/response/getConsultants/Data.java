package org.sensat.test.user.response.getConsultants;

import java.util.List;

@lombok.Data
public class Data {
    private List<AdvisorFeaturesItem> advisorFeatures;
    private int totalRecords;
}
