
public class CabFareInvoice {

   //CabFareInvoice cabFareInvoice = new CabFareInvoice();

   public double calculateTotalFare(double distance, double COST_PER_KM, double minutesSpent, double FARE_PER_MINUTE) {
      double totalFare = distance * COST_PER_KM + minutesSpent * FARE_PER_MINUTE;
      return totalFare;
   }

   //Generates Fare For Cab Journey
   public double getTotalFareForJourney(double distance, double COST_PER_KM, double minutesSpent, double FARE_PER_MINUTE) {
      double totalFare = this.calculateTotalFare(distance, COST_PER_KM, minutesSpent, FARE_PER_MINUTE);

      if(totalFare < 5) {
         return 5;
      }
      return totalFare;
   }

   //Genrates Total Fare For Muiltiple Journey
   public double getTotalFareForMuiltipleJourney(Journey[] journey) {
      double totalFareForMuiltipleJourney = 0;
      for(Journey journeyloop:journey) {
         totalFareForMuiltipleJourney = this.getTotalFareForJourney(journeyloop.distanceTravelled, journeyloop.COST_PER_KM, journeyloop.WaitingTime, journeyloop.FARE_PER_MIN);
      }
      return totalFareForMuiltipleJourney;
   }
}
