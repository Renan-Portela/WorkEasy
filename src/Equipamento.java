public class Equipamento {
    private int id;
    private String nome;
    private int numeroSerie;
    private boolean status;


    public Equipamento() {
        id = this.getId();
        nome = this.getNome();
        numeroSerie = this.getNumeroSerie();
        status = this.isStatus();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
