/**
 * Created by localadmin on 1/20/17.
 */
public class Radiator extends Part{

    double coolantPressure;

    Radiator(String manufacturer, int partNumber, String description, double coolantPressure) {
        super(manufacturer,partNumber, description);
        setCoolingComponent();
        this.coolantPressure = coolantPressure;
    }


    public double getPressure() {
        return this.coolantPressure;
    }

    public String fullDescription() {
        String desc = super.fullDescription()+",coolantPressure:"+getPressure();
        return desc;
    }
}
