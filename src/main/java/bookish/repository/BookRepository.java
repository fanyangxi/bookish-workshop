package bookish.repository;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by yxfan on 6/18/16.
 */

public interface BookRepository extends CrudRepository<bookish.domain.Book, Long> {
//    @Query("select p from Person p where p.name = :name order by p.name")
//    public Iterable<Person> findByNameUsingJPQL(@Param("name") String name);
}