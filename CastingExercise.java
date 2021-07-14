package almamatters;

public class CastingExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte b=10;
        
        byte i=b;// will accept - automatic type promotion
        
        byte c=i;// will not accept - because lower type cannot be put in higher
      
        byte d=(byte)i;// Type casting makes it possible to store compatible types.
        
        byte x=10;
        byte y=20;
        
        byte sum=(byte) (x*y); // Error is thrown because when two bytes are used in a arthmetic operation, the result will be integer
        
	}

}
