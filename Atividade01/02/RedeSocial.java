public class RedeSocial {
  public static void main(String[] args) {
    Post post = new Post(19, "Hello World", Status.DRAFT);

    post.publish();
  }
}
