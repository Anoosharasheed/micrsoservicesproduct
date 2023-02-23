package com.product.micrsoservicesproduct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepository extends JpaRepository<Product , Long >  {
    
}
