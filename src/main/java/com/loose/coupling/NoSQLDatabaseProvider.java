package com.loose.coupling;

public class NoSQLDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User details from NoSQL database";
    }
}
