// JAVA CODE

public class Airport {

    private int[] planes;
    private String weather;

    public Airport() {
        this.planes = new int[100];
        this.weather = "Thunder";
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
                System.out.println(this.weather);
                this.planes[i] = 0;
                break;
            }
        return "Plane " + planeRegistration + " has taken off!";
    }

}
