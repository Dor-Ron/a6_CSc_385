package oswego.csc385.a6;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest {
    Thread a1, a2, a3;
//  NOTE: Commented objects cannot be tested due to incompatible types
//  (string cannot be converted to int) or are otherwise untestable
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
    JosephusCircle t15a = new Algorithm1(150, 151, Integer.MAX_VALUE + 1);
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
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
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
        
        assertEquals(exp, t0a.lastManStanding);
        assertEquals(exp, t0b.lastManStanding); // Fail: returns 0 instead of 1
        assertEquals(exp, t0c.lastManStanding);
    }
    
    @Test
    public void t1() {
        exp = 27;
        a1 = new Thread(t1a);
        a2 = new Thread(t1b);
        a3 = new Thread(t1c);
        
        a1.run();
	a2.run();
        a3.run();
        
        assertEquals(exp, t1a.lastManStanding); 
        assertEquals(exp, t1b.lastManStanding); // Fail: returns 26 insteal of 27
        assertEquals(exp, t1c.lastManStanding);
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void t2() {
        a1 = new Thread(t2a);
        a2 = new Thread(t2b);
        a3 = new Thread(t2c);
        
        a1.run();
	a2.run();
        a3.run();
        
        assertEquals(null, t2a.lastManStanding);
        assertEquals(null, t2b.lastManStanding);
        assertEquals(null, t2c.lastManStanding);
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
        
        assertEquals(exp, t3a.lastManStanding); 
        assertEquals(exp, t3b.lastManStanding); // Fail: returns 0 instead of 1 
        assertEquals(exp, t3c.lastManStanding); 
    }
    
    @Test
    public void t4() { //appears to be an outlier... all 3 algs give different results!
        a1 = new Thread(t4a);
        a2 = new Thread(t4b);
        a3 = new Thread(t4c);
        
        a1.run();
	a2.run();
        a3.run();
        
//        System.out.println(t4a.lastManStanding);
//        System.out.println(t4b.lastManStanding); 
//        System.out.println(t4c.lastManStanding); 
        
        assertEquals(null, t4a.lastManStanding); // returns 37..
        assertEquals(null, t4b.lastManStanding); // returns 36..
        assertEquals(null, t4c.lastManStanding); // returns 31..
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void t5() {
        a1 = new Thread(t5a);
        a2 = new Thread(t5b);
        a3 = new Thread(t5c);
        
        a1.run();
	a2.run();
        a3.run();
        
//        System.out.println(t5a.lastManStanding);
//        System.out.println(t5b.lastManStanding); 
//        System.out.println(t5c.lastManStanding); 
        
        assertEquals(null, t5a.lastManStanding);
        assertEquals(null, t5b.lastManStanding);
        assertEquals(null, t5c.lastManStanding);
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void t7() {
        a1 = new Thread(t7a);
        a2 = new Thread(t7b);
        a3 = new Thread(t7c);
        
        a1.run();
	a2.run();
        a3.run();
        
//        System.out.println(t7a.lastManStanding);
//        System.out.println(t7b.lastManStanding); 
//        System.out.println(t7c.lastManStanding); 
        
        assertEquals(null, t7a.lastManStanding);
        assertEquals(null, t7b.lastManStanding);
        assertEquals(null, t7c.lastManStanding);
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
        
//        System.out.println(t8a.lastManStanding);
//        System.out.println(t8b.lastManStanding); 
//        System.out.println(t8c.lastManStanding); 
        
        assertEquals(exp, t8a.lastManStanding);
        assertEquals(exp, t8b.lastManStanding); // Fail: returns 25 insread of 26
        assertEquals(exp, t8c.lastManStanding);
    }
    
    @Test
    public void t9() { //appears to be an outlier... all 3 algs give different results!
        a1 = new Thread(t9a);
        a2 = new Thread(t9b);
        a3 = new Thread(t8c);
        
        a1.run();
	a2.run();
        a3.run();
        
//        System.out.println(t9a.lastManStanding); 
//        System.out.println(t9b.lastManStanding); 
//        System.out.println(t9c.lastManStanding); 
        
        assertEquals(null, t9a.lastManStanding); // returns 20..
        assertEquals(null, t9b.lastManStanding); // returns 19..
        assertEquals(null, t9c.lastManStanding); // returns 0..
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void t10() {
        a1 = new Thread(t10a);
        a2 = new Thread(t10b);
        a3 = new Thread(t10c);
        
        a1.run();
	a2.run();
        a3.run();
        
        assertEquals(null, t10a.lastManStanding); 
        assertEquals(null, t10b.lastManStanding);
        assertEquals(null, t10c.lastManStanding); 
    }
    
    @Test
    public void t12() { // error was expected here, but all 3 algs return 0!
        exp = 0;
        a1 = new Thread(t12a);
        a2 = new Thread(t12b);
        a3 = new Thread(t12c);
        
        a1.run();
	a2.run();
        a3.run();
        
//        System.out.println(t12a.lastManStanding); 
//        System.out.println(t12b.lastManStanding); 
//        System.out.println(t12c.lastManStanding); 
        
        assertEquals(exp, t12a.lastManStanding);
        assertEquals(exp, t12b.lastManStanding);
        assertEquals(exp, t12c.lastManStanding);
    }
    
    @Test
    public void t13() { //appears to be an outlier... all 3 algs give different results!
        exp = 0;
        a1 = new Thread(t13a);
        a2 = new Thread(t13b);
        a3 = new Thread(t13c);
        
        a1.run();
	a2.run();
        a3.run();
        
//        System.out.println(t13a.lastManStanding); 
//        System.out.println(t13b.lastManStanding); 
//        System.out.println(t13c.lastManStanding); 
        
        assertEquals(exp, t13a.lastManStanding); // returns 119..
        assertEquals(exp, t13b.lastManStanding); // returns 118..
        assertEquals(exp, t13c.lastManStanding); // returns 130..
    }
    
    @Test
    public void t14() { //appears to be an outlier... all 3 algs give different results!
        a1 = new Thread(t14a);
        a2 = new Thread(t14b);
        a3 = new Thread(t14c);
        
        a1.run();
	a2.run();
        a3.run();
        
//        System.out.println(t14a.lastManStanding); 
//        System.out.println(t14b.lastManStanding); 
//        System.out.println(t14c.lastManStanding); 
        
        assertEquals(null, t14a.lastManStanding); // returns 116..
        assertEquals(null, t14b.lastManStanding); // returns 115..
        assertEquals(null, t14c.lastManStanding); // returns 140..
    }
    
    @Test
    public void t15() { // error was expected here, but all 3 algs return 0!
        exp = 0;
        a1 = new Thread(t15a);
        a2 = new Thread(t15b);
        a3 = new Thread(t15c);
        
        a1.run();
	a2.run();
        a3.run();
        
//        System.out.println(t15a.lastManStanding); 
//        System.out.println(t15b.lastManStanding); 
//        System.out.println(t15c.lastManStanding); 
        
        assertEquals(exp, t15a.lastManStanding); 
        assertEquals(exp, t15b.lastManStanding); 
        assertEquals(exp, t15c.lastManStanding); 
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
        
//        System.out.println(t17a.lastManStanding); 
//        System.out.println(t17b.lastManStanding); 
//        System.out.println(t17c.lastManStanding); 
        
        assertEquals(exp, t17a.lastManStanding); 
        assertEquals(exp, t17b.lastManStanding); // Fail: returns 1 instead of 2
        assertEquals(exp, t17c.lastManStanding); 
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
        
//        System.out.println(t20a.lastManStanding); 
//        System.out.println(t20b.lastManStanding); 
//        System.out.println(t20c.lastManStanding); 
        
        assertEquals(1, t20a.lastManStanding); 
        assertEquals(1, t20b.lastManStanding); // Fail: returns 0 instead of 1
        assertEquals(1, t20c.lastManStanding); 
    }
    
    @Test
    public void t21() { //appears to be an outlier... all 3 algs give different results!
        a1 = new Thread(t21a);
        a2 = new Thread(t21b);
        a3 = new Thread(t21c);
        
        a1.run();
	a2.run();
        a3.run();
        
//        System.out.println(t21a.lastManStanding); 
//        System.out.println(t21b.lastManStanding); 
//        System.out.println(t21c.lastManStanding); 
        
        assertEquals(null, t21a.lastManStanding); // returns 68..
        assertEquals(null, t21b.lastManStanding); // returns 67..
        assertEquals(null, t21c.lastManStanding); // returns 70..
    }
    
     @Test
    public void t22() { //appears to be an outlier... all 3 algs give different results!
        a1 = new Thread(t22a);
        a2 = new Thread(t22b);
        a3 = new Thread(t22c);
        
        a1.run();
	a2.run();
        a3.run();
        
//        System.out.println(t22a.lastManStanding); 
//        System.out.println(t22b.lastManStanding); 
//        System.out.println(t22c.lastManStanding); 
        
        assertEquals(null, t22a.lastManStanding); // returns 26..
        assertEquals(null, t22b.lastManStanding); // returns 24..
        assertEquals(null, t22c.lastManStanding); // returns 76..
    }
}
