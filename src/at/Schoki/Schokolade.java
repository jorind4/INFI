package at.Schoki;

public class Schokolade {
}
    private String Marke;
    private int Kakaogehalt;
    private String Topping;
    private String Form;
    private String Geschmack;

    public Schokolade() {
    }

    public Sckokolade(String Marke, int Kakogehalt, String Topping, String Form, String Geschmack) {
        this.Marke = Marke;
        this.Kakaogehalt = Kakogehalt;
        this.Topping = Topping;
        this.Form = Form;
        this.Geschmack = Geschmack;
    }

    public String getMarke() {
        return Marke;
    }

    public void setMarke(String marke) {
        Marke = marke;
    }

    public int getKakaogehalt() {
        return Kakaogehalt;
    }

    public void setKakaogehalt(int kakaogehalt) {
        Kakaogehalt = kakaogehalt;
    }

    public String getTopping() {
        return Topping;
    }

    public void setTopping(String topping) {
        Topping = topping;
    }

    public String getForm() {
        return Form;
    }

    public void setForm(String form) {
        Form = form;
    }

    public String getGeschmack() {
        return Geschmack;
    }

    public void setGeschmack(String geschmack) {
        Geschmack = geschmack;
    }


    public void getInfo() {
        System.out.println( "Marke der Schoki: " + this.Marke + ",\n Kakaogehakt: " + this.Kakaogehalt + ",\n Spezialtopping: " + this.Topping +
                ",\n Spezial-Geschmack: " + this.Geschmack + ",\n Forme der Schoki: " + this.Form);
    }
}
