package ba.unsa.etf.clientcaremicroservice.Controller;

import ba.unsa.etf.clientcaremicroservice.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;

public class ReviewController {
    @Autowired
    private ReviewService reviewService;
}
