package com.arturios.site.project.repositories;

import com.arturios.site.project.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    Product findOneByTitle(String title);
}
