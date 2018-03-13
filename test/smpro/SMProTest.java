/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smpro;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Livinvg
 */
public class SMProTest {
    SMPro instance ;
    public SMProTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         instance = new SMPro();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isFlag method, of class SMPro.
     */
    @Test
    public void testIsFlag() {
        System.out.println("isFlag");
        
        boolean expResult = false;
        boolean result = instance.isFlag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageLog method, of class SMPro.
     */
    @Test
    public void testGetMessageLog() {
        System.out.println("getMessageLog");

        List<Message> expResult = null;
        List<Message> result = instance.getMessageLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaleLog method, of class SMPro.
     */
    @Test
    public void testGetSaleLog() {
        System.out.println("getSaleLog");
     
        List<Message> expResult = null;
        List<Message> result = instance.getSaleLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 
    
}
