package Homework_1_2;

public abstract class Vehicles {
    public class Airplane implements HasWheels, HasAScrew, HasWings, CarriesCargo{

        private boolean HasWheels;
        private boolean HasAScrew;
        private boolean HasWings;
        private boolean CarriesCargo;


        @Override
        public boolean GetHasWheels() {
            return HasWheels;
        }

        @Override
        public void setHasWheels(boolean value) {
            HasWheels=value;
        }

        @Override
        public boolean GetHasAScrew() {
            return HasAScrew;
        }

        @Override
        public void setHasAScrew(boolean value) {
            HasAScrew=value;
        }

        @Override
        public boolean GetHasWings() {
            return HasWings;
        }

        @Override
        public void setHasWings(boolean value) {
            HasWings=value;
        }

        @Override
        public boolean GetCarriesCargo() {
            return CarriesCargo;
        }

        @Override
        public void setCarriesCargo(boolean value) {
            CarriesCargo=value;
        }
    }
    public class Helicopter implements HasWheels, HasAScrew{

        private boolean HasWheels;
        private boolean HasAScrew;

        @Override
        public boolean GetHasWheels() {
            return HasWheels;
        }

        @Override
        public void setHasWheels(boolean value) {
            HasWheels=value;
        }

        @Override
        public boolean GetHasAScrew() {
            return HasAScrew;
        }

        @Override
        public void setHasAScrew(boolean value) {
            HasAScrew=value;
        }
    }
    public class Boat implements HasAScrew{

        private boolean HasAScrew;

        @Override
        public boolean GetHasAScrew() {
            return HasAScrew;
        }

        @Override
        public void setHasAScrew(boolean value) {
            HasAScrew=value;
        }
    }
    public class Tanker implements HasAScrew{

        private boolean HasAScrew;

        @Override
        public boolean GetHasAScrew() {
            return HasAScrew;
        }

        @Override
        public void setHasAScrew(boolean value) {
            HasAScrew=value;
        }
    }
    public class Truck implements HasWheels{

        private boolean HasWheels;

        @Override
        public boolean GetHasWheels() {
            return HasWheels;
        }

        @Override
        public void setHasWheels(boolean value) {
            HasWheels=value;
        }
    }
    public class Taxi implements HasWheels{

        private boolean HasWheels;

        @Override
        public boolean GetHasWheels() {
            return HasWheels;
        }

        @Override
        public void setHasWheels(boolean value) {
            HasWheels=value;
        }
    }

}
