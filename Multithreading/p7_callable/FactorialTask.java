package p7_callable;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {
	private int number;
	
	public FactorialTask(int number) {
		this.number = number;
	}
	
	@Override
	public Integer call() throws Exception {
		int factorial = 1;
		if(number < 0) {
			throw new InvalidParameterException("Number must be positive.");
		} else {
			for(int i = number; i > 1; i--) {
				factorial *= i;
			}
		}
		return factorial;
	}
	
	class InvalidParameterException extends Exception {
		public InvalidParameterException(String message) {
			super(message);
		}
	}

}
