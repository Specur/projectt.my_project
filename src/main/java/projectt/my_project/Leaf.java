package projectt.my_project;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//widok
public class Leaf extends Component {
	
	public JButton button ;
	private int number;
	public boolean color ;
	private JLabel tekst;
	
	
	
	
	
	public JButton dodaj(int a , int b , int c , int d , ActionListener e, int g ) {
		Random generator = new Random();
		number = 1+generator.nextInt(9);
		button = new JButton(""+get_number());
		button.setBounds(a, b, c, d);
		set_action(e);
		color = true;
		set_color();
		return button ;
	}
	public void zmien_nr(){
		Random generator = new Random();
		number = 1+generator.nextInt(9);
		button.setText(""+number);
	}
	public int get_number(){
		return number;
	}
	public void set_number(int x){
		number = x;
	}
	@Override
	public int add_get_number(){
		if(color == false){
			return number;
		}else return -number;
	}
	
	public void set_color(){
		if(color == true){
			button.setBackground(Color.GRAY);
		}else if(color == false){
		    button.setBackground(Color.GREEN);
		}
	}
	@Override
	public void change_color(){
		if(color == true){color = false;
		}else if(color == false)color = true;
		
		set_color();
	}
	public void set_action(ActionListener a){
		button.addActionListener(a);
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
