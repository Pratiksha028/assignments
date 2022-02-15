
package com.training.SportyShoes.jdbc;
import org.springframework.data.jpa.repository.JpaRepository;
import com.training.SportyShoes.entity.Categories;
public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
