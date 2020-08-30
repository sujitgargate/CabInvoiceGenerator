public class CabFareInvoice {

   int COST_PER_KM = 10;
   int FARE_PER_MIN = 1;
   public final int MIN_FARE = 5;


   //Formula For Calculation Of Total Fare
   public double calculateTotalFare(double distance, double waitingTime) {
      double totalFare = distance * COST_PER_KM + waitingTime * FARE_PER_MIN;
      return totalFare;
   }

   //Generates Fare For Cab Journey
   public double getTotalFareForJourney(double distance, double waitingTime) {
      double totalFare = this.calculateTotalFare(distance, waitingTime);
      return Math.max(totalFare, MIN_FARE);
   }

   //Genrates Total Fare For Muiltiple Journey
   public double getTotalFareForMuiltipleJourney(Journey[] journey) {
      double totalFareForMuiltipleJourney = 0;
      for (Journey journeyloop : journey) {
         totalFareForMuiltipleJourney = this.getTotalFareForJourney(journeyloop.distanceTravelled, journeyloop.waitingTime);
      }
      return totalFareForMuiltipleJourney;
   }

   public InvoiceSummary getTotalFareForMuiltipleJourneySummary(Journey[] muiltipleRides) {
      double totalFareForMuiltipleJourney = 0;
      for (Journey muiltipleRidesLoop : muiltipleRides) {
         totalFareForMuiltipleJourney += this.getTotalFareForJourney(muiltipleRidesLoop.distanceTravelled, muiltipleRidesLoop.waitingTime);
      }
      return new InvoiceSummary(muiltipleRides.length, totalFareForMuiltipleJourney);
   }
}
