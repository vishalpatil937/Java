package com.xoriant.dao;

import java.sql.Connection;


public class ConnectionManagerImpl implements ConnectionManager {

	@Override
	public Connection getDBConnection(String url, String user, String pwd) {
		return null;
	}

	@Override
	public void closeConnection() {
		
	}

	
}
