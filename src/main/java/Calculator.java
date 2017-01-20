import java.util.ArrayList;
import java.util.List;

/**
 * Created by localadmin on 1/20/17.
 */
public class Calculator {
    private List<Part> productList;
    private double total;

    public Calculator() {
        this.total = 0.0;
        this.productList = new ArrayList<>();
    }

    public void setProductList(List<Part> productList) {
        this.productList = productList;
    }

    public double getTotal() {
        for(Part part : productList){
            total += part.getSubTotal();
        }
        return this.total;
    }
}
