package it.synclab.pizzalab.SettingsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {
	
	@Autowired 
	private DeliveryTimesRepository deliveryTimesRepository;
	
	@Autowired 
	private BaseAddressRepository baseAddressRepository;

	public List<BaseAddress> getAddress() {
		return this.baseAddressRepository.findAll();
	}

	public List<DeliveryTimes> getTimes() {
		return this.deliveryTimesRepository.findAll();
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
