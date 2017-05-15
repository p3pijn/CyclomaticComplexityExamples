package nl.sig.examples;


public class CyclomaticComplexityExamples{


	public void SwitchWithDefault(){
		//+1 for the standard path
		String input = "";
	
		switch(input){
			case "a":
				//+1 for complexity
				break;
			default:
				//default path, so no added complexity
				break;
		}
	}
	
	public void SwitchWithoutDefault(){
		//+1 for the standard path
		String input = "";
	
		switch(input){
			case "a":
				//+1 for complexity
				break;
		}
		//no default case expressed in code
	}
	
	public void IfWithoutElse(){
		//+1 for the standard path
		
		if(someBoolean){
			//+1 for alternating path
		}
	}
	
	public void IfWithoutElse(){
		//+1 for the standard path
		
		if(someBoolean){
			//+1 for alternating path
		}else{
			//no extra code path here
		}
	}
	
	public void IfElseChain(){
		//+1 for the standard path
		
		if(someBoolean){
			//+1 for alternating path
		}else if(someOtherBoolean){
			//+1 for alternating path	
		}else{
			//no extra code path here
		}
	}
	
	


}