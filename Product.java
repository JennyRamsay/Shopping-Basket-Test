import java.util.*;

public enum Product{
  PENS(12.00, false), PAPER(17.00, true), PRINTINK(28.00, false);

  private double price;
  private Boolean bogof;

  private Product(double price, Boolean bogof){
    this.price = price;
    this.bogof = bogof;
  }

  public double getPrice(){
    return this.price;
  }

  public Boolean getBogof(){
    return this.bogof;
  }

}