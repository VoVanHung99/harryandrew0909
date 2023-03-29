/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Acer
 */
public class sqlConnect {
    public static Connection ketnoiSQL() throws Exception{
        String url = "jdbc:sqlserver://localhost;database=QLNV";
        String user ="sa";
        String password="123";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(url,user,password);
        return con;
    }
}
