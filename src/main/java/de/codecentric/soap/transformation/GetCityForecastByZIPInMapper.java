package de.codecentric.soap.transformation;

import de.codecentric.namespace.weatherservice.general.ForecastRequest;
import de.codecentric.soap.internalmodel.Site;

public class GetCityForecastByZIPInMapper {

	public static Site mapRequest2Zip(ForecastRequest forecastRequest) {
		Site site = new Site();
		site.setPostalCode(forecastRequest.getZIP());
		site.setFlagColor(forecastRequest.getFlagcolor());
		return site;
	}
}
