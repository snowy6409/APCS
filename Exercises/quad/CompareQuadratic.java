package quad;

import java.util.Comparator;

public class CompareQuadratic implements Comparator<QuadraticFormula>{

	@Override
	public int compare(QuadraticFormula qf1, QuadraticFormula qf2) {
		// TODO Auto-generated method stub
		int out = 0;
		if(qf1.out(0) == qf2.out(0)) {
			out = 1;
		}
		
		
		
		
		return out;
	}

	public int compare(QuadraticFormula qf1, QuadraticFormula qf2,double x) {
		// TODO Auto-generated method stub
		int out = 0;
		if(qf1.out(x) == qf2.out(x)) {
			out = 1;
		}
		
		return out;
	}

	
	
	
}
