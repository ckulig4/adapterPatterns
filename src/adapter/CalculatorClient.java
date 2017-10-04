package adapter;

public class CalculatorClient {

	public DollarCalculator DollarRequest;
	
	CalculatorClient(double productCost, double serviceCost)
	{
		this.DollarRequest = new DollarCalculator();
		this.DollarRequest.setCalculation(productCost, serviceCost);
	}
	
	public double makeAdapterRequest(ICalculator req)
	{
		return req.requestTotal();
	}
	
	public double makeDollarRequest()
	{
		return this.DollarRequest.requestTotal();
	}
}
