package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDB {
    Connection conn = null;
    String url = "jdbc:postgresql://localhost:5432/sandesh";
    String username = "postgres";
    String password = "Sandesh@03";

    public ProductDB(){
        try{
            conn = DriverManager.getConnection(url, username, password);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public void save(Product p){
        String sql = "insert into products values(?,?,?,?,?)";

        try{
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, p.getId());
            st.setString(2, p.getName());
            st.setString(3, p.getType());
            st.setString(4, p.getPlace());
            st.setInt(5, p.getWarranty());
            st.execute();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
