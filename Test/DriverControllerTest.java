package BanglaOyoController;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import bangla.oyo.Controller.DriverController;
import bangla.oyo.Controller.conn;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

public class DriverControllerTest {
     conn c= new conn();
    public DriverControllerTest() {
    }

    /**
     * Test of add method, of class DriverController.
     */
    @Test
    public void testAdd() {
       try{ System.out.println("add");
        String name = "";
        String age = "";
        String gender = "";
        String company = "";
        String brand = "";
        String available = "";
        String location = "";
        DriverController instance = new DriverController();
        instance.add(name, age, gender, company, brand, available, location);
       }catch(Exception e){
        fail("The test case is a prototype.");
       } 
// TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of get method, of class DriverController.
     */
    @Test
    public void testGet() {
        try{
        System.out.println("get");
        DriverController instance = new DriverController();
        String sql= "select * from driver";          
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
        }// TODO review the generated test code and remove the default call to fail.
        
        }catch(Exception e){
        }
        
    }

    /**
     * Test of getSpecific method, of class DriverController.
     */
    @Test
    public void testGetSpecific() {
       try{ System.out.println("getSpecific");
        String brand = "";
        DriverController instance = new DriverController();
        String sql = "select * from driver where brand = '"+brand+"'";
        ResultSet expResult = c.s.executeQuery(sql);
        ResultSet result = instance.getSpecific(brand);
        ResultSet temp = instance.getSpecific(brand);
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
        }// TODO review the generated test code and remove the default call to fail.
        
        }catch(Exception e){
        }
// TODO review the generated test code and remove the default call to fail.
        
    }
    
}
