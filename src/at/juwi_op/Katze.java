package at.juwi_op;

public class Katze {
    private String charakter;
    private String oberflaechenbeschaffenheit;
    private int alter;
    private String farbe;
    private String name;

    public Katze() {
    }

    public Katze(String charakter, String oberflaechenbeschaffenheit, int alter, String farbe, String name) {
        this.charakter = charakter;
        this.oberflaechenbeschaffenheit = oberflaechenbeschaffenheit;
        this.alter = alter;
        this.farbe = farbe;
        this.name = name;
    }

    public String getCharakter() {
        return charakter;
    }

    public void setCharakter(String charakter) {
        this.charakter = charakter;
    }

    public String getOberflaechenbeschaffenheit() {
        return oberflaechenbeschaffenheit;
    }

    public void setOberflaechenbeschaffenheit(String oberflaechenbeschaffenheit) {
        this.oberflaechenbeschaffenheit = oberflaechenbeschaffenheit;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println( "Name der Katze: " + this.name + ",\n Farbe: " + this.farbe + ",\n Oberfläche: " + this.oberflaechenbeschaffenheit +
        ",\n Alter: " + this.alter + ",\n Charakter: " + this.charakter);
    }
}
