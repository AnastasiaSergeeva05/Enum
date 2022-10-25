import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport  implements Competition{
    public Truck(String brand, String model, float engineVolume) {
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

    @Override
    public void PitStop() {
        System.out.printf("Грузовики %s %s в ПитСтопе\n",getBrand(),getModel());

    }

    @Override
    public int getbestTime() {
        return ThreadLocalRandom.current().nextInt(1,1500);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,190);
    }
}
