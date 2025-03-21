package project.paginando.entity;

import jakarta.persistence.*;
import lombok.Data;
import project.paginando.enuns.LivroGeneroEnum;

@Data
@Entity
@Table(name = "livro")
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


}
