package org.sensat.test.user.response.getStoresByUser;

import java.util.List;
import lombok.Data;

@Data
public class DataItem{
	private String storeManagerPhone;
	private int storeType;
	private String commercialTitle;
	private String documentNumber;
	private String managerSurname;
	private String about;
	private int cityId;
	private int townId;
	private int storeId;
	private String title;
	private String managerName;
	private String logoUrl;
	private int storeStatus;
	private Object rejectedInfo;
	private List<String> authorizedDealerCertificateUrls;
	private String storeNo;
	private String vehicleTradeAuthorizationCertificateUrl;
	private String storeManagerName;
}