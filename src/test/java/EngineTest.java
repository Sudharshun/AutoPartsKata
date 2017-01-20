import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by localadmin on 1/20/17.
 */
//A car engine has a manufacturer, partNumber, description, displacement, compressionRatio. Car engines may be either a DieselEngine or a PetrolEngine. The engine itself is just one of many Engine Components.
//        A radiator has a manufacturer, partNumber, description, and coolantPressure. Radiators are part of the Cooling System for a car.
//        Another component of the Cooling System for a car is the fan blade. A fan blade has a manufacturer, partNumber, description, numberOfBlades, and diameterInCentimeters.
//        The camshaft is another Engine Component. It has a manufacturer, partNumber, description, duration, lift, and timing.
public class EngineTest {
    @Test
    public void createEngineTest(){
        Engine engine = new Engine ("Ford", 1 , "v6", 1348, 13.0,"Diesel");
        engine.setPrice(645.00);

        assertEquals("Diesel", engine.getType());
        assertEquals("Ford", engine.getManufacturer());
        assertEquals(1, engine.getPartNumber());
        assertEquals(1348, engine.getDisplacement());
        assertEquals("v6", engine.getDescription());
        assertEquals(13.0, engine.getRatio(),0.01);
        assertEquals(false, engine.isCoolingComponent());
        assertEquals(true, engine.isEngineComponent());
        assertEquals(645.00, engine.getPrice(),0.01);
        assertEquals(645.00, engine.getSubTotal(),0.01);
        assertEquals(true, engine.isTaxExempt());



    }

   //"manufacturer: Nissen Automotive, partNumber: 17117507972,
    // description: The full-aluminum radiators from Nissens are produced on the
    // basis of the latest and most advanced technologies, including fully automatic
    // manufacturing and assembly lines, coolantPressure: 250 Pa"

    @Test
    public void displaysDetailstest(){
        Engine engine = new Engine ("Ford", 1 , "v6", 1348, 13.0, "Diesel");
        assertEquals("manufacturer:Ford,partNumber:1,description:v6,EngineComponent:true,CoolingComponent:false,displacement:1348,compressionRatio:13.0,engineType:Diesel", engine.fullDescription());


    }


}
