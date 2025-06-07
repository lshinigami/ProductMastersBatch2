package seven;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private static Long idCounter = 0L;
    private Long id = 0L;
    private User author;
    private String text;
    private Integer likeQuantity;
    private Integer repostQuantity;
    private Integer commentQuantity;
    private final List<String> comments = new ArrayList<>();

    public Post() {

    }

    public Post(User author, String text) {
        ++idCounter;
        this.id = idCounter;
        this.author = author;
        this.text = text;
        this.likeQuantity = 0;
        this.repostQuantity = 0;
        this.commentQuantity = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLikeQuantity() {
        return likeQuantity;
    }

    public void setLikeQuantity(Integer likeQuantity) {
        this.likeQuantity = likeQuantity;
    }

    public Integer getRepostQuantity() {
        return repostQuantity;
    }

    public void setRepostQuantity(Integer repostQuantity) {
        this.repostQuantity = repostQuantity;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public List<String> getComments() {
        return comments;
    }

    public Integer getCommentQuantity() {
        return commentQuantity;
    }

    public void setCommentQuantity(Integer commentQuantity) {
        this.commentQuantity = commentQuantity;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + getId() +
                ", author=" + author.getName() +
                ", content='" + text + '\'' +
                ", likes=" + likeQuantity +
                ", reposts=" + repostQuantity +
                ", comments=" + commentQuantity +
                '}';
    }
}
