package projectt.my_project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;
import java.text.*;
import javax.swing.Timer;


class Akcje_2   {
	Timer timer; 
	int g = 100 ;
	public Akcje_2(final Teksty_lista teksty){
		
		
		
		
		 timer = new Timer(1000, new ActionListener() {
			 public void actionPerformed(ActionEvent evt) {
				 --g;
				 teksty.change_text(" "+g, 3);
				 
			 } 
		});
		
		 timer.start();
		
		
		
		
		
		
		
		
		
	}

	public int return_g(){
		return g;
	}
	
	
	public void reset(){
		g = 100 ;
	}
	}