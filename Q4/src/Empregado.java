import java.time.Duration;
import java.time.LocalTime;

public class Empregado {

    public String nome;
    public int idade;
    public double salario;
    public String funcao;
    public String inicioExpediente;
    public String fimExpediente;

    public Empregado(String nome, int idade, double salario,
                     String funcao, String inicioExpediente, String fimExpediente) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.funcao = funcao;
        this.inicioExpediente = inicioExpediente;
        this.fimExpediente = fimExpediente;
    }

    public void registraPontoChegada(String horarioChegada){
        long minutes = Duration.between(LocalTime.parse(inicioExpediente),
                LocalTime.parse(horarioChegada)).toMinutes();
        if (minutes>0){
            System.out.printf("O(a) colaborador(a) %s chegou %d minuto(s) atrasado!%n",
                    this.nome, minutes);
        } else {
            System.out.printf("O(a) colaborador(a) %s não se atrasou hoje.%n",
                    this.nome);
        }
    }

    public void registraPontoSaida(String horarioSaida){
        System.out.printf("Ponto Registrado. Horário de Saída do colaborador %s: %s", this.nome, horarioSaida);
    }

    public void atendeOrdensDeServico(){

    }

    public void geraRelatorio(){

    }


}
