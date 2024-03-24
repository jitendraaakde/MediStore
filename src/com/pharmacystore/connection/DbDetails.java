package com.pharmacystore.connection;

public interface DbDetails {

	String CONSTR = "YOUR DB URL"; // I used DB named -> pharmacystoredb along with the full url
	String USERNAME = "root";
	String PASSWORD = "YOUR DBMS PASSWORD";
	String DBDRIVER ="com.mysql.cj.jdbc.Driver";		//  "com.mysql.jdbc.Driver"
}
