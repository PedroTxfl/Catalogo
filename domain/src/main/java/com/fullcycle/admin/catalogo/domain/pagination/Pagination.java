package com.fullcycle.admin.catalogo.domain.pagination;

public record Pagination<T>(
        int currentPage,
        int perPage,
        long total,
        List<T> items
) {

}
