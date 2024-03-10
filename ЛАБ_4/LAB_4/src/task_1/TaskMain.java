package task_1;

import task_1.enums.BodyTypes;

class TaskMain {
    public static void main(String[] args) {
        try {
            Car car = new Car("LADA", "aubergine", BodyTypes.SEDAN);

            Engine engine = new Engine(1.6,96,6.5);
            Wheel[] wheels = {
                    new Wheel(205, 55, 16),
                    new Wheel(205, 55, 16),
                    new Wheel(205, 55, 16),
                    new Wheel(205, 55, 16)
            };

            car.setEngine(engine);
            car.setWheels(wheels);

            car.setMass(1150);
            car.setSeatsAmount(5);
            car.setFuelTankVolume(43);

            System.out.println("ХАРАКТЕРИСТИКИ АВТОМОБИЛЯ:");
            System.out.println(car);

            car.fillFuel(40);
            car.drive(200);
            System.out.printf("\nОставшееся топливо: %.1f\n", car.getFuelValue());

            System.out.println("\nКолеса:");
            car.changeWheel(0, new Wheel(205, 45, 16));
            printWheels(wheels);


            car.drive(400);
            System.out.printf("\nОставшееся топливо: %.1f\n", car.getFuelValue());

            car.fillFuel(50);
            car.drive(800);

            System.out.printf("\nОставшееся топливо: %.1f\n", car.getFuelValue());

        } catch (IllegalArgumentException e) {
            System.err.println("\n" + e);
        }
    }

    /**
     * Prints out array of wheels
     * @param wheels - array of wheels
     */
    private static void printWheels(Wheel[] wheels) {
        for (Wheel wheel : wheels) {
            System.out.println(wheel);
        }
    }
}
