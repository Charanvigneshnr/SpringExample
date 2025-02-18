package com.loose.coupling;

public class UserManager implements UserDataProvider {
    private final UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserDetails() {
        return userDataProvider.getUserDetails();
    }

    public String dbType() {
        return userDataProvider.getUserDetails().split(" ")[3];
    }
}
