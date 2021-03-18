package ba.unsa.etf.clientcaremicroservice.Service;

import ba.unsa.etf.clientcaremicroservice.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
}
