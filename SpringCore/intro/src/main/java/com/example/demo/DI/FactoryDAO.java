package com.example.demo.DI;

public class FactoryDAO {
    public static AbstractDAO getDAO() {
            String database = "1";
            if (database.equals("1")) {
                return new MySQLDAO();
            }
            if (database.equals("2")) {
                return new PostgreDAO();
            }
        return null;
    }
}
