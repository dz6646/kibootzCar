public class Vehicles {
        private int vehicleNum;
        private int vehicleAge;
        private int wheelsNum;
        private String controlType;
        private int polutionPerMin;

        public Vehicles(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin) {
            this.vehicleNum = vehicleNum;
            this.vehicleAge = vehicleAge;
            this.wheelsNum = wheelsNum;
            this.controlType = controlType;
            this.polutionPerMin = polutionPerMin;
        }
        public double exhaust()
        {
            return (60 * this.polutionPerMin);
        }
        @Override
        public String toString() {
            return "Vehicles{" +
                    "vehicleNum=" + vehicleNum +
                    ", vehicleAge=" + vehicleAge +
                    ", wheelsNum=" + wheelsNum +
                    ", controlType='" + controlType + '\'' +
                    ", polutionPerMin=" + polutionPerMin +
                    '}';
        }

        public int getVehicleNum() {
            return vehicleNum;
        }

        public void setVehicleNum(int vehicleNum) {
            this.vehicleNum = vehicleNum;
        }

        public int getVehicleAge() {
            return vehicleAge;
        }

        public void setVehicleAge(int vehicleAge) {
            this.vehicleAge = vehicleAge;
        }

        public int getWheelsNum() {
            return wheelsNum;
        }

        public void setWheelsNum(int wheelsNum) {
            this.wheelsNum = wheelsNum;
        }

        public String getControlType() {
            return controlType;
        }

        public void setControlType(String controlType) {
            this.controlType = controlType;
        }

        public int getPolutionPerMin() {
            return polutionPerMin;
        }

        public void setPolutionPerMin(int polutionPerMin) {
            this.polutionPerMin = polutionPerMin;
        }

}
