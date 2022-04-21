 package pos;

import javax.swing.*;

public class UI implements Cheflistner {

    public static void main(String[] args) {
        UI ui=new UI();
        for(int i=0;i<5;i++)
        ui.prompt();

    }
    public void prompt() {
        pizza ct = new pizza("Cheese and tomato", 200, 5);
        pizza bbq = new pizza("BBQ", 340, 8);
        pizza farmpizza = new pizza("farmpizza", 450, 8);
        pizza[] availablepizzas = new pizza[]{ct, bbq, farmpizza};
        for (pizza pi : availablepizzas) {
            System.out.println(pi.getName());
        }
        int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose your pizza:"));
        pizza selection = availablepizzas[choice];
        chef Chef = new chef(selection,this);
        Chef.start();
    }
     @Override
    public void pizzacooked(pizza pi) {
        System.out.println(pi.getName() + "Your pizza has been cooked");
    }
}
