
package org.model.config;
import org.model.config.DatabaseConnection;
import java.sql.Statement;

import java.sql.Connection;

public class CrudProduct {
    DatabaseConnection con = new DatabaseConnection();
    
    public void inset(){
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement Statement = conn.createStatement();
        } catch (Exception e) {
        }
    }
}
