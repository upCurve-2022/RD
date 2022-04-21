package pos;

public class chef extends Thread {
   pizza pi;
   Cheflistner listen;

   public chef(pizza pi, Cheflistner listen) {
      super();
      this.pi = pi;
      this.listen = listen;
   }

   @Override
   public void run() {
      try {
         Thread.sleep((long) (pi.getCookingTime()*1000));
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      listen.pizzacooked(pi);
   }

}
