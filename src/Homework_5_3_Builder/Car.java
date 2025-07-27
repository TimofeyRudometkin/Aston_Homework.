package Homework_5_3_Builder;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Car {
    private String model;
    private String engine;
    private boolean hasAirConditioning;
    private boolean hasSunroof;

    public Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.hasAirConditioning = builder.hasAirConditioning;
        this.hasSunroof = builder.hasSunroof;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    public static class CarBuilder {
        private String model;
        private String engine;
        private boolean hasAirConditioning;
        private boolean hasSunroof;

        public CarBuilder(String model) {
            this.model = model;
        }

        public CarBuilder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder withAirConditioning(Boolean AirConditioning) {
            this.hasAirConditioning = AirConditioning;
            return this;
        }

        public CarBuilder withSunroof(Boolean Sunroof) {
            this.hasSunroof = Sunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
