package Insurance;
import javax.swing.*;

public class Life extends Insurance {
  public Life() {
    super("Life");
    setCost();
  }

  
  public void setCost() {
    cost = 50;
  }

  public void display() {
    JOptionPane.showMessageDialog(null, " " + 
       type + " insurance costs $" + cost + 
       " per month");
  }

}
