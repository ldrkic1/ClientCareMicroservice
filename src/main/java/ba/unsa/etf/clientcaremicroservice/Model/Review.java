package ba.unsa.etf.clientcaremicroservice.Model;

import javax.persistence.*;

@Entity
@Table
public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String review;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable =false)
    private User user;
    public Review() {
    }

    public Review(String title, String review, User user) {
        this.title = title;
        this.review = review;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", review='" + review + '\'' +
                ", user_id=" + user.toString() +
                '}';
    }
}
