import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by localadmin on 1/20/17.
 */
//A car engine has a manufacturer, partNumber, description, displacement, compressionRatio. Car engines may be either a DieselEngine or a PetrolEngine. The engine itself is just one of many Engine Components.
//        A fanBlade has a manufacturer, partNumber, description, and coolantPressure. Radiators are part of the Cooling System for a car.
//        Another component of the Cooling System for a car is the fan blade. A fan blade has a manufacturer, partNumber, description, numberOfBlades, and diameterInCentimeters.
//        The camshaft is another Engine Component. It has a manufacturer, partNumber, description, duration, lift, and timing.
public class FanbladeTest {
    @Test
    public void createFanBladeTest(){
        Fanblade fanBlade = new Fanblade ("Takeda", 1 , "cools things",5,10.45);
        fanBlade.setPrice(145.00);
        assertEquals("Takeda", fanBlade.getManufacturer());
        assertEquals(1, fanBlade.getPartNumber());
        assertEquals("cools things", fanBlade.getDescription());
        assertEquals(5, fanBlade.getNumberOfBlades());
        assertEquals(10.45, fanBlade.getDiameter(),0.01);
        assertEquals(true, fanBlade.isCoolingComponent());
        assertEquals(false, fanBlade.isEngineComponent());
        assertEquals(145.00, fanBlade.getPrice(),0.01);
        assertEquals(159.50, fanBlade.getSubTotal(),0.01);
        assertEquals(false, fanBlade.isTaxExempt());


    }

   //"manufacturer: Nissen Automotive, partNumber: 17117507972,
    // description: The full-aluminum fanBlades from Nissens are produced on the
    // basis of the latest and most advanced technologies, including fully automatic
    // manufacturing and assembly lines, coolantPressure: 250 Pa"

    @Test
    public void displaysDetailstest(){
        Fanblade fanBlade = new Fanblade ("Takeda", 1 , "cools things",5,10.45);
        assertEquals("manufacturer:Takeda,partNumber:1,description:cools things,EngineComponent:false,CoolingComponent:true,numberOfBlades:5,diameter:10.45", fanBlade.fullDescription());


    }


}
