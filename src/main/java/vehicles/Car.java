package vehicles;

import products.IProduct;

public class Car extends Vehicle implements ILandVehicle, IMotorised{

    private IMotorised engine;
    private int wheelCount;

    public Car(float weight, int maxSpeed, IProduct baseProduct, IMotorised engine){
        super(weight, maxSpeed, baseProduct);
        this.engine = engine;
        this.wheelCount = 4;
    }

    @Override
    public int getWheelCount() {
        return this.wheelCount;
    }

    @Override
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }
}
