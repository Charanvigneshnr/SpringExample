package com.loose.coupling;

public class LocalDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User details from local database";
    }
}
