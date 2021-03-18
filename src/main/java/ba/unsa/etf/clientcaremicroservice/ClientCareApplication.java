package ba.unsa.etf.clientcaremicroservice;

import ba.unsa.etf.clientcaremicroservice.Model.Answer;
import ba.unsa.etf.clientcaremicroservice.Model.Question;
import ba.unsa.etf.clientcaremicroservice.Model.Review;
import ba.unsa.etf.clientcaremicroservice.Model.User;
import ba.unsa.etf.clientcaremicroservice.Repository.AnswerRepository;
import ba.unsa.etf.clientcaremicroservice.Repository.QuestionRepository;
import ba.unsa.etf.clientcaremicroservice.Repository.ReviewRepository;
import ba.unsa.etf.clientcaremicroservice.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ClientCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientCareApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository, ReviewRepository reviewRepository, QuestionRepository questionRepository,
										AnswerRepository answerRepository) {
		return (args) -> {
			User user1 = new User();
			User user2 = new User();
			User user3 = new User();
			User a1 = new User();
			userRepository.saveAll(List.of(a1, user1, user2, user3));

			Review review1 = new Review("Recenzija", "Ovo je review", user1);
			Review review2 = new Review("Naslov", "Novi review", user2);
			reviewRepository.save(review1);
			reviewRepository.save(review2);

			Question question1 = new Question();
			question1.setQuestion("Da li su svi automobili osigurani?");
			question1.setUser(user2);

			Question question2 = new Question();
			question2.setQuestion("Koja je minimalna duzina najma?");
			question2.setUser(user3);

			questionRepository.saveAll(List.of(question1,question2));

			Answer answer1 = new Answer();
			answer1.setQuestion(question1);
			answer1.setUser(a1);
			answer1.setAnswer("Prema zakonu, svi automobili, svih agencija su kasko osigurani.");

			Answer answer2 = new Answer();
			answer2.setQuestion(question2);
			answer2.setUser(a1);
			answer2.setAnswer("Minimalna duzina najma vozila je 24h.");

			answerRepository.saveAll(List.of(answer1,answer2));
		};
	}
}
