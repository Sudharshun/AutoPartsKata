import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by localadmin on 1/20/17.
 */
//A car engine has a manufacturer, partNumber, description, displacement, compressionRatio. Car engines may be either a DieselEngine or a PetrolEngine. The engine itself is just one of many Engine Components.
//        A radiator has a manufacturer, partNumber, description, and coolantPressure. Radiators are part of the Cooling System for a car.
//        Another component of the Cooling System for a car is the fan blade. A fan blade has a manufacturer, partNumber, description, numberOfBlades, and diameterInCentimeters.
//        The camshaft is another Engine Component. It has a manufacturer, partNumber, description, duration, lift, and timing.
public class RadiatorTest {
    @Test
    public void createRadiatorTest(){
        Radiator radiator = new Radiator ("Ford", 1 , "cools things", 13.0);
        radiator.setPrice(145.00);

        assertEquals("Ford", radiator.getManufacturer());
        assertEquals(1, radiator.getPartNumber());
        assertEquals("cools things", radiator.getDescription());
        assertEquals(13.0, radiator.getPressure(),0.01);
        assertEquals(true, radiator.isCoolingComponent());
        assertEquals(false, radiator.isEngineComponent());
        assertEquals(145.00, radiator.getPrice(),0.01);
        assertEquals(159.50, radiator.getSubTotal(),0.01);
        assertEquals(false, radiator.isTaxExempt());

    }

   //"manufacturer: Nissen Automotive, partNumber: 17117507972,
    // description: The full-aluminum radiators from Nissens are produced on the
    // basis of the latest and most advanced technologies, including fully automatic
    // manufacturing and assembly lines, coolantPressure: 250 Pa"

    @Test
    public void displaysDetailstest(){
        Radiator radiator = new Radiator ("Ford", 1 , "cools things", 13.0);
        assertEquals("manufacturer:Ford,partNumber:1,description:cools things,EngineComponent:false,CoolingComponent:true,coolantPressure:13.0", radiator.fullDescription());


    }


}
