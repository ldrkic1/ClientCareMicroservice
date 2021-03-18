package ba.unsa.etf.clientcaremicroservice.Model;

import com.sun.source.tree.Tree;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy="user")
    private Set<Review> reviews;

    @OneToMany(mappedBy="user")
    private Set<Question> questions;

    @OneToMany(mappedBy="user")
    private Set<Answer> answers;

    public User(HashSet<Answer> answers) {
        this.answers = answers;
    }

    public User(TreeSet<Review> reviews) {
        this.reviews = reviews;
    }

    public User(Set<Question> questions) {
        this.questions = questions;
    }

    public User() {
        reviews = new TreeSet<Review>();
        questions = new TreeSet<Question>();
        answers = new TreeSet<Answer>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Set<Review> getReviews() {
        return reviews;
    }
    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }


    @Override
    public String toString() {
        return "User {" +
                "id=" + id +
                '}';
    }
}
