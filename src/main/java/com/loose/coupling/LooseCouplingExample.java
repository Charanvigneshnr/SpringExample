package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider localdb = new LocalDatabaseProvider();
        UserManager locDb = new UserManager(localdb);
        UserDataProvider webdb = new WebDatabaseProvider();
        UserManager websDb = new UserManager(webdb);
        UserDataProvider nosqldb = new NoSQLDatabaseProvider();
        UserManager noSqlDb = new UserManager(nosqldb);
        System.out.println(locDb.getUserDetails() + "\t" + locDb.dbType());
        System.out.println(websDb.getUserDetails() + "\t" + websDb.dbType());
        System.out.println(noSqlDb.getUserDetails() + "\t" + noSqlDb.dbType());
    }
}
