package exercicio_heranca_poli;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class UsedProduct extends Product {
	
	private LocalDate manufactureDate;


	public UsedProduct(String name, Double price, LocalDate dateManu) {
		super(name, price);
		this.manufactureDate = dateManu;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public final String priceTag() {
		return super.name
		+ " $ "
		+ super.price
		+ " (Manufacture date: "
		+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
		+")";
	}
	
	
	
	
	
}
