public class Truck extends Transport{
    protected Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.printf("Грузовик %s %s начинает двигаться",getBrand(),getModel());

    }

    @Override
    public void stopMove() {
        System.out.printf("Грузовик %s %s заканчивает двигаться",getBrand(),getModel());

    }
}
