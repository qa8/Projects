package mf_plus.model;

/**
 * Created by admin on 01.03.2017.
 */
public class CostsData {
    private String number;
    private String vendor;
    private String type;
    private String description;
    private double sum;

    public String getNumber() {
        return number;
    }

    public String getVendor() {
        return vendor;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getSum() {
        return sum;
    }

    public CostsData withNumber(String number) {
        this.number = number;
        return this;
    }

    public CostsData withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    public CostsData withType(String type) {
        this.type = type;
        return this;
    }

    public CostsData withDescription(String description) {
        this.description = description;
        return this;
    }

    public CostsData withSum(double sum) {
        this.sum = sum;
        return this;
    }
}
