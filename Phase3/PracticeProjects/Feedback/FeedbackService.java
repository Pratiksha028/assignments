                        
package com.training.Feedback.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.Feedback.entities.Feedback;
import com.training.Feedback.repositories.FeedbackRepository;
@Service
public class FeedbackService {
	@Autowired
	FeedbackRepositoryfeedbackRepo;
	publicIterable<Feedback>GetAllFeedback() {
		returnfeedbackRepo.findAll();
	}
	public Feedback addNewFeedback(Feedback fb) {
		returnfeedbackRepo.save(fb);
	}
}
