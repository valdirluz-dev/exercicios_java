package list;

import java.util.function.BiFunction;

public enum OperationEnum {
	SUM (Integer::sum), 
	SUBTRACTION((Integer v1, Integer v2) -> v1 - v2),
	DIVISION ((Integer v1, Integer v2) -> v1/v2),
	MULTIPLY ((Integer v1, Integer v2) -> v1 * v2)
	;
	
	private final BiFunction <Integer, Integer, Integer> calculate;
	
	OperationEnum (BiFunction <Integer, Integer, Integer> calculate){
		this.calculate = calculate;
	}
	
	public BiFunction <Integer, Integer, Integer> getCalculate (){
		return calculate;
	}
	
}
