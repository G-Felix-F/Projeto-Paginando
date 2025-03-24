package project.paginando.troca.entity;

import jakarta.persistence.*;
import project.paginando.troca.enuns.StatusTrocaEnum;
import project.paginando.usuario.UsuarioEntity;
import project.paginando.livro.entity.LivroEntity;

import java.time.LocalDateTime;

@Entity
@Table(name = "trocas")
public class TrocaEntity {

    // CONSTRUTORES

    TrocaEntity(UsuarioEntity solicitante, UsuarioEntity destinatario, LivroEntity livroOfertado,
                LivroEntity livroDesejado, LocalDateTime dataSolicitacao, StatusTrocaEnum statusTroca, String mensagem) {
        setSolicitante(solicitante);
        setDestinatario(destinatario);
        setLivroOfertado(livroOfertado);
        setLivroDesejado(livroDesejado);
        setDataSolicitacao(dataSolicitacao);
        setStatusTroca(statusTroca);
        setMensagem(mensagem);
    }

    // ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "solicitante_id", nullable = false)
    private UsuarioEntity solicitante;

    @ManyToOne
    @JoinColumn(name = "destinatario_id", nullable = false)
    private UsuarioEntity destinatario;

    @ManyToOne
    @JoinColumn(name = "livro_ofertado_id", nullable = false)
    private LivroEntity livroOfertado;

    @ManyToOne
    @JoinColumn(name = "livro_desejado_id", nullable = false)
    private LivroEntity livroDesejado;

    @Column(name = "data_solicitacao", nullable = false)
    private LocalDateTime dataSolicitacao;

    @Column(name = "status_troca", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusTrocaEnum statusTroca;

    @Column(name = "mensagem", nullable = false)
    private String mensagem;

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioEntity getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(UsuarioEntity solicitante) {
        this.solicitante = solicitante;
    }

    public UsuarioEntity getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(UsuarioEntity destinatario) {
        this.destinatario = destinatario;
    }

    public LivroEntity getLivroOfertado() {
        return livroOfertado;
    }

    public void setLivroOfertado(LivroEntity livroOfertado) {
        this.livroOfertado = livroOfertado;
    }

    public LivroEntity getLivroDesejado() {
        return livroDesejado;
    }

    public void setLivroDesejado(LivroEntity livroDesejado) {
        this.livroDesejado = livroDesejado;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public StatusTrocaEnum getStatusTroca() {
        return statusTroca;
    }

    public void setStatusTroca(StatusTrocaEnum statusTroca) {
        this.statusTroca = statusTroca;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
