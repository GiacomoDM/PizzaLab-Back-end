package it.synclab.pizzalab.SettingsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {
	
	@Autowired 
	private DeliveryTimesRepository deliveryTimesRepository;
	
	@Autowired 
	private BaseAddressRepository baseAddressRepository;

	public BaseAddress getAddress() {
		return this.baseAddressRepository.findAll().get(0);
	}

	public DeliveryTimes getTimes() {
		return this.deliveryTimesRepository.findAll().get(0);
	}

	public void updateAddress(BaseAddress baseAddress) {
		this.baseAddressRepository.deleteAll();
		this.baseAddressRepository.save(baseAddress);		
	}

	public void updateTimes(DeliveryTimes deliveryTimes) {
		this.deliveryTimesRepository.deleteAll();
		this.deliveryTimesRepository.save(deliveryTimes);
	}

}
