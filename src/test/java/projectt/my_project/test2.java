package projectt.my_project;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class test2 extends TestCase {
	@Test
	public void testApp()
    {
    	Leaf leaf = new Leaf();
    	leaf.set_number(10);
    	Assert.assertEquals(10, leaf.get_number());
       
    }
	
	@Test
	public void testApp1()
    {
    Model_1 model1 = new Model_1();
    model1.set_points(500);
    	Assert.assertEquals(500 , model1.get_points());
       
    }
	@Test
	public void testApp2()
    {
    	Leaf leaf = new Leaf();
    	leaf.color = true;
    	leaf.set_number(10);
    	Assert.assertEquals(-10,leaf.add_get_number());
       
    }
	
	@Test
	public void testApp3()
    {
		Model_1 model1 = new Model_1();
	    model1.set_all_points(500);
	    model1.set_points(500);
    	Assert.assertEquals(model1.points,model1.get_all_points());
       
    }
	@Test
	public void testApp4()
    {
    	Composite composite = new Composite();
    String tytul =	composite.frame.getTitle();
    	Assert.assertEquals(tytul , "Projekt zaliczeniowy java");
       
    }
	@Test
	public void testApp5()
    {
    	Composite composite = new Composite();
    String tytul =	composite.konczace_okno.getTitle();
    	Assert.assertEquals(tytul , "Projekt zaliczeniowy java");
       
    }

}
