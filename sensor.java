public class Sensor{
public int sense(int x) {
   double value = Math.random();
   if(value>x)
   {
    return 1;
   }
   else
   {
    return 0;
   }
}}