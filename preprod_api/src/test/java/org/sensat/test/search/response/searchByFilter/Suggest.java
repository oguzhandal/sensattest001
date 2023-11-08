package org.sensat.test.search.response.searchByFilter;

import java.util.List;
import lombok.Data;

@Data
public class Suggest{
	private List<String> input;
	private Object weight;
	private Object contexts;
}