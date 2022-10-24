public class Main {
    public static void main(String[] args) {


        Car car = new Car("BMW", "Z8", 1.5F);


        Bus buses = new Bus("Ауди",
                "A8 50 L TDI quattro", 2.5F);

        Bus bus = new Bus("KIA", "Sportage", 3.5F);


        Truck truck = new Truck("Hyundai", "Avante", 3.4F);


        infoCar(car);
        infoBuses(buses);
        infoTruck(truck);
        infoBus(bus);


    }

    public static void infoCar(Car car) {
        System.out.println(car);
    }

        public static void infoBus (Bus bus ) {
            System.out.println(bus);
        }

            public static void infoBuses(Bus buses) {
                System.out.println(buses);
            }

                public static void infoTruck(Truck truck ) {
                    System.out.println(truck);

            }
        }
