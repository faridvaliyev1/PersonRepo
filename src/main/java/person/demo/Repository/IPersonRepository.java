package person.demo.Repository;

import person.demo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IPersonRepository extends JpaRepository<Person,Long> {
     @Query("SELECT p  FROM Person as  p Where lower(p.name) like %?1%")
     List<Person> Search(String Keyword);
}
