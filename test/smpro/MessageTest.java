/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smpro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Livinvg
 */
public class MessageTest {
    Message instance;
    public MessageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        String info = "info";
         instance = new Message();
        instance.setInfo(info);
        instance.setMessageType(info);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMessageType method, of class Message.
     */
    @Test
    public void testGetMessageType() {
        System.out.println("getMessageType");

        String expResult = "info";
        String result = instance.getMessageType();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setMessageType method, of class Message.
     */

    /**
     * Test of getInfo method, of class Message.
     */
    @Test
    public void testGetInfo() {
    
        String expResult = "info";
        String result = instance.getInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setInfo method, of class Message.
     */

    /**
     * Test of toString method, of class Message.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
       
        String expResult = "info";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
