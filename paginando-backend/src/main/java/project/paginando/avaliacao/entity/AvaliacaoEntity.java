package project.paginando.avaliacao.entity;

import jakarta.persistence.*;
import project.paginando.livro.entity.LivroEntity;
import project.paginando.usuario.UsuarioEntity;

import java.time.LocalDateTime;

@Entity
@Table(name = "avaliacao")
public class AvaliacaoEntity {

    // CONSTRUTORES

    public AvaliacaoEntity(LivroEntity livro, UsuarioEntity usuario, Integer nota, String comentario, LocalDateTime dataAvalicao) {
        setLivro(livro);
        setUsuario(usuario);
        setNota(nota);
        setComentario(comentario);
        setDataAvalicao(dataAvalicao);
    }

    // ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
    private LivroEntity livro;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private UsuarioEntity usuario;

    @Column(name = "nota", nullable = false)
    private Integer nota;

    @Column(name = "comentario", nullable = false, length = 1000)
    private String comentario;

    @Column(name = "data_avaliaaco", nullable = false)
    private LocalDateTime dataAvalicao;

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LivroEntity getLivro() {
        return livro;
    }

    public void setLivro(LivroEntity livro) {
        this.livro = livro;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDateTime getDataAvalicao() {
        return dataAvalicao;
    }

    public void setDataAvalicao(LocalDateTime dataAvalicao) {
        this.dataAvalicao = dataAvalicao;
    }
}