public class Veiculo {
    private String descricao;
    private FilaPassageiro passageiros;
    private int rodas;
    private int portas;

    public Veiculo(String descricao, FilaPassageiro passageiros, int rodas, int portas) {
        this.descricao = descricao;
        this.passageiros = passageiros;
        this.rodas = rodas;
        this.portas = portas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public FilaPassageiro getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(FilaPassageiro passageiros) {
        this.passageiros = passageiros;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}