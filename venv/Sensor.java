public class Sensor {
   public int sense(double p) {
       double value = Math.random();
       if (value > p) {
           return 1;
       } else {
           return 0;
       }
   }
}
