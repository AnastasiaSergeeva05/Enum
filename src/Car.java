public class Car extends Transport{
    protected Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.printf("Машина %s %s начинает двигаться",getBrand(),getModel());

    }

    @Override
    public void stopMove() {
        System.out.printf("Машина %s %s заканчивает двигаться",getBrand(),getModel());

    }
}
