package com.fullcycle.admin.catalogo.domain.category;

public interface CategoryGateway {
    Category create(Category aCategory);

    void DeleteById(CategoryID anId);

    Optional<Category> findById(CategoryID anId);

    Category update(Category aCategory);

    Pagination<Category> findAll(CategorySearchQuery aQuery);
}
