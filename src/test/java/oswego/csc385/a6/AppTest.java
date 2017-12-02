package oswego.csc385.a6;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest {
    int exp;
    Thread a1, a2, a3;
//  NOTE: Commented objects cannot be tested due to incompatible types
//  (string cannot be converted to int)
//  (see test case table in assignment document)
    JosephusCircle t0a = new Algorithm1(1, 1, 1);
    JosephusCircle t1a = new Algorithm1(30, 40, 50);
    JosephusCircle t2a = new Algorithm1(0, 31, 32);
    JosephusCircle t3a = new Algorithm1(-1, 41, 42);
    JosephusCircle t4a = new Algorithm1(-100, 70, 80);
    JosephusCircle t5a = new Algorithm1(Integer.MAX_VALUE + 1, 110, 111);
    //JosephusCircle t6a = new Algorithm1("Josephus", 37, 39);
    JosephusCircle t7a = new Algorithm1(20, 0, 21);
    JosephusCircle t8a = new Algorithm1(26, -1, 28);
    JosephusCircle t9a = new Algorithm1(47, -90, 48);
    JosephusCircle t10a = new Algorithm1(72, Integer.MAX_VALUE + 1, 73);
    //JosephusCircle t11a = new Algorithm1(91, "Oswego", 92);
    JosephusCircle t12a = new Algorithm1(120, 121, 0);
    JosephusCircle t13a = new Algorithm1(130, 131, -1);
    JosephusCircle t14a = new Algorithm1(140, 141, -80);
    JosephusCircle t15a = new Algorithm1(150, 151, Integer.MAX_VALUE+1);
    //JosephusCircle t16a = new Algorithm1(160, 161, "ga");
    JosephusCircle t17a = new Algorithm1(2, 81, 202);
    //JosephusCircle t18a = new Algorithm1(29, 2, Integer.MAX_VALUE);
    //JosephusCircle t19a = new Algorithm1(31, Integer.MAX_VALUE, 2);
    JosephusCircle t20a = new Algorithm1(-2, 90, 92);
    JosephusCircle t21a = new Algorithm1(-101, 32, 233);
    JosephusCircle t22a = new Algorithm1(-99, 321, 432);
    //JosephusCircle t23a = new Algorithm1(Integer.MAX_VALUE, 20, 765);
    JosephusCircle t24a = new Algorithm1(Integer.MAX_VALUE + 2, 235, 3);
    //JosephusCircle t25a = new Algorithm1("Josephur", 45353, 12);
    //JosephusCircle t26a = new Algorithm1("Josephut", 41, 11);
    JosephusCircle t27a = new Algorithm1(11, -2, 3);
    JosephusCircle t28a = new Algorithm1(22, -91, 2);
    JosephusCircle t29a = new Algorithm1(23, -89, 7);
    JosephusCircle t30a = new Algorithm1(33, Integer.MAX_VALUE + 2, 8);
    //JosephusCircle t31a = new Algorithm1(34, "Oswegn", 9);
    //JosephusCircle t32a = new Algorithm1(51, "Oswegp", 1);
    JosephusCircle t33a = new Algorithm1(14, 41, 23);
    JosephusCircle t34a = new Algorithm1(16, 39, 41);
    JosephusCircle t35a = new Algorithm1(21, 11, 49);
    JosephusCircle t36a = new Algorithm1(35, 67, 51);
    JosephusCircle t37a = new Algorithm1(22, 54, -2);
    JosephusCircle t38a = new Algorithm1(7668, 67, -79);
    JosephusCircle t39a = new Algorithm1(122, 3210, -81);
    JosephusCircle t40a = new Algorithm1(1101, 202, Integer.MAX_VALUE + 2);
    //JosephusCircle t41a = new Algorithm1(432, 17, "q");
    //JosephusCircle t42a = new Algorithm1(81, 18, "qb");

    JosephusCircle t0b = new Algorithm2(1, 1, 1);
    JosephusCircle t1b = new Algorithm2(30, 40, 50);
    JosephusCircle t2b = new Algorithm2(0, 31, 32);
    JosephusCircle t3b = new Algorithm2(-1, 41, 42);
    JosephusCircle t4b = new Algorithm2(-100, 70, 80);
    JosephusCircle t5b = new Algorithm2(Integer.MAX_VALUE + 1, 110, 111);
    //JosephusCircle t6b = new Algorithm2("Josephus", 37, 39);
    JosephusCircle t7b = new Algorithm2(20, 0, 21);
    JosephusCircle t8b = new Algorithm2(26, -1, 28);
    JosephusCircle t9b = new Algorithm2(47, -90, 48);
    JosephusCircle t10b = new Algorithm2(72, Integer.MAX_VALUE + 1, 73);
    //JosephusCircle t11b = new Algorithm2(91, "Oswego", 92);
    JosephusCircle t12b = new Algorithm2(120, 121, 0);
    JosephusCircle t13b = new Algorithm2(130, 131, -1);
    JosephusCircle t14b = new Algorithm2(140, 141, -80);
    JosephusCircle t15b = new Algorithm2(150, 151, Integer.MAX_VALUE + 1);
    //JosephusCircle t16b = new Algorithm2(160, 161, "ga");
    JosephusCircle t17b = new Algorithm2(2, 81, 202);
    //JosephusCircle t18b = new Algorithm2(29, 2, Integer.MAX_VALUE);
    //JosephusCircle t19b = new Algorithm2(31, Integer.MAX_VALUE, 2);
    JosephusCircle t20b = new Algorithm2(-2, 90, 92);
    JosephusCircle t21b = new Algorithm2(-101, 32, 233);
    JosephusCircle t22b = new Algorithm2(-99, 321, 432);
    //JosephusCircle t23b = new Algorithm2(Integer.MAX_VALUE, 20, 765);
    JosephusCircle t24b = new Algorithm2(Integer.MAX_VALUE + 2, 235, 3);
    //JosephusCircle t25b = new Algorithm2("Josephur", 45353, 12);
    //JosephusCircle t26b = new Algorithm2("Josephut", 41, 11);
    JosephusCircle t27b = new Algorithm2(11, -2, 3);
    JosephusCircle t28b = new Algorithm2(22, -91, 2);
    JosephusCircle t29b = new Algorithm2(23, -89, 7);
    JosephusCircle t30b = new Algorithm2(33, Integer.MAX_VALUE + 2, 8);
    //JosephusCircle t31b = new Algorithm2(34, "Oswegn", 9);
    //JosephusCircle t32b = new Algorithm2(51, "Oswegp", 1);
    JosephusCircle t33b = new Algorithm2(14, 41, 23);
    JosephusCircle t34b = new Algorithm2(16, 39, 41);
    JosephusCircle t35b = new Algorithm2(21, 11, 49);
    JosephusCircle t36b = new Algorithm2(35, 67, 51);
    JosephusCircle t37b = new Algorithm2(22, 54, -2);
    JosephusCircle t38b = new Algorithm2(7668, 67, -79);
    JosephusCircle t39b = new Algorithm2(122, 3210, -81);
    JosephusCircle t40b = new Algorithm2(1101, 202, Integer.MAX_VALUE + 2);
   //JosephusCircle t41b = new Algorithm2(432, 17, "q");
    //JosephusCircle t42b = new Algorithm2(81, 18, "qb");

    JosephusCircle t0c = new Algorithm3(1, 1, 1);
    JosephusCircle t1c = new Algorithm3(30, 40, 50);
    JosephusCircle t2c = new Algorithm3(0, 31, 32);
    JosephusCircle t3c = new Algorithm3(-1, 41, 42);
    JosephusCircle t4c = new Algorithm3(-100, 70, 80);
    JosephusCircle t5c = new Algorithm3(Integer.MAX_VALUE + 1, 110, 111);
    //JosephusCircle t6c = new Algorithm3("Josephus", 37, 39);
    JosephusCircle t7c = new Algorithm3(20, 0, 21);
    JosephusCircle t8c = new Algorithm3(26, -1, 28);
    JosephusCircle t9c = new Algorithm3(47, -90, 48);
    JosephusCircle t10c = new Algorithm3(72, Integer.MAX_VALUE + 1, 73);
    //JosephusCircle t11c = new Algorithm3(91, "Oswego", 92);
    JosephusCircle t12c = new Algorithm3(120, 121, 0);
    JosephusCircle t13c = new Algorithm3(130, 131, -1);
    JosephusCircle t14c = new Algorithm3(140, 141, -80);
    JosephusCircle t15c = new Algorithm3(150, 151, Integer.MAX_VALUE + 1);
    //JosephusCircle t16c = new Algorithm3(160, 161, "ga");
    JosephusCircle t17c = new Algorithm3(2, 81, 202);
    //JosephusCircle t18c = new Algorithm3(29, 2, Integer.MAX_VALUE);
    //JosephusCircle t19c = new Algorithm3(31, Integer.MAX_VALUE, 2);
    JosephusCircle t20c = new Algorithm3(-2, 90, 92);
    JosephusCircle t21c = new Algorithm3(-101, 32, 233);
    JosephusCircle t22c = new Algorithm3(-99, 321, 432);
    //JosephusCircle t23c = new Algorithm3(Integer.MAX_VALUE, 20, 765);
    JosephusCircle t24c = new Algorithm3(Integer.MAX_VALUE + 2, 235, 3);
    //JosephusCircle t25c = new Algorithm3("Josephur", 45353, 12);
    //JosephusCircle t26c = new Algorithm3("Josephut", 41, 11);
    JosephusCircle t27c = new Algorithm3(11, -2, 3);
    JosephusCircle t28c = new Algorithm3(22, -91, 2);
    JosephusCircle t29c = new Algorithm3(23, -89, 7);
    JosephusCircle t30c = new Algorithm3(33, Integer.MAX_VALUE + 2, 8);
    //JosephusCircle t31c = new Algorithm3(34, "Oswegn", 9);
    //JosephusCircle t32c = new Algorithm3(51, "Oswegp", 1);
    JosephusCircle t33c = new Algorithm3(14, 41, 23);
    JosephusCircle t34c = new Algorithm3(16, 39, 41);
    JosephusCircle t35c = new Algorithm3(21, 11, 49);
    JosephusCircle t36c = new Algorithm3(35, 67, 51);
    JosephusCircle t37c = new Algorithm3(22, 54, -2);
    JosephusCircle t38c = new Algorithm3(7668, 67, -79);
    JosephusCircle t39c = new Algorithm3(122, 3210, -81);
    JosephusCircle t40c = new Algorithm3(1101, 202, Integer.MAX_VALUE + 2);
    //JosephusCircle t41c = new Algorithm3(432, 17, "q");
    //JosephusCircle t42c = new Algorithm3(81, 18, "qb");
    
    public AppTest() {
    }
    
    @Test
    public void t0() {
        exp = 1;
        a1 = new Thread(t0a);
        a2 = new Thread(t0b);
        a3 = new Thread(t0c);
        
        a1.run();
	    a2.run();
        a3.run();
        
//        System.out.println(t0a.algorithm());
//        System.out.println(t0b.algorithm());
//        System.out.println(t0c.algorithm());
        
        assertEquals(exp, t0a.algorithm());
        assertEquals(exp, t0b.algorithm()); // Fail: returns 0 instead of 1
        assertEquals(exp, t0c.algorithm());
    }
    
    @Test
    public void t1() { //expected 27... all 3 algs give different results!
        exp = 27;
        a1 = new Thread(t1a);
        a2 = new Thread(t1b);
        a3 = new Thread(t1c);
        
        a1.run();
        a2.run();
        a3.run();
       
        // System.out.println(t1a.algorithm());
        // System.out.println(t1b.algorithm());
        // System.out.println(t1c.algorithm());
        
        assertEquals(exp, t1a.algorithm()); // returns 27..
        assertEquals(exp, t1b.algorithm()); // returns 26..
        assertEquals(exp, t1c.algorithm()); // returns 21..
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void t2() {
        a1 = new Thread(t2a);
        a2 = new Thread(t2b);
        a3 = new Thread(t2c);
        
        a1.run();
	    a2.run();
        a3.run();
        
        assertEquals(null, t2a.algorithm());
        assertEquals(null, t2b.algorithm());
        assertEquals(null, t2c.algorithm());
    }
    
    
    @Test
    public void t3() { // error was expected here, but t3a and t3c both return
                       // '1', with t3b standing out
        exp = 1;
        a1 = new Thread(t3a);
        a2 = new Thread(t3b);
        a3 = new Thread(t3c);
        
        a1.run();
        a2.run();
        a3.run();
        
//        System.out.println(t3a.lastManStanding);
//        System.out.println(t3b.lastManStanding);
//        System.out.println(t3c.lastManStanding);
        
        assertEquals(exp, t3a.algorithm()); 
        assertEquals(exp, t3b.algorithm()); // Fail: returns 0 instead of 1 
        assertEquals(exp, t3c.algorithm()); 
    }
    
    @Test
    public void t4() { //expected an error... all 3 algs give different results!
        a1 = new Thread(t4a);
        a2 = new Thread(t4b);
        a3 = new Thread(t4c);
        
        a1.run();
        a2.run();
        a3.run();
        
//        System.out.println(t4a.lastManStanding);
//        System.out.println(t4b.lastManStanding); 
//        System.out.println(t4c.lastManStanding); 
        
        assertEquals(null, t4a.algorithm()); // returns 37..
        assertEquals(null, t4b.algorithm()); // returns 36..
        assertEquals(null, t4c.algorithm()); // returns 31..
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void t5() {
        a1 = new Thread(t5a);
        a2 = new Thread(t5b);
        a3 = new Thread(t5c);
        
        a1.run();
        a2.run();
        a3.run();
        
//        System.out.println(t5a.algorithm());
//        System.out.println(t5b.algorithm()); 
//        System.out.println(t5c.algorithm()); 
        
        assertEquals(null, t5a.algorithm());
        assertEquals(null, t5b.algorithm());
        assertEquals(null, t5c.algorithm());
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void t7() {
        a1 = new Thread(t7a);
        a2 = new Thread(t7b);
        a3 = new Thread(t7c);
        
        a1.run();
        a2.run();
        a3.run();
        
//        System.out.println(t7a.algorithm());
//        System.out.println(t7b.algorithm()); 
//        System.out.println(t7c.algorithm()); 
        
        assertEquals(null, t7a.algorithm());
        assertEquals(null, t7b.algorithm());
        assertEquals(null, t7c.algorithm());
    }
    
    @Test
    public void t8() { // error was expected here, but t3a and t3c both return
                       // '26', with t3b standing out
        exp = 26;
        a1 = new Thread(t8a);
        a2 = new Thread(t8b);
        a3 = new Thread(t8c);
        
        a1.run();
        a2.run();
        a3.run();
        
//        System.out.println(t8a.algorithm());
//        System.out.println(t8b.algorithm()); 
//        System.out.println(t8c.algorithm()); 
        
        assertEquals(exp, t8a.algorithm());
        assertEquals(exp, t8b.algorithm()); // Fail: returns 25 instead of 26
        assertEquals(exp, t8c.algorithm());
    }
    
    @Test
    public void t9() { //expected an error... all 3 algs give different results!
        a1 = new Thread(t9a);
        a2 = new Thread(t9b);
        a3 = new Thread(t9c);
        
        a1.run();
        a2.run();
        a3.run();
        
//        System.out.println(t9a.algorithm()); 
//        System.out.println(t9b.algorithm()); 
//        System.out.println(t9c.algorithm()); 
        
        assertEquals(null, t9a.algorithm()); // returns 20..
        assertEquals(null, t9b.algorithm()); // returns 19..
        assertEquals(null, t9c.algorithm()); // returns 0..
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void t10() {
        a1 = new Thread(t10a);
        a2 = new Thread(t10b);
        a3 = new Thread(t10c);
        
        a1.run();
        a2.run();
        a3.run();
        
        assertEquals(null, t10a.algorithm()); 
        assertEquals(null, t10b.algorithm());
        assertEquals(null, t10c.algorithm()); 
    }
    
    @Test
    public void t12() { // expected an error... all 3 algs give different results!
        exp = 0;
        a1 = new Thread(t12a);
        a2 = new Thread(t12b);
        a3 = new Thread(t12c);
        
        a1.run();
	    a2.run();
        a3.run();
        
//        System.out.println(t12a.algorithm()); 
//        System.out.println(t12b.algorithm()); 
//        System.out.println(t12c.algorithm());
        
        assertEquals(exp, t12a.algorithm()); // returns 80..
        assertEquals(exp, t12b.algorithm()); // returns 79..
        assertEquals(exp, t12c.algorithm()); // returns 120..
    }
    
    @Test
    public void t13() { //expected an error... all 3 algs give different results!
        exp = 0;
        a1 = new Thread(t13a);
        a2 = new Thread(t13b);
        a3 = new Thread(t13c);
        
        a1.run();
	    a2.run();
        a3.run();
        
//        System.out.println(t13a.algorithm()); 
//        System.out.println(t13b.algorithm()); 
//        System.out.println(t13c.algorithm()); 
        
        assertEquals(exp, t13a.algorithm()); // returns 119..
        assertEquals(exp, t13b.algorithm()); // returns 118..
        assertEquals(exp, t13c.algorithm()); // returns 130..
    }
    
    @Test
    public void t14() { //expected an error... all 3 algs give different results!
        a1 = new Thread(t14a);
        a2 = new Thread(t14b);
        a3 = new Thread(t14c);
        
        a1.run();
	    a2.run();
        a3.run();
        
//        System.out.println(t14a.algorithm()); 
//        System.out.println(t14b.algorithm()); 
//        System.out.println(t14c.algorithm()); 
        
        assertEquals(null, t14a.algorithm()); // returns 116..
        assertEquals(null, t14b.algorithm()); // returns 115..
        assertEquals(null, t14c.algorithm()); // returns 140..
    }
    
    @Test
    public void t15() { //expected an error... all 3 algs give different results!
        exp = 0;
        a1 = new Thread(t15a);
        a2 = new Thread(t15b);
        a3 = new Thread(t15c);
        
        a1.run();
	    a2.run();
        a3.run();
        
//        System.out.println(t15a.algorithm()); 
//        System.out.println(t15b.algorithm()); 
//        System.out.println(t15c.algorithm()); 
        
        assertEquals(exp, t15a.algorithm()); // returns 51..
        assertEquals(exp, t15b.algorithm()); // returns 50..
        assertEquals(exp, t15c.algorithm()); // returns 150..
    }
    
    @Test
    public void t17() {
        exp = 2;
        a1 = new Thread(t17a);
        a2 = new Thread(t17b);
        a3 = new Thread(t17c);
        
        a1.run();
	    a2.run();
        a3.run();
        
//        System.out.println(t17a.algorithm()); 
//        System.out.println(t17b.algorithm()); 
//        System.out.println(t17c.algorithm()); 
        
        assertEquals(exp, t17a.algorithm()); 
        assertEquals(exp, t17b.algorithm()); // Fail: returns 1 instead of 2
        assertEquals(exp, t17c.algorithm()); 
    }
    
    @Test
    public void t20() { // error was expected here, but t3a and t3c both return
                       // '1', with t3b standing out
        exp = 1;
        a1 = new Thread(t20a);
        a2 = new Thread(t20b);
        a3 = new Thread(t20c);
        
        a1.run();
	    a2.run();
        a3.run();
        
//        System.out.println(t20a.algorithm()); 
//        System.out.println(t20b.algorithm()); 
//        System.out.println(t20c.algorithm()); 
        
        assertEquals(1, t20a.algorithm()); 
        assertEquals(1, t20b.algorithm()); // Fail: returns 0 instead of 1
        assertEquals(1, t20c.algorithm()); 
    }
    
    @Test
    public void t21() { //appears to be an outlier... all 3 algs give different results!
        a1 = new Thread(t21a);
        a2 = new Thread(t21b);
        a3 = new Thread(t21c);
        
        a1.run();
	    a2.run();
        a3.run();
        
//        System.out.println(t21a.algorithm()); 
//        System.out.println(t21b.algorithm()); 
//        System.out.println(t21c.algorithm()); 
        
        assertEquals(null, t21a.algorithm()); // returns 68..
        assertEquals(null, t21b.algorithm()); // returns 67..
        assertEquals(null, t21c.algorithm()); // returns 70..
    }
    
     @Test
    public void t22() { //appears to be an outlier... all 3 algs give different results!
        a1 = new Thread(t22a);
        a2 = new Thread(t22b);
        a3 = new Thread(t22c);
        
        a1.run();
        a2.run();
        a3.run();
        
//        System.out.println(t22a.algorithm()); 
//        System.out.println(t22b.algorithm()); 
//        System.out.println(t22c.algorithm()); 
        
        assertEquals(null, t22a.algorithm()); // returns 25..
        assertEquals(null, t22b.algorithm()); // returns 24..
        assertEquals(null, t22c.algorithm()); // returns 76..
    }

////////////////////////////////////////////

    // @Test
    // public void t24() { //expected an error... all 3 algs give different results!
    //     exp = 0;
    //     a1 = new Thread(t24a);
    //     a2 = new Thread(t24b);
    //     a3 = new Thread(t24c);
        
    //     a1.run();
    //     a2.run();
    //     a3.run();
        
    //     // System.out.println(t24a.algorithm()); 
    //     // System.out.println(t24b.algorithm()); 
    //     // System.out.println(t24c.algorithm()); 
        
    //     assertEquals(exp, t24a.algorithm()); // returns 27..
    //     assertEquals(exp, t24b.algorithm()); // returns 26..
    //     assertEquals(exp, t24c.algorithm()); // returns 21..
    // }    

    @Test
    public void t27() { //expected an error... all 3 algs give different results!
        a1 = new Thread(t27a);
        a2 = new Thread(t27b);
        a3 = new Thread(t27c);
        
        a1.run();
        a2.run();
        a3.run();
        
    //    System.out.println(t27a.algorithm()); 
    //    System.out.println(t27b.algorithm()); 
    //    System.out.println(t27c.algorithm()); 
        
        assertEquals(null, t27a.algorithm()); // returns 7..
        assertEquals(null, t27b.algorithm()); // returns 6..
        assertEquals(null, t27c.algorithm()); // returns 10..
    }

    @Test
    public void t28() { //expected an error... all 3 algs give different results!
        a1 = new Thread(t28a);
        a2 = new Thread(t28b);
        a3 = new Thread(t28c);
        
        a1.run();
        a2.run();
        a3.run();
        
    //    System.out.println(t28a.algorithm()); 
    //    System.out.println(t28b.algorithm()); 
    //    System.out.println(t28c.algorithm()); 
        
        assertEquals(null, t28a.algorithm()); // returns 19..
        assertEquals(null, t28b.algorithm()); // returns 18..
        assertEquals(null, t28c.algorithm()); // returns 20..
    }

    @Test
    public void t29() { //expected an error... all 3 algs give different results!
        a1 = new Thread(t29a);
        a2 = new Thread(t29b);
        a3 = new Thread(t29c);
        
        a1.run();
        a2.run();
        a3.run();
        
    //    System.out.println(t29a.algorithm()); 
    //    System.out.println(t29b.algorithm()); 
    //    System.out.println(t29c.algorithm()); 
        
        assertEquals(null, t29a.algorithm()); // returns 13..
        assertEquals(null, t29b.algorithm()); // returns 12..
        assertEquals(null, t29c.algorithm()); // returns 4..
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void t30() { //expected an error... all 3 algs give different results!
        exp = 0;
        a1 = new Thread(t30a);
        a2 = new Thread(t30b);
        a3 = new Thread(t30c);
        
        a1.run();
        a2.run();
        a3.run();
        
        // System.out.println(t30a.algorithm()); 
        // System.out.println(t30b.algorithm()); 
        // System.out.println(t30c.algorithm()); 
        
        assertEquals(exp, t30a.algorithm()); // returns 7..
        assertEquals(exp, t30b.algorithm()); // returns 19..
        assertEquals(exp, t30c.algorithm()); // returns 13..
    }   

    @Test
    public void t33() { //expected 11... all 3 algs give different results!
        exp = 11;
        a1 = new Thread(t33a);
        a2 = new Thread(t33b);
        a3 = new Thread(t33c);
        
        a1.run();
        a2.run();
        a3.run();
        
        // System.out.println(t33a.algorithm());
        // System.out.println(t33b.algorithm());
        // System.out.println(t33c.algorithm());
        
        assertEquals(exp, t33a.algorithm()); // returns 11..
        assertEquals(exp, t33b.algorithm()); // returns 10..
        assertEquals(exp, t33c.algorithm()); // returns 2..
    }

    @Test
    public void t34() { //expected 11... all 3 algs give different results!
        exp = 2;
        a1 = new Thread(t34a);
        a2 = new Thread(t34b);
        a3 = new Thread(t34c);
        
        a1.run();
        a2.run();
        a3.run();
        
        // System.out.println(t34a.algorithm());
        // System.out.println(t34b.algorithm());
        // System.out.println(t34c.algorithm());
        
        assertEquals(exp, t34a.algorithm()); // returns 2..
        assertEquals(exp, t34b.algorithm()); // returns 1..
        assertEquals(exp, t34c.algorithm()); // returns 10..
    }

    @Test
    public void t35() { //expected 11... all 3 algs give different results!
        exp = 5;
        a1 = new Thread(t35a);
        a2 = new Thread(t35b);
        a3 = new Thread(t35c);
        
        a1.run();
        a2.run();
        a3.run();
        
        // System.out.println(t35a.algorithm());
        // System.out.println(t35b.algorithm());
        // System.out.println(t35c.algorithm());
        
        assertEquals(exp, t35a.algorithm()); // returns 5..
        assertEquals(exp, t35b.algorithm()); // returns 4..
        assertEquals(exp, t35c.algorithm()); // returns 11..
    }

    @Test
    public void t36() { //expected 11... all 3 algs give different results!
        exp = 22;
        a1 = new Thread(t36a);
        a2 = new Thread(t36b);
        a3 = new Thread(t36c);
        
        a1.run();
        a2.run();
        a3.run();
        
        // System.out.println(t36a.algorithm());
        // System.out.println(t36b.algorithm());
        // System.out.println(t36c.algorithm());
        
        assertEquals(exp, t36a.algorithm()); // returns 22..
        assertEquals(exp, t36b.algorithm()); // returns 21..
        assertEquals(exp, t36c.algorithm()); // returns 4..
    }

    @Test
    public void t37() { //expected an error... all 3 algs give different results!
        a1 = new Thread(t37a);
        a2 = new Thread(t37b);
        a3 = new Thread(t37c);
        
        a1.run();
        a2.run();
        a3.run();
        
    //    System.out.println(t37a.algorithm()); 
    //    System.out.println(t37b.algorithm()); 
    //    System.out.println(t37c.algorithm()); 
        
        assertEquals(null, t37a.algorithm()); // returns 16..
        assertEquals(null, t37b.algorithm()); // returns 15..
        assertEquals(null, t37c.algorithm()); // returns 13..
    }

    @Test
    public void t38() { //expected an error... all 3 algs give different results!
        a1 = new Thread(t38a);
        a2 = new Thread(t38b);
        a3 = new Thread(t38c);
        
        a1.run();
        a2.run();
        a3.run();
        
    //    System.out.println(t38a.algorithm()); 
    //    System.out.println(t38b.algorithm()); 
    //    System.out.println(t38c.algorithm()); 
        
        assertEquals(null, t38a.algorithm()); // returns 1059..
        assertEquals(null, t38b.algorithm()); // returns 1058..
        assertEquals(null, t38c.algorithm()); // returns 7602..
    }

    @Test
    public void t39() { //expected an error... all 3 algs give different results!
        a1 = new Thread(t39a);
        a2 = new Thread(t39b);
        a3 = new Thread(t39c);
        
        a1.run();
        a2.run();
        a3.run();
        
    //    System.out.println(t39a.algorithm()); 
    //    System.out.println(t39b.algorithm()); 
    //    System.out.println(t39c.algorithm()); 
        
        assertEquals(null, t39a.algorithm()); // returns 24..
        assertEquals(null, t39b.algorithm()); // returns 23..
        assertEquals(null, t39c.algorithm()); // returns 85..
    }

    // @Test
    // public void t40() { //expected an error... all 3 algs give different results!
    //     exp = 0;
    //     a1 = new Thread(t40a);
    //     a2 = new Thread(t40b);
    //     a3 = new Thread(t40c);
        
    //     a1.run();
    //     a2.run();
    //     a3.run();
        
    //     System.out.println(t40a.algorithm()); 
    //     System.out.println(t40b.algorithm()); 
    //     System.out.println(t40c.algorithm()); 
        
    //     assertEquals(exp, t40a.algorithm()); // returns ..
    //     assertEquals(exp, t40b.algorithm()); // returns ..
    //     assertEquals(exp, t40c.algorithm()); // returns ..
    // }   
}

