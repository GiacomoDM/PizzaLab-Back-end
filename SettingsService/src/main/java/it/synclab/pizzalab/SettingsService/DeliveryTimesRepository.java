package it.synclab.pizzalab.SettingsService;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryTimesRepository extends MongoRepository<DeliveryTimes, String> {

}
