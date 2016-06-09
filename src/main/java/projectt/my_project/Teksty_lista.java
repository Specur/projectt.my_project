package projectt.my_project;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class Teksty_lista extends Component {

	
	public ArrayList<Teksty> children = new ArrayList< Teksty >();
	 
	
	public void dodaj_tekst_liczba_pkt_do_uzyskania(String text ,int a , int b , int c, int d){
		Teksty teksty = new Teksty();
		Composite.frame.add(teksty.set_Text_do_ustalania_pkt(text, a, b, c, d));
		children.add(teksty);
		Composite.frame.repaint();
	}
	public void dodaj_tekst_liczba_pkt_uzyskanych(String text ,int a , int b , int c, int d){
		Teksty teksty = new Teksty();
		Composite.frame.add(teksty.set_Text_aktualna_liczba_pkt(text, a, b, c, d));
		children.add(teksty);
		Composite.frame.repaint();
	}
	
	public void change_text(String text,int index){
		children.get(index).change_text(text);
	}
	@Override
	public JButton dodaj(int a, int b, int c, int d, ActionListener e, int g) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void dodaj(int a, int b, int c, int d, ActionListener e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void set_points(int point) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void podsumuj(Model_1 podsum, Strategia strategia) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void set_all_points(int point) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int get_points() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int get_all_points() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
