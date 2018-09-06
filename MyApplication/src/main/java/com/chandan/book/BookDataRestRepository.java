package com.chandan.book;

import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "bookList", collectionResourceRel = "author")
public interface BookDataRestRepository extends PagingAndSortingRepository<Book, Long> {

}	