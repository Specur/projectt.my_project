package projectt.my_project;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Teksty extends Component{
	
	public int number;
	private JLabel tekst;
public JLabel set_Text_do_ustalania_pkt(String tekst ,int  x, int y, int width,int height ){
		
		
		Random generator = new Random();
		number = 30+generator.nextInt(30);
		this.tekst = new JLabel(tekst + number);
		this.tekst.setBounds(x, y, width, height);
		change_styl_tekst();
		return this.tekst;
			
	}
public JLabel set_Text_aktualna_liczba_pkt(String tekst ,int  x, int y, int width,int height ){
		
		
		this.tekst = new JLabel(tekst);
		this.tekst.setBounds(x, y, width, height);
		change_styl_tekst();
		return this.tekst;
			
	}
	public void change_text(String text){
		this.tekst.setText(text);
		
	}
	
	public void change_styl_tekst(){
		
		
		tekst.setFont(new Font("Serif",Font.BOLD,30));
	}
	
	
	public int return_number(){
		return number;
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

}
