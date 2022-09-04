/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangla.oyo.Model;

import bangla.oyo.Controller.conn;

import java.sql.ResultSet;

public class CustomerModel {
    conn c = new conn();
    ResultSet rs;
    public ResultSet getCustomer(String sql) {
        try{
            rs=c.s.executeQuery(sql);
            return rs;
        } catch (Exception e){

        }
        return rs;
    }

    public void deleteCustomer(String deleteSQL) {
        try {
            c.s.executeUpdate(deleteSQL);
        } catch (Exception e) {

        }
    }

    public void addCustomer(String q1) {
        try{
            c.s.executeUpdate(q1);
        }catch (Exception e){

        }

    }

    public void updateCustomer(String str) {
        try{
            c.s.executeUpdate(str);
        }catch (Exception e){

        }
    }
}
