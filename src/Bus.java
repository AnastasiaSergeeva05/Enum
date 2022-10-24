public class Bus extends Transport{
    protected Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.printf("Автобус %s %s начинает двигаться",getBrand(),getModel());
    }

    @Override
    public void stopMove() {
        System.out.printf("Автобус %s %s начинает двигаться",getBrand(),getModel());

    }
}
