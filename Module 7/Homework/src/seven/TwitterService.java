package seven;

import java.util.*;
import java.util.stream.Collectors;

public class TwitterService {

  private final List<Post> posts = new ArrayList<>();

  public void initializePosts() {
    posts.add(new Post(new User("Alice"), "Привет, мир!"));
    posts.add(new Post(new User("Bob"), "Сегодня отличный день!"));
    posts.add(new Post(new User("Charlie"), "Люблю программировать на Java."));
    System.out.println("Добавлены стартовые посты.");

    //popular post sorting check (working)
    posts.get(0).setLikeQuantity(3);
    posts.get(1).setLikeQuantity(2);

  }
  public String toString() {
    return posts.stream()
            .sorted(Comparator.comparing(Post::getId).reversed())
            .map(Post::toString)
            .collect(Collectors.joining("\n"));
  }

  public void addPost(User user, String text) {
    posts.add(new Post(user, text));
  }

  public Post getPost(Long id) {
    return posts.stream()
            .filter(post -> Objects.equals(post.getId(), id))
            .findFirst()
            .orElseGet(() -> {
              System.out.println("Поста с данным ID не существует.");
              return null;
            });
  }

  public String getPopularPosts(int quantity) {
    return posts.stream()
            .sorted(Comparator.comparing(Post::getLikeQuantity).reversed())
            .limit(quantity)
            .map(Post::toString)
            .collect(Collectors.joining("\n"));
  }

  public String getUserPosts(User user) {
    return posts.stream()
            .filter(post -> post.getAuthor().getName().equals(user.getName()))
            .map(Post::toString)
            .collect(Collectors.joining("\n"));
  }

  public void deleteUserPost(User user, Long id) {
    Optional<Post> DeletedPost = posts.stream()
            .filter(post -> Objects.equals(post.getId(), id))
            .filter(post -> post.getAuthor().getName().equals(user.getName()))
            .findFirst();

    if (DeletedPost.isPresent()) {
      posts.remove(DeletedPost.get());
      System.out.println("Пост успешно удалён.");
    } else {
      System.out.println("Пост не найден или вы не являетесь его автором.");
    }
  }

  public void addComment(Long id, String text) {
      posts.stream()
              .filter(post -> Objects.equals(post.getId(), id))
              .findFirst()
              .ifPresent(post -> { post.addComment(text);
                post.setCommentQuantity(post.getCommentQuantity() + 1);
                System.out.println("Комментарий добавлен к посту!");
                }
              );
  }




}
