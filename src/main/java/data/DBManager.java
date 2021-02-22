package data;

import data.interfaces.IDBManager;

import javax.ws.rs.ServerErrorException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager implements IDBManager {

    @Override
    public Connection getConnection() {
        try {
            Connection dataBaseConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Assignment3", "postgres", "z12140609");

            return dataBaseConnection;
        } catch (Exception e) {
            throw new ServerErrorException("Cannot connect to DB", 500);
        }
    }
}
