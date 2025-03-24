package project.paginando.usuario;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import project.paginando.livro.entity.LivroEntity;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    // CONSTRUTORES

    public UsuarioEntity(String username, String nome, String email, String senha,
                         String fotoPerfil, String cidade, String estado) {
        setUsername(username);
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setFotoPerfil(fotoPerfil);
        setCidade(cidade);
        setEstado(estado);
    }

    // ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    @Email
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "bio", nullable = false)
    private String bio;

    @Column(name = "foto_perfil", nullable = false)
    private String fotoPerfil;

    @Column(name = "cidade", nullable = false)
    private String cidade;

    @Column(name = "estado", nullable = false)
    private String estado;

    @ManyToMany
    @JoinTable(
            name = "usuarios_livros",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "livro_id")
    )
    private Set<LivroEntity> livros = new HashSet<>();

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<LivroEntity> getLivros() {
        return livros;
    }

    public void setLivros(Set<LivroEntity> livros) {
        this.livros = livros;
    }
}