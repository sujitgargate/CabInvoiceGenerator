public class Journey {

   public int WaitingTime;
   public int COST_PER_KM;
   public double distanceTravelled;
   public int FARE_PER_MIN;

   public Journey(double distanceTravelled, int COST_PER_KM, int WaitingTime, int FARE_PER_MIN) {
      this.distanceTravelled = distanceTravelled;
      this.COST_PER_KM = COST_PER_KM;
      this.WaitingTime = WaitingTime;
      this.FARE_PER_MIN = FARE_PER_MIN;
   }
}

