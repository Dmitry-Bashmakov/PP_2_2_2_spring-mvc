package web.model;

public class Car {

    private String model;
    private String series;
    private String type;

    public Car() {}

    public Car(String model, String series, String type) {
        this.model = model;
        this.series = series;
        this.type = type;
    }

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public String getSeries() {return series;}

    public void setSeries(String series) {this.series = series;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}
}
