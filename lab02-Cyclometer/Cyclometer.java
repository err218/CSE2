//Emma Resnick
//5 September 2014
//CSE2
//lab02

public class Cyclometer {
    
    // main method required for Java programs
    public static void main(String arg[]) {
        int secsTrip1=480; //the amount of time Trip 1 took (in seconds)
        int secsTrip2=3220; //the amount of time Trip 2 took (in seconds)
        int countsTrip1=1561; // the amount of counts during Trip 1
        int countsTrip2=9037; // the amount of counts during Trip 2
        double wheelDiameter=27.0,
        PI=3.14159, // a number used to calculate distance
        feetPerMile=5280, //converting miles into feet and vice versa
        inchesPerFoot=12, //converting feet into inches and vice versa
        secondsPerMinute= 60; //how many seconds there are per minute
        double distanceTrip1, distanceTrip2, totalDistance;
        System.out.println("Trip 1 took "  + (secsTrip1/secondsPerMinute) + " minutes and had "  + countsTrip1+  " counts.");
        System.out.println("Trip 2 took "  + (secsTrip2/secondsPerMinute) + " minutes and had "  + countsTrip2+  " counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        /* (for each count, a rotation of the wheel travels 
        the diameter in inches times PI)*/
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance= distanceTrip1+distanceTrip2;
        //Print out the output data.
        System.out.println("Trip 1 was "  +distanceTrip1 +" miles");
        System.out.println("Trip 2 was "  +distanceTrip2 +" miles");
        System.out.println("The total distance was " +totalDistance+ " miles");
    } //end of method
} // end of class
