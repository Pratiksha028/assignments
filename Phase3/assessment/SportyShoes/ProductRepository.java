
package com.training.SportyShoes.jdbc;
import org.springframework.data.jpa.repository.JpaRepository;
import com.training.SportyShoes.entity.Product;
public interface ProductRepository extends JpaRepository<Product, Long>{
}
