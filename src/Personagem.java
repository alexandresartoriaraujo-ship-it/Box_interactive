public abstract class Personagem {

    private String nome;
    private int vida;
    private int vidaMaxima;
    private int nivel;
    private int experiencia;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int vida, int vidaMaxima, int nivel, int experiencia, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public void receberDano(int dano) {
        vida -= dano;
    }

    public void curar(int quantidade) {
        vida += quantidade;
    }

    public void ganharExperiencia(int quantidade) {
        experiencia += quantidade;
    }

    public void subirNivel() {
        nivel++;
    }

    public void atacar(Personagem alvo) {
        alvo.receberDano(ataque);
    }
}
