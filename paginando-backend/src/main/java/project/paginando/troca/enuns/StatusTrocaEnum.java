package project.paginando.troca.enuns;

public enum StatusTrocaEnum {
    PENDENTE("Pendente"),
    ACEITA("Aceita"),
    RECUSADA("Recusada"),
    CANCELADA("Cancelada"),
    CONCLUIDA("Concluida");

    private final String status;

    StatusTrocaEnum(String status) { this.status = status; }

    public String getStatus() { return status; }

    @Override
    public String toString() { return getStatus(); }
}
