
public class FizzBuzz {
	Integer initialValue;
	Integer finalValue;
	
	public FizzBuzz (Integer initialValue, Integer finalValue) throws Exception {
		this.initialValue = initialValue;
		this.finalValue = finalValue;
		if (initialValue > finalValue) {
			throw new BiggerInitialValueException("Initial value is bigger than final value!");
		}
	}
	
	public String calculate () {
		String result = null;
		for (int i=initialValue; i<=finalValue; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result = i + " fizzBuzz";
			} else if (i % 3 == 0) {
				result = i + " fizz";
			} else if (i % 5 == 0) {
				result = i + " buzz";
			} else {
				result = String.valueOf(i);
			}
			System.out.println(result);
		}
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		FizzBuzz fizzBuzz = new FizzBuzz(77, 15);
		fizzBuzz.calculate();
	}
	
}
