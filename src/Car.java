import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competition {
    public Car(String brand, String model, float engineVolume) {
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

    @Override
    public void PitStop() {
        System.out.printf("Машина %s %s в ПитСтопе \n",getBrand(),getModel());

    }

    @Override
    public int getbestTime() {
        return ThreadLocalRandom.current().nextInt(1,1400);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,500);
    }
}
