/**
 * 
 */
package adapter;

/**
 * @author ckulig4
 *
 */
public class Main {

	public static void main(String[] args) {
		CalculatorClient c = new CalculatorClient(40, 50);
		System.out.println(c.makeDollarRequest());
		
		EuroAdapter e = new EuroAdapter();
		e.setCalculation(40, 50);

		System.out.println(c.makeAdapterRequest(e));
		
	}

}
