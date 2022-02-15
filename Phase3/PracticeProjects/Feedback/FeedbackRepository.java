            
package com.training.Feedback.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.training.Feedback.entities.Feedback;
@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {
public Feedback findByUser(String feedback);
}
