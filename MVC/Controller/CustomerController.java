/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangla.oyo.Controller;

import bangla.oyo.Model.CustomerModel;

import java.sql.ResultSet;

public class CustomerController {
    CustomerModel cm=new CustomerModel();
    ResultSet rs;

    public ResultSet get() {
        String sql="select * from customer";
        rs=cm.getCustomer(sql);
        return rs;
    }


    public ResultSet getSpecific(String number) {
       String str= "select * from customer where number = "+number;
       rs=cm.getCustomer(str);
       return rs;
    }

    public void delete(String id) {
        String deleteSQL = "Delete from customer where number = "+id;
        cm.deleteCustomer(deleteSQL);
    }

    public void add(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
        String q1 = "insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
        cm.addCustomer(q1);
    }

    public void update(String s2, String s3, String s4, String s5, String s1) {
        String str="update customer set room_number = '"+s2+"', name = '"+s3+"', status = '"+s4+"', deposit = '"+s5+"' where number = '"+s1+"'";
        cm.updateCustomer(str);
    }
}
