package calc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxServiceImpl implements TaxService {


	/*
	A program that accepts a salary and return the calculated tax amount. Tax is applied in bands

	•	0-10,000	    ->	1.5%
	•	10,000-20,000	->	2.5%
	•	20,000-50,000	->	4.75%
	•	50,000-100,000	->	8.25%
	•	>100,000	    ->	10.5%

	Bands are not cumulative. For a salary of 15,000 tax due is 2.5% * 15,000
	•	Code must be production ready
	•	Test cases for at least one class
	 */

    public TaxServiceImpl() {

    }

    @Override
    public double calculateTaxAmount(double salary) {
        List<ModelTax> allTaxes = this.allTaxes();

        Double taxRate = allTaxes.stream().filter(t ->  (salary > t.getMinLimit() && t.getMaxLimit() == null ) || ( t.getMaxLimit() != null && salary >= t.getMinLimit() && salary <= t.getMaxLimit())
        ).findFirst().get().getTax();

        return taxRate;
    }

    public List<ModelTax> allTaxes(){

        List<ModelTax> taxClubs = new ArrayList<>();
        ModelTax modelTax1 = new ModelTax(0.0, 10000.0, 1.5);
        ModelTax modelTax2 = new ModelTax(10000.0, 20000.0, 2.5);
        ModelTax modelTax3 = new ModelTax(20000.0, 30000.0, 4.75);
        ModelTax modelTax4 = new ModelTax(30000.0, 40000.0, 6.75);
        ModelTax modelTax5 = new ModelTax(40000.0, 50000.0, 8.25);
        ModelTax modelTax6 = new ModelTax(50000.0, null, 10.25);


        taxClubs.add(modelTax1);
        taxClubs.add(modelTax2);
        taxClubs.add(modelTax3);
        taxClubs.add(modelTax4);
        taxClubs.add(modelTax5);
        taxClubs.add(modelTax6);

        return taxClubs;
    }
}
