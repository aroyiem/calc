package calc;

public class ModelTax {

	private Double minLimit;
	private Double maxLimit;
	private Double tax;

	public ModelTax(Double minLimit, Double maxLimit, Double tax) {
		super();
		this.minLimit = minLimit;
		this.maxLimit = maxLimit;
		this.tax = tax;
	}
	public Double getMinLimit() {
		return minLimit;
	}
	public Double getMaxLimit() {
		return maxLimit;
	}
	public Double getTax() {
		return tax;
	}

}
