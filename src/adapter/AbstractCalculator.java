package adapter;

public abstract class AbstractCalculator {
	
	protected double cost;
	protected double productCost;
	protected double serviceCost;
	public double rate = 1;
	
	
	public void setCalculation(double productCost, double serviceCost)
	{
		this.serviceCost = serviceCost;
		this.productCost = productCost;
		this.cost = this.productCost + this.serviceCost;	
	}
	
	public double requestTotal()
	{
		this.cost *= this.rate;
		return this.cost;
		
	}
	
}
