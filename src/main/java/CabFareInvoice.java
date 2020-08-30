public class CabFareInvoice {


   public double getTotalFareForJourney(double distance, double costPerKm, double minutesSpent, double farePerMinute) {
      double totalFare = distance * costPerKm + minutesSpent * farePerMinute;
      return totalFare;
   }
}
