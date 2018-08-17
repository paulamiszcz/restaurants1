package pl.javastart.dobrex.ingredient;

public enum  Sensitizing {
    YES("TAK"),
    NO("NIE");

   private String description;

    Sensitizing(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
