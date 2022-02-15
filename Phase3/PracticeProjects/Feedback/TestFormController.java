
package com.training.Feedback.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.training.Feedback.entities.Feedback;
import com.training.Feedback.services.FeedbackService;
@Controller
public class TestFormController {

	@Autowired
	FeedbackServicefeedbackService;
	@GetMapping("/test_form")
	public String showTestForm(ModelMap model) {
		model.addAttribute("test", new Feedback());
		return "testformjsp";
	}
	@PostMapping("/test_form")
	public String submitTestForm(@ModelAttribute("testUser") Feedback fb, ModelMap m) {
		feedbackService.addNewFeedback(fb);
		m.addAttribute("test", fb);
			return "post";
	}
}
