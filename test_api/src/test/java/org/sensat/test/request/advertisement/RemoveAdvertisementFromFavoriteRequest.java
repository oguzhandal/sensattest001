package org.sensat.test.request.advertisement;

import java.util.List;
import lombok.Data;

@Data
public class RemoveAdvertisementFromFavoriteRequest{
	private List<Integer> advertisementIds;
}
