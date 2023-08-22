enum Status {
  DRAFT,
  PUBLISHED,
  DELETED
}

public class Post {
  private int id;
  private String text;
  private Status status;

  Post(int id, String text, Status status) {
    this.id = id;
    this.text = text;
    this.status = status;
  }

  Status getStatus() {
    return this.status;
  }

  void setStatus(Status status) {
    this.status = status;
  }

  String getText() {
    return this.text;
  }

  public void validate() {
    if (this.getStatus() != Status.DRAFT) {
      throw new RuntimeException("Somente rascunhos podem ser postados");
    }

    
    if (this.getText().trim().length() == 0) {
      throw new RuntimeException("O post deve conter pelo menos um caractere");
    }
  }

  public void publish() {
    this.validate();
    this.setStatus(Status.PUBLISHED);
    
    System.out.println("Texto publicado com sucesso");
  }
}
