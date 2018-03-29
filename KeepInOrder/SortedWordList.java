import java.util.ArrayList;

public class SortedWordList extends ArrayList<String>{

	public SortedWordList() {
		super();
	}
	
	public SortedWordList(int size) {
		super(size);
	}
	public boolean contains(String str) {
		if(this.indexOf(str) == -1) {
			return false;
		}
		
		return true;
		
	}
	public int indexOf(String s) {
		int left = 0;
		int right = this.size()-1;

		while(left <= right) {
			int middle = (left+right)/2;

			if(this.get(middle).equalsIgnoreCase(s)) {
				return middle;
			}
			
			else if (this.get(middle).compareToIgnoreCase(s) < 0) {
				left = middle+1;

			}
			
			else {
				
				//System.out.println(this.get(middle));
				
				right = middle-1;
			}
		}
		
		return -1;
	}
	
	
	
	public String set (int i , String str) {
		
		String temp = this.get(i);
		//if(i > 0)
		//System.out.println(str.toLowerCase().charAt(0) > this.get(i-1).toLowerCase().charAt(0));
	//	System.out.println(str.toLowerCase().charAt(0) < this.get(i+1).toLowerCase().charAt(0));

			if((i == 0 || this.get(i-1).compareToIgnoreCase(str)<0) && (i == this.size()-1) ||this.get(i+1).compareToIgnoreCase(str)>0) {
				return super.set(i, str);
			}
			else {
				System.out.println("Word =" + str + " i=" + i);
				throw new IllegalArgumentException("word="+ str + " i=" + i  );
			}

		
		
	}
	public boolean add(String str) {
		if ( this.contains( str ) )
        {
            return false;
        }

        int low = 0;
        int high = this.size() - 1;
        int middle;
        
        while ( low <= high )
        {

            middle = ( low + high ) / 2;

            int subtract = str.compareTo( this.get( middle ) );
            if ( subtract > 0 )
            {
                low = middle + 1;
            }
            else if ( subtract < 0 )
            {
                high = middle - 1;
            }
        }
        super.add( high + 1, str );
        return true;		
	}
	public void add(int i, String str) {
		
	}
	
	
	
	
	
	

	
	
}
