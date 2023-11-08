package org.sensat.test.advertisement.payload;

import java.util.List;
import lombok.Data;

@Data
public class RemoveAdvertisementFromFavoriteRequest{
	private List<String> advertNos;
}
