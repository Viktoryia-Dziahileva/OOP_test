package JavaZaawansowana;



    public class Car extends Vehicle {

        private Engine engine = new FuelEngine();

        private CarTypeStrategy typeStrategy;

        @Override
        protected void accelerate(int speed) {
            if(stared) {
                engine.setSpeed(speed);
            } //todo - throw exception


        }

        @Override
        public void start() {
            stared = true;
            engine.start();
        }

        @Override
        public void stop() {
            stared = false;
            engine.stop();
        }

        public void setTypeStrategy(CarTypeStrategy typeStrategy){
            this.typeStrategy = typeStrategy;
        }

        public String getType() {
            return this.typeStrategy.getType();
        }

        public Car() {
        }

        public Car(String name) {
            super(name);
        }
    }
}
