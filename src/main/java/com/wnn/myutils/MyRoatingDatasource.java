package com.wnn.myutils;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyRoatingDatasource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return MyDatasourceSwitch.getKey();
	}

}
