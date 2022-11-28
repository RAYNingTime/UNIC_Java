package Insurance;
import javax.swing.*;

public class Health extends Insurance {
  public Health() {
    super("Health");
    setCost();
  }

  public void setCost() {
    cost = 10;
  }

  public void display() {
    JOptionPane.showMessageDialog(null," " + 
           type + " insurance costs $" + 
           cost + " per month");

  }

}
