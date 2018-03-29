package quad;

public class QuadraticFormula implements Comparable<QuadraticFormula> {

	@Override
	public int compareTo(QuadraticFormula arg0) {
		// TODO Auto-generated method stub
		if(this.equals(arg0)) {
			
		}
		
		
		
		return 0;
	}

	int a,b,c;
	
	public QuadraticFormula(int ain,int bin,int cin) 
	{
		a=ain;
		b=bin;
		c=cin;
		
	}
	
	public boolean equals(QuadraticFormula qf) {
		
		if(a == qf.a && b == qf.b && c == qf.c) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public double out(double x) {
		
		//Hello
		double out = (a*(x*x))+b*x+c;
		return out;
	}
	
	
	public String toString() {
		
		
		return (a+"x^2"+b+"x"+c);
		
		
		
	}
	
	
	
	
}
