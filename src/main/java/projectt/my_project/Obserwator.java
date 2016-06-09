package projectt.my_project;

import javax.swing.JFrame;
import javax.swing.JPanel;

//model

public abstract class Obserwator extends JFrame {
	
public abstract void set_points(int point);

public  abstract void set_all_points(int point);

public abstract int get_points();

public abstract int get_all_points();

}
