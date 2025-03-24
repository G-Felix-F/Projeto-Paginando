package project.paginando.livro.entity;

import jakarta.persistence.*;
import project.paginando.avaliacao.entity.AvaliacaoEntity;
import project.paginando.usuario.UsuarioEntity;
import project.paginando.livro.enuns.LivroGeneroEnum;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "livros")
public class LivroEntity {

    // CONSTRUTORES

    public LivroEntity(String titulo, String autor, String isbn, String descricao,
                       LivroGeneroEnum genero, String editora) {
        setTitulo(titulo);
        setAutor(autor);
        setIsbn(isbn);
        setDescricao(descricao);
        setGenero(genero);
        setEditora(editora);
    }

    // ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "autor", nullable = false)
    private String autor;

    @Column(name = "isbn", nullable = false, length = 23)
    private String isbn;

    @Column(name = "descricao", nullable = false, length = 2000)
    private String descricao;

    @Column(name = "genero", nullable = false)
    private LivroGeneroEnum genero;

    @Column(name = "editora", nullable = false)
    private String editora;

    @OneToMany(mappedBy = "livro", cascade = CascadeType.ALL)
    private Set<AvaliacaoEntity> avaliacoes = new HashSet<>();

    @ManyToMany(mappedBy = "donos")
    private Set<UsuarioEntity> donos = new HashSet<>();

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LivroGeneroEnum getGenero() {
        return genero;
    }

    public void setGenero(LivroGeneroEnum genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Set<AvaliacaoEntity> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Set<AvaliacaoEntity> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Set<UsuarioEntity> getDonos() {
        return donos;
    }

    public void setDonos(Set<UsuarioEntity> donos) {
        this.donos = donos;
    }
}