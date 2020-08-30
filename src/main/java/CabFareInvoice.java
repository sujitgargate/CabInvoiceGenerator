public class CabFareInvoice {


   //Generates Fare For Cab Journey
   public double getTotalFareForJourney(double distance, double COST_PER_KM, double minutesSpent, double FARE_PER_MINUTE) {
      double totalFare = distance * COST_PER_KM + minutesSpent * FARE_PER_MINUTE;
      if(totalFare < 5) {
         return 5;
      }
      return totalFare;
   }
}
