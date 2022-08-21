/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangla.oyo.Model;

import bangla.oyo.Controller.conn;

import java.sql.ResultSet;

public class RoomModel {
    conn c = new conn();
    ResultSet rs;
    public void addRoom(String str) {
        try{
            c.s.executeUpdate(str);
        }catch (Exception e){

        }
    }

    public void setAvailability(String q2) {
        try {
            c.s.executeUpdate(q2);
        }catch (Exception e){

        }
    }
    public ResultSet getRoom(String sql) {
        try{
            rs=c.s.executeQuery(sql);
            return rs;
        } catch (Exception e){

        }
        return rs;
    }

    public void updateRoom(String str) {
        try {
            c.s.executeUpdate(str);
        }catch (Exception e){

        }
    }
}
