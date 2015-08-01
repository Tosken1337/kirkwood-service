package de.leetgeeks.kirkwoodblaster.service.orm;

import de.leetgeeks.kirkwoodblaster.service.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * kirkwood-service
 * User: Sebastian
 * Date: 31.07.2015
 * Time: 17:54
 */
@Repository
public interface ScoreRepository extends CrudRepository<Score, Long> {
}
