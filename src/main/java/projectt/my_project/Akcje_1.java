package projectt.my_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

//kontroler
public class Akcje_1 implements AkcjeInterface {
	ActionListener action;
	
	
public Akcje_1(final Composite component,final Model_1 obserwator,final Teksty_lista teksty,final Akcje_2 zegar,final Strategia strategia){

	 action = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			Object source = e.getSource();
			
			
			for(int i = 0 ; i < 49 ; i++){
			if(source == component.children.get(i).button){
				component.children.get(i).change_color();
				obserwator.set_points(component.children.get(i).add_get_number());
				teksty.children.get(1).change_text("aktualne pkt : "+obserwator.get_points());
				
			}
			if(obserwator.get_points() == teksty.children.get(0).return_number()){
				obserwator.set_all_points(zegar.return_g());
				teksty.children.get(2).change_text("WYNIK :  "+obserwator.get_all_points());
				strategia.runda--;
				teksty.children.get(4).change_text("     "+strategia.runda);
				
				if(strategia.runda == 0){
					component.podsumuj(obserwator , strategia);
				}
				zegar.reset();
				strategia.reset();
			
			}
			}
		}
	};
}
public ActionListener get_ActionListener(){
	return action;
}

}
