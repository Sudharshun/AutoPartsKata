import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by localadmin on 1/20/17.
 */
//A car engine has a manufacturer, partNumber, description, displacement, compressionRatio. Car engines may be either a DieselEngine or a PetrolEngine. The engine itself is just one of many Engine Components.
//        A camshaft has a manufacturer, partNumber, description, and coolantPressure. CamShafts are part of the Cooling System for a car.
//        Another component of the Cooling System for a car is the fan blade. A fan blade has a manufacturer, partNumber, description, numberOfBlades, and diameterInCentimeters.
//        The camshaft is another Engine Component. It has a manufacturer, partNumber, description, duration, lift, and timing.
public class CamShaftTest {
    @Test
    public void createCamShaftTest(){
        CamShaft camshaft = new CamShaft ("Ford", 1 , "cools things",13.0,12.0,1.5);
        camshaft.setPrice(645.00);
        assertEquals("Ford", camshaft.getManufacturer());
        assertEquals(1, camshaft.getPartNumber());
        assertEquals("cools things", camshaft.getDescription());
        assertEquals(13.0, camshaft.getDuration(),0.01);
        assertEquals(12.0, camshaft.getLift(),0.01);
        assertEquals(1.5, camshaft.getTiming(),0.01);
        assertEquals(false, camshaft.isCoolingComponent());
        assertEquals(true, camshaft.isEngineComponent());
        assertEquals(645.00, camshaft.getPrice(),0.01);
        assertEquals(645.00, camshaft.getSubTotal(),0.01);
        assertEquals(true, camshaft.isTaxExempt());

    }

   //"manufacturer: Nissen Automotive, partNumber: 17117507972,
    // description: The full-aluminum radiators from Nissens are produced on the
    // basis of the latest and most advanced technologies, including fully automatic
    // manufacturing and assembly lines, coolantPressure: 250 Pa"

    @Test
    public void displaysDetailstest(){
        CamShaft camshaft = new CamShaft ("Ford", 1 , "cools things",13.0,12.0,1.5);
        assertEquals("manufacturer:Ford,partNumber:1,description:cools things,EngineComponent:true,CoolingComponent:false,duration:13.0,lift:12.0,timing:1.5", camshaft.fullDescription());


    }


}
