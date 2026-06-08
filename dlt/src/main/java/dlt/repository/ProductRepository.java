package dlt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dlt.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
