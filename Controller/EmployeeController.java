/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangla.oyo.Controller;

import bangla.oyo.Model.EmployeeModel;

import java.sql.ResultSet;


public class EmployeeController {
    ResultSet rs;
    EmployeeModel emp=new EmployeeModel();
    public void add(String name, String age, String gender, String s6, String salary, String phone, String aadhar, String email) {
        String str = "INSERT INTO employee values( '"+name+"', '"+age+"', '"+gender+"','"+s6+"', '"+salary+"', '"+phone+"','"+aadhar+"', '"+email+"')";
        emp.addEmployee(str);
    }

    public ResultSet get() {
        String sql = "select * from Employee";
        rs=emp.getEmployee(sql);
        return rs;
    }

    public ResultSet getSpecific(String a) {
        String sql="select * from Employee where job = "+a;
        rs=emp.getEmployee(sql);
        return rs;
    }
}
