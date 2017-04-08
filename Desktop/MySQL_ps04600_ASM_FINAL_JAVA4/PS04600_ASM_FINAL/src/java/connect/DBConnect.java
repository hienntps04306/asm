/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nguyen
 */
public class DBConnect {
    public static Connection getConnection() {
        Connection cons = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Class.forName("com.mysql.jdbc.Driver");
            //cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/ASM_JAVA4","root","");
            //cons = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ASM_JAVA4;user=sa;password=");
            cons = DriverManager.getConnection("jdbc:sqlserver://mssql42518-env-4981502.jelastic.skali.net:1444;databaseName=ASM_JAVA4;user=sa;password=DOMoas63165");
            //cons = DriverManager.getConnection("jdbc:mysql://node42434-ps04600.jelastic.skali.net/asm_java4","root","qXsHrzF8ao");
            //cons = DriverManager.getConnection("jdbc:mysql://sql204.epizy.com:3306/epiz_19883408_asm_java4","epiz_19883408","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }
 
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
