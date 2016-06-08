package projectt.my_project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//widok
public class Composite extends Component {
	public static JFrame frame = new JFrame("Projekt zaliczeniowy java");
	public static JFrame konczace_okno = new JFrame("Projekt zaliczeniowy java");
	public ArrayList<Leaf> children = new ArrayList< Leaf >();
	 
	public Composite(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setLayout(null);
		frame.setBounds(10, 10, 800, 600);	
		frame.setVisible(true);
		setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	}
	

	@Override
	public void dodaj(int a, int b, int c, int d,ActionListener e) {
		// TODO Auto-generated method stub
		Leaf leaf = new Leaf();
	    frame.add(leaf.dodaj( a , b , c , d , e , 0 ));
		children.add(leaf);
		frame.repaint();
	}
	public void podsumuj(Model_1 podsum , Strategia strategia){
		frame.dispose();
		JOptionPane.showMessageDialog(null, "Gratuluje "+strategia.imie+" uzyskales  " + podsum.get_all_points()+" punkty");
		zapisz_wyniki(podsum , strategia);
		setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}
	
	public void zapisz_wyniki(Model_1 podsum , Strategia strategia){
		File plikDane = new File("wyniki.txt");
		String plik_zawartosc[] = new String[6];
		Scanner skaner = null;
		try {
			skaner = new Scanner(plikDane);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0 ;i<6 ; i++ ){
			
			plik_zawartosc[i]=skaner.nextLine();
		}
		try {
			PrintWriter out = new PrintWriter("wyniki.txt");
		
		
		
		
		if(podsum.get_all_points()>Integer.valueOf(plik_zawartosc[1])){
			System.out.println("llflfl");
			out.println(strategia.imie);
			out.println(podsum.get_all_points());
			out.println(plik_zawartosc[0]);
			out.println(plik_zawartosc[1]);
			out.println(plik_zawartosc[2]);
			out.println(plik_zawartosc[3]);
		}else if(podsum.get_all_points()>Integer.valueOf(plik_zawartosc[3])){
			
			out.println(plik_zawartosc[0]);
			out.println(plik_zawartosc[1]);
			out.println(strategia.imie);
			out.println(podsum.get_all_points());
			out.println(plik_zawartosc[2]);
			out.println(plik_zawartosc[3]);
		}else if(podsum.get_all_points()>Integer.valueOf(plik_zawartosc[5])){
			
			out.println(plik_zawartosc[0]);
			out.println(plik_zawartosc[1]);
			out.println(plik_zawartosc[2]);
			out.println(plik_zawartosc[3]);
			out.println(strategia.imie);
			out.println(podsum.get_all_points());
		}else if(podsum.get_all_points()<Integer.valueOf(plik_zawartosc[5])){			
			out.println(plik_zawartosc[0]);
			out.println(plik_zawartosc[1]);
			out.println(plik_zawartosc[2]);
			out.println(plik_zawartosc[3]);
			out.println(plik_zawartosc[4]);
			out.println(plik_zawartosc[5]);
		}
		out.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	   
	@Override
	public JButton dodaj(int a, int b, int c, int d, ActionListener e, int g) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void set_points(int point) {
		// TODO Auto-generated method stub
		
	}



}
