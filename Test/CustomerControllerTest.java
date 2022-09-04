/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package BanglaOyoController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bangla.oyo.Controller.CustomerController;
import bangla.oyo.Controller.conn;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;



public class CustomerControllerTest {
      conn c= new conn();
      
     

    /**
     * Test of get method, of class CustomerController.
     */
    @Test
    public void testGet() {
        try{
        System.out.println("get");
        CustomerController instance = new CustomerController();
        String sql= "select * from customer";          
        ResultSet expResult =c.s.executeQuery(sql);
        ResultSet result = instance.get();
        ResultSet temp=instance.get();
        boolean flag=true;
        while(temp.next()){
            if(result.next()==expResult.next()){

            }else{
              flag=false;
            }
        }
        if(flag){
        }else{
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
        }catch(Exception e){
        }
    }

    /**
     * Test of getSpecific method, of class CustomerController.
     */
    @Test
    public void testGetSpecific() {
        try{
        System.out.println("getSpecific");
        String number ="";
        String str= "select * from customer where number = "+number;
        CustomerController instance = new CustomerController();
        ResultSet expResult = c.s.executeQuery(str);
        ResultSet result = instance.getSpecific(number);
        ResultSet temp = instance.getSpecific(number);

        boolean flag=true;
        while(temp.next()){
            if(result.next()==expResult.next()){
            }else{
              flag=false;
            }
        }
        if(flag){
        }else{
            fail("The test case is a prototype.");
        }
       
        }catch(Exception E){
        }
    }

    /**
     * Test of delete method, of class CustomerController.
     */
    @Test
    public void testDelete() {
     try{
        System.out.println("delete");
        String id = "";
        CustomerController instance = new CustomerController();
        
        instance.delete(id);
     }catch(Exception e){
         fail("it failed");
     }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class CustomerController.
     */
    @Test
    public void testAdd() {
     try{   System.out.println("add");
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        String s6 = "";
        String s7 = "";
        String s8 = "";
        CustomerController instance = new CustomerController();
        instance.add(s1, s2, s3, s4, s5, s6, s7, s8);
     }catch(Exception e){// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
     }
    }
//
    /**
     * Test of update method, of class CustomerController.
     */
    @Test
    public void testUpdate() {
        try{System.out.println("update");
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        String s1 = "";
        CustomerController instance = new CustomerController();
        instance.update(s2, s3, s4, s5, s1);
        // TODO review the generated test code and remove the default call to fail.
        }catch(Exception e){
        fail("The test case is a prototype.");    
        }
        
    }
    
}
