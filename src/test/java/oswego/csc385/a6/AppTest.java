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
//  string cannot be converted to int)
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
    JosephusCircle t18a = new Algorithm1(29, 2, Integer.MAX_VALUE);
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
    JosephusCircle t18b = new Algorithm2(29, 2, Integer.MAX_VALUE);
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
    JosephusCircle t18c = new Algorithm3(29, 2, Integer.MAX_VALUE);
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
        a1 = new Thread(t0a);
        a2 = new Thread(t0b);
        a3 = new Thread(t0c);
        
        a1.run();
	a2.run();
        a3.run();
        
        assertEquals(t0a.lastManStanding, 1);
        assertEquals(t0b.lastManStanding, 1); // This one fails, alg returns 0 instead of 1
        assertEquals(t0c.lastManStanding, 1);
    }
}
