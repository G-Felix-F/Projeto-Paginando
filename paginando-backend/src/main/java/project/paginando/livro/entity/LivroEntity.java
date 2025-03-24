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


}
