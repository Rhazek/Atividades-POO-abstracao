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

    public void calculaFaturamento(){
        this.faturamento = this.quantIngressosVendidos * this.valorIngresso;
    }

    public void calculaParteTimeCasa(){
        this.parteTimeCasa = this.faturamento * 0.7;
    }

    public void calculaParteTimeVisitante() {
        this.parteTimeVisitante = this.faturamento * 0.3;
    }

}
