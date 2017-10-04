package adapter;

public class EuroAdapter extends EuroCalculator implements ICalculator{

	EuroAdapter()
	{
		this.requester();
	}

	public double requester()
	{
		this.rate = 0.82;
		return this.rate;
	}
	
}
