package calc;

public class MainCalc {

    public static void main(String args[]) {
        TaxServiceImpl calcServ = new TaxServiceImpl();
        double taxRetrieved = calcServ.calculateTaxAmount(20000.0d);
        System.out.print(taxRetrieved);
    }

}