package lwidawski.pl.financeassistant;

import lwidawski.pl.financeassistant.services.CurrencyRateProvider;
import lwidawski.pl.financeassistant.services.FileCurrencyRateProvider;
import lwidawski.pl.financeassistant.services.RateConversionService;

public class AppConfig {

    public CurrencyRateProvider fileCurrencyRateProvider(){
        return new FileCurrencyRateProvider();
    }

    public RateConversionService rateConversionService(){
        RateConversionService rateConversionService = new RateConversionService();
        rateConversionService.setRateProvider(fileCurrencyRateProvider());
        return  rateConversionService;
    }
}
