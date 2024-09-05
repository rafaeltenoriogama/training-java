package constructors;

public class BrazilianStates {

  public enum StatesBrazilian {
    SAO_PAULO("SP", "São Paulo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI("PI", "Piauí"),

    ;

    private String name;
    private String sigla;

    private StatesBrazilian(String sigla, String name) {
      this.sigla = sigla;
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public String getSigla() {
      return sigla;
    }

    public String getUpperCaseName() {
      return name.toUpperCase();
    }
  }
}
