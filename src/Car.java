public class Car {
    public String carName;
    public String carBrand;
    public String carModel;
    public int carManufacturingYear;
    public int noOfTyres;
    public int noOfSeates;

    public Car details(){
        Car carD =new Car();
        carD.carBrand ="BMW";
        carD.carModel ="xm";
        carD.carName="BMW XM";
        carD.mileage=9;
        carD.carManufacturingYear=2024;
        carD.noOfGears=4;
        carD.noOfSeates=7;
        carD.noOfTyres=4;
        System.out.println(carD);
        return (carD);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carManufacturingYear=" + carManufacturingYear +
                ", noOfTyres=" + noOfTyres +
                ", noOfSeates=" + noOfSeates +
                ", mileage=" + mileage +
                ", noOfGears=" + noOfGears +
                '}';
    }

    public double mileage;
    public int noOfGears;


}
