public interface Vehicle {
    void accelerate();
    void stop();
    void setStart(boolean status);
}

public abstract class Car implements Vehicle {
     String vin;
     String color;
     boolean isStart;

    public Car(String vin, String color, boolean isStart) {
        this.vin = vin;
        this.color = color;
        this.isStart = false; // default to not started
    }

    @Override
    public void accelerate() {
        System.out.println("자동차가 가속하고 있습니다.");
    }

    @Override
    public void stop() {
        System.out.println("차가 멈추고 있습니다.");
    }

    @Override
    public void setStart(boolean status) {
        this.isStart = status;
    }

    public String getVin() {
        return vin;
    }

    public String getColor() {
        return color;
    }

    public boolean isStart() {
        return isStart;
    }
}

public class ManualCar extends Car {
    private int gear;

    public ManualCar(String vin, String color) {
        super(vin, color);
        this.gear = 0;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void accelerate() {
        System.out.println("수동 변속기 자동차가 가속합니다!");
    }

    @Override
    public void stop() {
        System.out.println("수동 변속기 자동차가 정차합니다!.");
    }
}

public class AutomaticCar extends Car {
    public AutomaticCar(String vin, String color, ) {
        super(vin, color);
    }

    @Override
    public void accelerate() {
        System.out.println("자동 변속기 자동차가 가속합니다!");
    }

    @Override
    public void stop() {
        System.out.println("자동 변속기 자동차가 정차합니다!");
    }
}

public abstract class Train implements Vehicle {
    private String trainNumber;
    private String departureStation;
    private String arrivalStation;
    private boolean isStart;

    public Train(String trainNumber, String departureStation, String arrivalStation) {
        this.trainNumber = trainNumber;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.isStart = false; 
    }

    @Override
    public void accelerate() {
        System.out.println("기차가 가속합니다.");
    }

    @Override
    public void stop() {
        System.out.println("기차가 정차합니다.");
    }

    @Override
    public void setStart(boolean status) {
        this.isStart = status;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public boolean isStart() {
        return isStart;
    }
}

public class PassengerTrain extends Train {
    private int passengerCount;

    public PassengerTrain(String trainNumber, String departureStation, String arrivalStation, int passengerCount) {
        super(trainNumber, departureStation, arrivalStation);
        this.passengerCount = passengerCount;
    }

    @Override
    public void accelerate() {
        System.out.println("여객 열차가 천천히 가속합니다!");
    }

    @Override
    public void stop() {
        System.out.println("여객 열차가 천천히 정차합니다!");
    }
}

public class FreightTrain extends Train {
    private double cargoWeight;

    public FreightTrain(String trainNumber, String departureStation, String arrivalStation, double cargoWeight) {
        super(trainNumber, departureStation, arrivalStation);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void accelerate() {
        System.out.println("화물 열차가 느리게 가속합니다!");
    }

    @Override
    public void stop() {
        System.out.println("화물 열차가 느리게 정차합니다!");
    }
}

public class App {
    public static void main(String[] args) {
        ManualCar manualCar = new ManualCar("10가1234", "blue");
        manualCar.setGear(0); 

        AutomaticCar automaticCar = new AutomaticCar("10가5678", "red");

        PassengerTrain passengerTrain = new PassengerTrain("KTX001", "서울", "부산", 200);

        FreightTrain freightTrain = new FreightTrain("Cargo001", "부산", "구미", 100.0);

        Vehicle[] vehicles = {manualCar, automaticCar, passengerTrain, freightTrain};
  
        for (Vehicle vehicle : vehicles) {
            vehicle.setStart(true); 
            vehicle.accelerate();
            vehicle.stop();
            vehicle.setStart(false); 
            System.out.println();
        }
    }
}
