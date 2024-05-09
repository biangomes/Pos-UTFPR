package pos.utfpr.javaii.visao;

public final class Cidade {
  private final String nome;
  private final String estado;

  public Cidade(final String nome, final String estado) {
    this.nome = nome;
    this.estado = estado;
  }

  public String getEstado() {
    return this.estado;
  }

  public String getNome() {
    return this.nome;
  }
}
