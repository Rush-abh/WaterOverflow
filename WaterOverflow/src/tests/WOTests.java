package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.GlassOperations;

public class WOTests {
GlassOperations g_ops;
	
    @BeforeEach
    public void setUp() throws Exception {  
        System.out.println("before glass ops execution");  
        g_ops = new GlassOperations();
        
    }  
    
    @Test  
    public void testFindWater(){  
        assertEquals(62.5, g_ops.findWater(3, 3, 1));
        assertEquals(250, g_ops.findWater(3, 3, 2), "FindWater Fail. Should be 250");
        assertEquals(15.625, g_ops.findWater(5, 5, 4));
        assertEquals(218.75, g_ops.findWater(4, 3, 2));
        assertEquals(0.0, g_ops.findWater(4, 3, 0));
        assertEquals(20.5078125, g_ops.findWater(10, 7,8));
        assertEquals(160.15625, g_ops.findWater(7, 6,8));
    }  
    
    
    @Test
    public void testConvertToMilliters(){  
        assertEquals(5000, g_ops.convertToMilliliters(5), "Conversion error");
        assertEquals(0, g_ops.convertToMilliliters(0), "Conversion error");
        
    } 
    
}
