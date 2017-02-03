package phonedimension.alphatram.com.phonedimensions.models;

/**
 * Created by Samrat on 4/2/17.
 */

public class Phone {

    /****************************/
    // Instance Variables
    /****************************/
    private String mBrand;

    private String mModel;

    private double mLength;

    private double mWidth;

    private double mThickness;

    /****************************/
    // Getters & Setters
    /****************************/

    public String getBrand() {
        return mBrand;
    }

    public void setBrand(String brand) {
        mBrand = brand;
    }

    public String getModel() {
        return mModel;
    }

    public void setModel(String model) {
        mModel = model;
    }

    public double getLength() {
        return mLength;
    }

    public void setLength(double length) {
        mLength = length;
    }

    public double getWidth() {
        return mWidth;
    }

    public void setWidth(double width) {
        mWidth = width;
    }

    public double getThickness() {
        return mThickness;
    }

    public void setThickness(double thickness) {
        mThickness = thickness;
    }
}
