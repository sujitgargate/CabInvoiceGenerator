public class CabFareInvoice {


   //Generates Fare For Cab Journey
   public double getTotalFareForJourney(double distance, double costPerKm, double minutesSpent, double farePerMinute) {
      double totalFare = distance * costPerKm + minutesSpent * farePerMinute;
      return totalFare;
   }
}
