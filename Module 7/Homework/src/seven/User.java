package seven;

public class User {
  private final String name;
  private static Long id = 0L;

  public User(String name) {
    id += 1L;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static Long getId() {
    return id;
  }
}
