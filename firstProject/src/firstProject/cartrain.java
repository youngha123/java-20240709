     public class cartrain {
        public interface Vehicle {
            void accelerate();
            void stop();
            void setStart(boolean status);
        }
        
        public abstract class Car implements Vehicle {
             String vin;
             String color;
             boolean isStart;
        
            public Car(String vin, String color) {
                this.vin = vin;
                this.color = color;
                this.isStart = false; 
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
                int gear;
        
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
            public AutomaticCar(String vin, String color) {
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
                String trainNumber;
                String departureStation;
                String arrivalStation;
                boolean isStart;
        
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
                 int passengerCount;
        
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
                 double cargoWeight;
        
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
       
                
            
     }
        
    

    