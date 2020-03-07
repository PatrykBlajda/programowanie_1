package sda.JVM;

public final class User {
    private final String imie;
    private final String nazwisko;
    @Override
    public String toString() {
        return "User{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
    public User(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public User replaceName(String imie) {
        return new User(imie, this.nazwisko);
    }
    public User replaceSurname(String nazwisko) {
        return new User(this.imie, nazwisko);
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
}