package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            if (!conn.isClosed()) {
                System.out.println("Коннект");
            }
        } catch (SQLException e) {
            System.out.println("Не коннект");
        }
        return conn;
    }
    // реализуйте настройку соеденения с БД
}
