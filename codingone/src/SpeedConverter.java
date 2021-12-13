public class SpeedConverter {

    public static void main(String[] args) {
       int M = (int)toMilesPerHour(25.42);
       System.out.println(M);
       printConversion(75.114);
    }

    public static long toMilesPerHour( double kilometersPerHour ){
        if (kilometersPerHour <0){
            return -1;
        }else
        {
            long miles = Math.round(kilometersPerHour / 1.609);
            return miles;

        }
    }

    public static void printConversion ( double kilometersPerHour){
        if( kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour= Math.round(kilometersPerHour / 1.609);

            //long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h " + "= " + milesPerHour + " mi/h ");
        }
    System.out.println("hello");
    }

}
