package seven;
import java.util.*;


public class TwitterConsoleApp {
  private static final Scanner scanner = new Scanner(System.in);
  private static final TwitterService twitterService = new TwitterService();

  public static void main(String[] args) {
    new TwitterConsoleApp().run();
  }

  public void run() {
    System.out.print("Введите ваше имя: ");
    String userName = scanner.nextLine().trim();
    User currentUser = new User(userName);
    System.out.println("Добро пожаловать, " + currentUser.getName() + "!");

    twitterService.initializePosts();

    while (true) {
      showMenu();
      int choice = getIntInput();
      switch (choice) {
        case 1 -> {
          System.out.println("Введите текст поста (макс. 280 символов): ");
          String text = scanner.nextLine();
          if (text.length() <= 280) {
            twitterService.addPost(currentUser, text);
          }
          else {
            text = text.substring(0, 280);
            twitterService.addPost(currentUser, text);
          }
          System.out.println("Пост добавлен!");
        }

        case 2 -> {
          System.out.println("Введите ID поста, который хотите лайкнуть: ");
          Long postId = (long) getIntInput();
          Post post = twitterService.getPost(postId);
          if (post != null) {
            Integer likeQuantity = post.getLikeQuantity();
            post.setLikeQuantity(++likeQuantity);
            System.out.println("Лайк на пост поставлен!");
          }
        }

        case 3 -> {
          System.out.println("Введите ID поста, который хотите репостнуть: ");
          Long postId = (long) getIntInput();
          Post post = twitterService.getPost(postId);
          if (post != null) {
            Integer repostQuantity = post.getRepostQuantity();
            post.setRepostQuantity(++repostQuantity);
            System.out.println("Репост сделан!");
          }
        }

        case 4 -> {
          System.out.println(twitterService);
        }

        case 5 -> {
          System.out.println("Введите количество популярных постов: ");
          int popularPostQuantity = getIntInput();
          System.out.println(twitterService.getPopularPosts(popularPostQuantity));
        }

        case 6 -> {
          System.out.println(twitterService.getUserPosts(currentUser));
        }

        case 7 -> {
          System.out.println("Введите ID поста, который хотите прокомментировать: ");
          Long postId = (long) getIntInput();
          System.out.println("Введите комментарий: ");
          String text = scanner.nextLine();
          twitterService.addComment(postId, text);
        }

        case 8 -> {
          System.out.println(twitterService.getUserPosts(currentUser));
          System.out.println("Введите ID поста, который хотите удалить: ");
          Long postId = (long) getIntInput();
          twitterService.deleteUserPost(currentUser, postId);
        }

        case 9 -> {
          System.out.println("Выход...");
          return;
        }
        default -> System.out.println("Некорректный ввод. Попробуйте снова.");
      }
    }
  }

  private int getIntInput() {
    int input;
    try {
      input = Integer.parseInt(scanner.nextLine().trim());
    } catch (NumberFormatException e) {
      System.out.println("Некорректный ввод.");
      return -1;
    }
    return input;
  }

  private static void showMenu() {
    System.out.println("\n=== Twitter Console ===");
    System.out.println("1. Написать пост");
    System.out.println("2. Лайкнуть пост");
    System.out.println("3. Сделать репост");
    System.out.println("4. Показать все посты");
    System.out.println("5. Показать популярные посты");
    System.out.println("6. Показать мои посты");
    System.out.println("7. Оставить комментарий к посту");
    System.out.println("8. Удалить мои посты");
    System.out.println("9. Выход");
    System.out.print("Выберите действие: ");
  }

}
