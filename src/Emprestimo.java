import java.util.Date;

public class Emprestimo {
    private Usuario usuario;
    private Equipamento equipamento;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Usuario usuario, Equipamento equipamento, Date dataEmprestimo, Date dataDevolucao) {
        this.usuario = usuario;
        this.equipamento = equipamento;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(int Usuario) {
        this.usuario = usuario;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
