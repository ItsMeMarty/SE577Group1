package edu.drexel.TrainDemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.drexel.TrainDemo.models.Route;

@Repository
public interface RouteRepository extends CrudRepository<Route, Long> {
	List<Route> findByAgency_Id(long orderId);
}