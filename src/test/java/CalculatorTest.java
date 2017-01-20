import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;


/**
 * Created by localadmin on 1/20/17.
 */
public class CalculatorTest {

    @Test
    public void testing_calculator() {
        List<Part> myListOfParts = new ArrayList<Part>();

        CamShaft camshaft = new CamShaft("Ford", 1, "cools things", 13.0, 12.0, 1.5);
        camshaft.setPrice(10.0);
        Engine engine = new Engine("Ford", 1, "v6", 1348, 13.0, "Diesel");
        engine.setPrice(15.0);
        Fanblade fanBlade = new Fanblade("Takeda", 1, "cools things", 5, 10.45);
        fanBlade.setPrice(25.0);

        myListOfParts.add(engine);
        myListOfParts.add(camshaft);
        myListOfParts.add(fanBlade);

        Calculator calculator = new Calculator();
        calculator.setProductList(myListOfParts);

        assertEquals(52.50, calculator.getTotal(), 0.01);
    }


}
