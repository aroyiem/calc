package calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;


public class ServiceTest {
    private TaxServiceImpl calcServ;

    @BeforeEach
    public void setUp() {
        calcServ = new TaxServiceImpl();
    }

    @Test
    @DisplayName("Check we have tax brackets")
    public void checkTaxAmount() {
        fail("Need to write test case");
    }

}
