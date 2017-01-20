/**
 * Created by localadmin on 1/20/17.
 */
public class Fanblade extends Part{


    private int numberOfBlades;
    private double diameter;

    public Fanblade(String manufacturer, int partNumber, String description, int numberOfBlades , double diameter) {

        super(manufacturer,partNumber,description);
        setCoolingComponent();
        this.numberOfBlades = numberOfBlades;
        this.diameter = diameter;
    }


    public String fullDescription() {


        String desc = super.fullDescription()   +
                ",numberOfBlades:" + getNumberOfBlades() +
                ",diameter:" + getDiameter();
        return  desc;

    }

    public int getNumberOfBlades() {
        return this.numberOfBlades;
    }

    public double getDiameter() {
        return this.diameter;
    }
}
