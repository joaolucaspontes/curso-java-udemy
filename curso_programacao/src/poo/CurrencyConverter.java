package poo;

public class CurrencyConverter {
	
	
	public static final double IOF = 0.06;
	public static double reais;

	
	public static double calculator (double dollarPrice, double dollar) {
		return (dollar * dollarPrice) + IOF * (dollar * dollarPrice);
	}
}
