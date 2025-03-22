import java.util.Date;

public class Emprestimo {
    private int id;
    private int usuario;
    private int equipamento;
    private Date dataDevolucao;

    public Emprestimo() {
        id = this.getId();
        usuario = this.getUsuario();
        equipamento = this.getEquipamento();
        dataDevolucao = this.getDataDevolucao();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(int equipamento) {
        this.equipamento = equipamento;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
