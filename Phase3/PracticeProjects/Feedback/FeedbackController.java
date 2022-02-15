
package com.training.Feedback.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.training.Feedback.entities.Feedback;
import com.training.Feedback.services.FeedbackService;
@RestController
public class FeedbackController {
	@Autowired
	FeedbackServicefeedbackService;
	
	@GetMapping("/feedback")
	publicIterable<Feedback>getAllFeedbacks(){
		returnfeedbackService.GetAllFeedback();
	}
	@PostMapping(path="/feedback", consumes= {MediaType.APPLICATION_JSON_VALUE}) 
	public Feedback addNewFeedback(@RequestBody Feedback fb) {
		Feedback newFb = new Feedback(fb.getComments(), fb.getRating(), fb.getUser());
		feedbackService.addNewFeedback(newFb);
		returnnewFb;
	}
}	
