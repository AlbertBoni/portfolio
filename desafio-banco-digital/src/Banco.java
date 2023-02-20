import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static final String NOME_BANCO = "INOB";

    String nome;
    List<Conta> contas;



    public Banco() {
        this.nome = NOME_BANCO;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    void imprimirContas(){
        for(Conta c : contas){
            c.imprimirExtrato();
        }
    }
}
