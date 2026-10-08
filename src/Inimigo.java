public class Inimigo extends Personagem{
    private int experienciaConcedida;
    private int recompensaOuro;

    public inimigo(String nome, int vida, int vidaMaxima, int nivel, int experiencia, int ataque, int defesa, int experienciaConcedida, int recompensaOuro){
        super(nome, vida, vidaMaxima, nivel, experiencia, ataque, defesa);
        this.experienciaConcedida = experienciaConcedida;
        this.recompensaOuro = recompensaOuro;
    }

    public int getExperienciaConcedida() {
        return experienciaConcedida;
    }
    public int getRecompensaOuro(){
        return recompensaOuro;
    }

}
