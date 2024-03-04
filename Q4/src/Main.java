public class Main {
    public static void main(String[] args) {

        Empregado empregadoBeto = new Empregado("Beto", 29, 1900,
                "Eletricista", "08:00", "18:00");
        Empregado empregadaMaria = new Empregado("Maria", 27, 1800,
                "Secretária", "08:30", "18:30");

        empregadoBeto.registraPontoChegada("08:30");
        empregadaMaria.registraPontoChegada("08:20");

        empregadoBeto.registraPontoSaida("18:00");

    }

}