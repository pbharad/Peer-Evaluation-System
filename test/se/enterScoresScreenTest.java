/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
Code Submission - 09-Dec-2017
Team No : 13

1. Yash Dharmendra Shah - 50245455
2. Dilip Reddy Gaddam - 50248867
3. Pratibha Arjun Barsale - 50247005
4. Bharadwaj Parthasarathy - 50246591
5. Mayur M Popade - 50246313 

*/

package se;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class enterScoresScreenTest {
    /**
     * Test of main method, of class enterScoresScreen.
     */
    @Test
    public void calcTotalTestNormal()
    {
        
        // To test calcTotal function
        
        int[] marks = {3,0,4,4,5,3}; 
        int actual,expected;
        
        enterScoresScreen s1=new enterScoresScreen();
        actual=s1.calcTotal(marks,2);
        
        expected =19;
        assertEquals(expected, actual);
        
    }   
    
    @Test
    public void calcTotalTestNegative()
    {
        
        // To test calcTotal function if some marks are out of range
        
        int[] marks = {3,0,4,4,9,3,5,3,-1}; 
        int actual,expected;
        
        enterScoresScreen s1=new enterScoresScreen();
        actual=s1.calcTotal(marks,3);
        
        expected =-2;
        assertEquals(expected, actual);
        
    }  
    
     @Test
    public void calcTotalTestZero()
    {
         // To test calcTotal function if total is zero in order to avoid divide by zero error later
        
        int[] marks = {0,0,0}; 
        int actual,expected;
        
        enterScoresScreen s1=new enterScoresScreen();
        actual=s1.calcTotal(marks,1);
        
        expected =-1;
        assertEquals(expected, actual);
 
    }  
    
    @Test
    public void normalizeTest_2students()
    {
        // To test normalization for team having 2 members
        
        int[] marks = {4,5,0,3,2,3}; 
        float[] actual;
        float[] expected =  {0.53f, 0.47f};        
        enterScoresScreen s1=new enterScoresScreen();
        actual=s1.normalize(marks,17,2);
        for(int i=0;i<2;i++)
          assertEquals(expected[i],actual[i],1e-2);
    }
    
    @Test
    public void normalizeTest_5students()
    {
         // To test normalization for team having 5 members
        
        int[] marks = {4,5,0,3,2,3,4,4,4,5,3,2,1,3,2}; 
        float[] actual;
        float[] expected =  {0.2f, 0.18f, 0.27f, 0.2f, 0.13f};        
        enterScoresScreen s1=new enterScoresScreen();
        actual=s1.normalize(marks,45,5);
        for(int i=0;i<2;i++)
        assertEquals(expected[i],actual[i],1e-2);
    }
    
    @Test
    public void normalizeTest_7students()
    {
         // To test normalization for team having 7 members
        
        int[] marks = {4,5,0,3,2,3,4,4,4,5,3,2,1,3,2,0,0,0,0,0,0}; 
        float[] actual;
        float[] expected =  {0.2f, 0.18f, 0.27f, 0.2f, 0.13f, 0f,0f};         
        enterScoresScreen s1=new enterScoresScreen();
        actual=s1.normalize(marks,45,7);
        for(int i=0;i<2;i++)
        assertEquals(expected[i],actual[i],1e-2);
    }   
}
