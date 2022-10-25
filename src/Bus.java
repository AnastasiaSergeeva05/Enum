import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competition {
    public Bus(String brand, String model, float engineVolume) {
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

    @Override
    public void PitStop() {
        System.out.printf("Автобус %s %s в ПитСтопе \n",getBrand(),getModel());
    }

    @Override
    public int getbestTime() {
        return ThreadLocalRandom.current().nextInt(1,1500);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,200);
    }
}
