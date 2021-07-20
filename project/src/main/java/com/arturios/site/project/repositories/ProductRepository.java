package com.arturios.site.project.repositories;

import com.arturios.site.project.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    Page<Product> findAllByPriceBetween(Pageable pageable, double min, double max);
    Product findOneByTitle(String title);
}
