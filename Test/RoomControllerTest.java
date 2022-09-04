package BanglaOyoController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import bangla.oyo.Controller.RoomController;
import bangla.oyo.Controller.conn;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomControllerTest {
    conn c=new conn();
    public RoomControllerTest() {
    }
    /**
     * Test of add method, of class RoomController.
     */
    @Test
    public void testAdd() {
    
        try{
            System.out.println("add");
            String room = "58";
            String available = "";
            String status = "";
            String price = "";
            String type = "";
            RoomController instance = new RoomController();
            instance.add(room, available, status, price, type);
        }catch(Exception e){
            fail("The test case is a prototype.");
        }        
            // TODO review the generated test code and remove the default call to fail.
            
    }

    /**
     * Test of setAvailable method, of class RoomController.
     */
    @Test
    public void testSetAvailable() {
       try{ System.out.println("setAvailable");
        String a = "";
        String s1 = "";
        RoomController instance = new RoomController();
        instance.setAvailable(a, s1);
       }catch(Exception e){
        fail("The test case is a prototype.");   
       }
        
    }

    /**
     * Test of get method, of class RoomController.
     */
    @Test
    public void testGet() {
        try{
            System.out.println("get");
            RoomController instance = new RoomController();
            String str="select * from room";
            ResultSet expResult =c.s.executeQuery(str);
            ResultSet result = instance.get();
            ResultSet temp = instance.get();
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
     * Test of getByBed method, of class RoomController.
     */
    @Test
    public void testGetByBed() {
       try{
        System.out.println("getByBed");
        String bed = "";
        RoomController instance = new RoomController();
        String sql = "select * from Room where bed_type = '"+bed+"'";
        ResultSet expResult = c.s.executeQuery(sql);
        ResultSet result = instance.getByBed(bed);
           ResultSet temp = instance.getByBed(bed);
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
     * Test of getByAvailableBed method, of class RoomController.
     */
    @Test
    public void testGetByAvailableBed() {
        try{
            System.out.println("getByAvailableBed");
            String bed = "";
            RoomController instance = new RoomController();
            String sql = "select * from Room where availability = 'Available' AND bed_type = '"+bed+"'";
            ResultSet expResult = c.s.executeQuery(sql);
            ResultSet result = instance.getByAvailableBed(bed);
            ResultSet temp = instance.getByAvailableBed(bed);
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
     * Test of update method, of class RoomController.
     */
    @Test
    public void testUpdate() {
       try{
            System.out.println("update");
            String status = "";
            String roomNo = "";
            RoomController instance = new RoomController();
            instance.update(status, roomNo);
       }catch(Exception e){
        
        // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }
    
}
