package it.synclab.pizzalab.SettingsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SettingsController {
	
	@Autowired
	private SettingsService settingsService;
	
	@RequestMapping("/baseAddress")
	public BaseAddress getAddress() {
		return this.settingsService.getAddress();
	}
	
	@RequestMapping("/deliveryTimes")
	public DeliveryTimes getTimes() {
		return this.settingsService.getTimes();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/baseAddress")
	public void updateAddress(@RequestBody BaseAddress baseAddress) {
		this.settingsService.updateAddress(baseAddress);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/deliveryTimes")
	public void updateTimes(@RequestBody DeliveryTimes deliveryTimes) {
		this.settingsService.updateTimes(deliveryTimes);
	}

}
