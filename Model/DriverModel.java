/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangla.oyo.Model;

import bangla.oyo.Controller.conn;

import java.sql.ResultSet;

public class DriverModel {
    conn c = new conn();
    ResultSet rs;

    public void addDriver(String str) {
       try{
           c.s.executeUpdate(str);
       }catch (Exception e){

       }
    }

    public ResultSet getDriver(String str) {
        try{
            rs=c.s.executeQuery(str);
            return rs;

        }catch (Exception e){

        }
        return rs;
    }
}
