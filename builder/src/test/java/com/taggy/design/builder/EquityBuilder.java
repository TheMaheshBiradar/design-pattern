package com.taggy.design.builder;
import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Test;


public class EquityBuilder {

	@Test
	public void mandatoryParamterTest() {
		Equity equity = new Equity.EquityBuilder("AAPL", new BigDecimal(85.26),new BigDecimal(100)).setCloseOfBusinessDayPrice(
				new BigDecimal(85.26)).build();

		Assert.assertEquals(equity.getSymbol(), "AAPL");
	}

	
	@Test
	public void optionalParamterTest() {
		Equity equity = new Equity.EquityBuilder("AAPL", new BigDecimal(85.26),new BigDecimal(100)).setCloseOfBusinessDayPrice(
				new BigDecimal(66.00)).build();

		Assert.assertEquals(equity.getCloseOfBusinessDayPrice(), new BigDecimal(66.00));
	}

	
}
