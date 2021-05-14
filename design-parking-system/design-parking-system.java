class ParkingSystem {
    
    private int[] parkingCarSize;
    
    public ParkingSystem(int big, int medium, int small) {
        this.parkingCarSize = new int[]{big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if( parkingCarSize[carType-1] >= 1 )
        {
            parkingCarSize[carType-1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */