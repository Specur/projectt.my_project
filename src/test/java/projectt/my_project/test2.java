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
    	Leaf leaf = new Leaf();
    	leaf.color = false;
    	Assert.assertFalse(leaf.color);
       
    }
	@Test
	public void testApp2()
    {
    	Leaf leaf = new Leaf();
    	leaf.color = false;
    	Assert.assertFalse(leaf.color);
       
    }
	@Test
	public void testApp3()
    {
    	Leaf leaf = new Leaf();
    	leaf.color = false;
    	Assert.assertFalse(leaf.color);
       
    }
	@Test
	public void testApp4()
    {
    	Leaf leaf = new Leaf();
    	leaf.color = false;
    	Assert.assertFalse(leaf.color);
       
    }
	

}
