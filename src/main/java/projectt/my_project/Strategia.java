package projectt.my_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

//kontroler
public class Strategia {
	String imie =JOptionPane.showInputDialog("Prosze podac nawe gracza");
	Composite component = new Composite();
	Model_1 obserwator = new Model_1();
	Teksty_lista teksty = new Teksty_lista();
	Akcje_2 zegar = new Akcje_2(teksty);
	Akcje_1 akcja = new Akcje_1(component,obserwator,teksty,zegar,this);
	int runda = 5 ;
	
	
	
	

	
	public Strategia(){
		 teksty.dodaj_tekst_liczba_pkt_do_uzyskania(" ", 250, 420, 300, 100);
			teksty.dodaj_tekst_liczba_pkt_uzyskanych("aktualne pkt : "+obserwator.get_points(), 180, 25, 300, 100);
			teksty.dodaj_tekst_liczba_pkt_uzyskanych("WYNIK : "+obserwator.get_points(), 550, 75, 300, 100);
			teksty.dodaj_tekst_liczba_pkt_uzyskanych("100", 590, 10, 300, 100);
			teksty.dodaj_tekst_liczba_pkt_uzyskanych("     "+runda, 1, 1, 90, 50);
			teksty.dodaj_tekst_liczba_pkt_uzyskanych("RANKING:", 550, 200, 300, 100);
		////////////////////////////////////////////////////////////////////////////////////////\<><>><>
		FileReader fr = null;
		   String linia = "";
		   String linia2 = "";

		   // OTWIERANIE PLIKU:
		   try {
		     fr = new FileReader("wyniki.txt");
		   } catch (FileNotFoundException e) {
		       System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
		       System.exit(1);
		   }

		   BufferedReader bfr = new BufferedReader(fr);
		   // ODCZYT KOLEJNYCH LINII Z PLIKU:
		   try {
			   int i = 1;
		     while((linia = bfr.readLine()) != null){
		    	 linia2 = bfr.readLine();
		    	 teksty.dodaj_tekst_liczba_pkt_uzyskanych(linia+" "+ linia2, 550, 155+(i+1)*50, 300, 100);
		    	 i++;
		     }
		    } catch (IOException e) {
		        System.out.println("BŁĄD ODCZYTU Z PLIKU!");
		        System.exit(2);
		   }

		   // ZAMYKANIE PLIKU
		   try {
		     fr.close();
		    } catch (IOException e) {
		         System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
		         System.exit(3);
		        }
		    
		
	      
	      
	      
	      ////////////////////////////////////////////////////////////////////////////////////////
		
	   
		
		for(int j = 0 ; j< 7; j++)
			for(int i = 0 ; i < 7; i ++){
				component.dodaj(100+50*i,100+50*j,45,45,akcja.get_ActionListener());
			}
		
		
	
		
		
		
	}

	
	public void reset(){
		obserwator.points=0;
		
		Random generator = new Random();
		int number = 30+generator.nextInt(30);
		teksty.children.get(0).change_text(""+number);
		teksty.children.get(0).number=number;
		teksty.children.get(1).change_text("aktualne pkt : "+obserwator.get_points());
			for(int i = 0 ; i < 49; i ++){
				component.children.get(i).zmien_nr();
				component.children.get(i).color = true;
				component.children.get(i).set_color();
			}
			
			
			
			
			
	}





public static void main(String[]args){

	Strategia gramy = new Strategia();

}
}
