/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Latihan;

import java.sql.*;

public class App {
public static void main(String[] args) throws SQLException{
    try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "ina", "12345")){
    try (Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY)){
        try (ResultSet rs = st.executeQuery("SELECT 'Hello World!'")) {
            rs.first();
            System.out.println(rs.getString(1));
        }    
    }
        }

    }
}