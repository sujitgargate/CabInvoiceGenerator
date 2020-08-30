
public class CabFareInvoice {

   int COST_PER_KM = 10;
   int FARE_PER_MIN = 1;
   public final int MIN_FINAL_FARE = 5;


   //Formula For Calculation Of Total Fare
   public double calculateTotalFare(double distance, double minutesSpent) {
      double totalFare = distance * COST_PER_KM + minutesSpent * FARE_PER_MIN;
      return totalFare;
   }

   //Generates Fare For Cab Journey
   public double getTotalFareForJourney(double distance, double minutesSpent) {
      double totalFare = this.calculateTotalFare(distance, minutesSpent);
      return Math.max(totalFare, MIN_FINAL_FARE);
   }

   //Genrates Total Fare For Muiltiple Journey
   public double getTotalFareForMuiltipleJourney(Journey[] journey) {
      double totalFareForMuiltipleJourney = 0;
      for(Journey journeyloop:journey) {
         totalFareForMuiltipleJourney = this.getTotalFareForJourney(journeyloop.distanceTravelled, journeyloop.COST_PER_KM);
      }
      return totalFareForMuiltipleJourney;
   }
}
