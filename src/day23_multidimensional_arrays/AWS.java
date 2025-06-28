package day23_multidimensional_arrays;
/*
 Printout this format for each zone
 $app is deploying on $zone

    loopcamp is deploting on us-east1
    loopcamp is deploting on us-west1
    loopcamp is deploting on us-north1
    loopcamp is deploting on us-south1
 */
public class AWS {
    public static void main(String[] args) {
        String appName = "loopcamp";
        String awsZones = "us-east1, us-west1, us-north1, us-south1";


        String [] zones = awsZones.split(", "); // [us-east1, us-west1, us-north1, us-south1]
        //System.out.println(Arrays.toString(zones));

        for ( String eachZone : zones){
            System.out.println(appName + " is deploying on " + eachZone );
        }



    }
}
