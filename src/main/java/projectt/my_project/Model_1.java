package projectt.my_project;

public class Model_1 extends Obserwator{
	
	public int points;
	private int all_points;
	public Model_1(){
		points = 0 ;
	}
	
	public void set_points(int point){
		points += point;
	}
	public int get_points(){
		return points;
	}
	
	
	public void set_all_points(int point){
		all_points += point;
	}
	public int get_all_points(){
		return all_points;
	}

}
