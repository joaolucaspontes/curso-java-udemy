package exercicio_heranca_poli;

public class ImportedProduct extends Product{

	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	@Override
	public String priceTag() {
		return super.name
				+ "$ "
				+ totalPrice()
				+ " (Customs fee: $ "
				+ customsFee
				+")";
	}
	
	public final double totalPrice() {
		return super.price + customsFee;
	}
}