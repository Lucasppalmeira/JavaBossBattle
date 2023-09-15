public class Projeteis {
    private String idIdentificacao;
    private double amplificacaoDano;

    public void Projeteis(String id, int dano){
        this.idIdentificacao = id;
        this.amplificacaoDano = dano;
    }

    public double getAmplificacaoDano(){
        return this.amplificacaoDano;
    }
}
