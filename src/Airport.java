// JAVA CODE

public class Airport {


    private int[] planes;

    public Airport() {
        this.planes = new int[20];
    }

    public String test() {
        return "confirmed";
    }

    public int printPlanesArray(int i) {
        return this.planes[i];
    }

    public String addPlane(int newAircraftNumber) {
        for(int i=0; i < this.planes.length; i++)
            if(this.planes[i] == 0) {
                this.planes[i] = newAircraftNumber;
                break;
            }
        return "Aircraft " + newAircraftNumber + " has been added to the Airport";

    }

    public String takeOff(int planeRegistration) {
        for(int i=0; i < this.planes.length; i++)
            if(this.planes[i] == planeRegistration) {
                this.planes[i] = 0;
                break;
            }
        return "Plane " + planeRegistration + " has taken off!";
    }

}
