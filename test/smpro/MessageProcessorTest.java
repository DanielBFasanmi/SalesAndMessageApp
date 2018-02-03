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
public class MessageProcessorTest {

    /**
     * Test of processMessage method, of class MessageProcessor.
     */
    @Test
    public void testProcessMessage() {
        System.out.println("processMessage");
        String message = "15 sales of apple at 12.0p each";
        String[] expResult = new String[5];
        expResult[0] = "Insert";
        expResult[1] = "15";
        expResult[2] = "apple";
        expResult[3] = "12.0";
        expResult[4] = "1";
        String[] result = MessageProcessor.processMessage(message);
        assertArrayEquals(expResult, result);

     
    }
    
}
