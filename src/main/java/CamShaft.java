/**
 * Created by localadmin on 1/20/17.
 */
public class CamShaft extends Part {


    private double duration;
    private double lift;
    private double timing;


    public CamShaft(String manufacturer, int partNumber, String description, double duration, double lift, double timing) {
        super(manufacturer, partNumber, description);
        setEngineComponent();
        setIsTaxExempt();

        this.duration = duration;
        this.lift = lift;
        this.timing = timing;
    }


    public String fullDescription() {
        String desc = super.fullDescription() + ",duration:" + getDuration() +
                ",lift:" + getLift() +
                ",timing:" + getTiming();

        return desc;

    }

    public double getDuration() {
        return this.duration;
    }

    public double getLift() {
        return this.lift;
    }


    public double getTiming() {
        return this.timing;
    }
}
