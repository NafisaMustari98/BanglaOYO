/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangla.oyo.Controller;

import bangla.oyo.Model.DriverModel;

import java.sql.ResultSet;

public class DriverController {
    DriverModel dri =new DriverModel();
    ResultSet rs;
    public void add(String name, String age, String gender, String company, String brand, String available, String location) {
        String str = "INSERT INTO driver values( '"+name+"', '"+age+"', '"+gender+"','"+company+"', '"+brand+"', '"+available+"','"+location+"')";
        dri.addDriver(str);
    }

    public ResultSet get() {
        String str="select * from driver";
        rs= dri.getDriver(str);
        return rs;
    }

    public ResultSet getSpecific(String brand) {
        String sql = "select * from driver where brand = '"+brand+"'";
        rs=dri.getDriver(sql);
        return rs;
    }
}
