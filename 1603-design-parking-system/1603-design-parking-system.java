class ParkingSystem {
    int big;
    int medium;
    int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
public boolean addCar(int carType) {
    if (carType == 1) {          // Big car
        if (big > 0) {           // Check if any big slot is free
            big--;               // Use one big slot (decrease count)
            return true;         // Parking successful
        }
    } else if (carType == 2) {   // Medium car
        if (medium > 0) {        // Check if any medium slot is free
            medium--;            // Use one medium slot
            return true;         // Parking successful
        }
    } else if (carType == 3) {   // Small car
        if (small > 0) {         // Check if any small slot is free
            small--;             // Use one small slot
            return true;         // Parking successful
        }
    }
    return false; // If no slot available, parking fails
}

}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */