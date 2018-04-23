package ru.kai.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kai.mvc.models.Car;

import java.util.List;

/**
 * 23.04.2018
 * CarsRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CarsRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByOwner_FirstName(String firstName);
}
