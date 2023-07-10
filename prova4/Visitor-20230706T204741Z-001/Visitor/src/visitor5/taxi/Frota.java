package visitor5.taxi;

import java.util.ArrayList;
import java.util.List;

public class Frota {

	private List<Taxi> taxis = new ArrayList<>();

	public void add(Taxi taxi) {
		this.taxis.add(taxi);
	}
	
	public void accept(AtendimentoVisitor visitor) {
		for(Taxi t : taxis) {
			t.accept(visitor);
			
			if(visitor.isAtendido())
				break;
		}
		
	}
}
