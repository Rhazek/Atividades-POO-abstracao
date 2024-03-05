public class Jogos {

    public String timeCasa;
    public String timeVisitante;
    public int quantIngressosVendidos;
    public double valorIngresso;
    public double faturamento;
    public double parteTimeCasa;
    public double parteTimeVisitante;

    public Jogos(String timeCasa, String timeVisitante, int quantIngressosVendidos,
                 double valorIngresso, double faturamento, double parteTimeCasa, double parteTimeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.quantIngressosVendidos = quantIngressosVendidos;
        this.valorIngresso = valorIngresso;
        this.faturamento = faturamento;
        this.parteTimeCasa = parteTimeCasa;
        this.parteTimeVisitante = parteTimeVisitante;
    }

    public double calculaFaturamento(int quantIngressosVendidos, double valorIngresso){
        return quantIngressosVendidos * valorIngresso;
    }

    public double calculaParteTimeCasa(double faturamento){
        return (faturamento*70)/100;
    }

    public double calculaParteTimeVisitante (double faturamento){
        return (faturamento*30)/100;
    }

}
