/**
 * Created by localadmin on 1/20/17.
 */
public class Engine extends Part {
    String engineType;
    int displacement;
    double ratio;

    Engine(String manufacturer, int partNumber, String description, int displacement, double ratio, String engineType) {
        super(manufacturer, partNumber, description);
        setEngineComponent();
        setIsTaxExempt();
        this.engineType = engineType;
        this.displacement = displacement;
        this.ratio = ratio;

    }


    public String getType() {
        return this.engineType;
    }


    public int getDisplacement() {
        return this.displacement;
    }

    public double getRatio() {
        return this.ratio;
    }

    public String fullDescription() {
        String desc = super.fullDescription() + ",displacement:" + getDisplacement() + ",compressionRatio:" + getRatio() + ",engineType:" + getType();

        return desc;
    }
}
