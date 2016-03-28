package demotest.complexIntegerPackage;

public class ComplexIntegerMethods {
	
	public ComplexIntegerMethods(){
			
	}
	
	public boolean isBiggerThan(int x, int y){
		
		boolean isBiggerThan;
		
		if (x > y){
			isBiggerThan = true;
		}
		else{
			isBiggerThan = false;
		}
		
		return isBiggerThan;
		
	}
	
	public int returnBiggerNumber(int x, int y){
		
		int output;
		
		if( x > y){
			output = x;
		}
		else if(y > x){
			output = y;
		} 
		else {
			output = 0;
		}
		
		return output;
		
	}
	
	
	
}
