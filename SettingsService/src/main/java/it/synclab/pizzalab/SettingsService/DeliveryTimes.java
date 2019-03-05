package it.synclab.pizzalab.SettingsService;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "deliveryTimes")
public class DeliveryTimes {
	private String min;
	private String max;
	private int step;

	public DeliveryTimes(String min, String max, int step) {
		super();
		this.min = min;
		this.max = max;
		this.step = step;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

}
