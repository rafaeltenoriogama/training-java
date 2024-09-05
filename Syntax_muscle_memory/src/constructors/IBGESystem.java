package constructors;

import constructors.BrazilianStates.StatesBrazilian;

public class IBGESystem {

  public static void main(String[] args) {
    for (StatesBrazilian e : StatesBrazilian.values()) {
      System.out.println(e.getSigla() + " - " + e.getName());
    }
  }

}
