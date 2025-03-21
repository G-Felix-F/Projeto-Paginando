package project.paginando.enuns;

public enum LivroGeneroEnum {
    ROMANCE("Romance"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    FANTASIA("Fantasia"),
    SUSPENSE("Suspense"),
    DIDATICO("Didático"),
    HUMOR("Humor"),
    DRAMA("Drama"),
    AVENTURA("Aventura"),
    INFANTIL("Infantil"),
    AUTOAJUDA("Autoajuda");

    private final String descricao;

    LivroGeneroEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
}
