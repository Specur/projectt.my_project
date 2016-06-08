package projectt.my_project;

import java.awt.event.ActionListener;

import javax.swing.JButton;

//widok
/**
 * Hello world!
 *
 */
public abstract class Component extends Obserwator {
    
	
	
	protected Object button;
	public abstract JButton dodaj(int a , int b , int c , int d ,ActionListener e,int g);
	public abstract void dodaj(int a, int b, int c, int d,ActionListener e);
	public void change_color() {
		// TODO Auto-generated method stub
		
	}
	public int add_get_number() {
		// TODO Auto-generated method stub
		return 0;
	}
	
    
    
    
    
}
