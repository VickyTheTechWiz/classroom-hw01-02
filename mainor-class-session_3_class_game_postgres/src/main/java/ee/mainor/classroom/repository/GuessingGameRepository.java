package ee.mainor.classroom.repository;

import ee.mainor.classroom.model.GuessingGame;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuessingGameRepository extends CrudRepository<GuessingGame, Long> {

    @Override
    List<GuessingGame> findAll();

}
