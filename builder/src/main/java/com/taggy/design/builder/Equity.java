package com.taggy.design.builder;

import java.math.BigDecimal;

public class Equity {

	private String symbol;
	private BigDecimal price;
	private BigDecimal quantity;
	
	
	private String description;
	private String rating;
	private BigDecimal closeOfBusinessDayPrice;
	
	private Equity(EquityBuilder equityBuilder) {
		this.closeOfBusinessDayPrice=equityBuilder.closeOfBusinessDayPrice;
		this.price=equityBuilder.price;
		this.quantity=equityBuilder.quantity;
		this.description=equityBuilder.description;
		this.rating=equityBuilder.rating;
		this.symbol=equityBuilder.symbol;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public BigDecimal getCloseOfBusinessDayPrice() {
		return closeOfBusinessDayPrice;
	}
	public void setCloseOfBusinessDayPrice(BigDecimal closeOfBusinessDayPrice) {
		this.closeOfBusinessDayPrice = closeOfBusinessDayPrice;
	}
	
	
	
	
	public static class EquityBuilder{
		
		private String symbol;
		private BigDecimal price;
		private BigDecimal quantity;
		
		
		private String description;
		private String rating;
		private BigDecimal closeOfBusinessDayPrice;
		
		public EquityBuilder(String symbol,BigDecimal price,BigDecimal quantity) {
			this.price=price;
			this.symbol=symbol;
			this.quantity=quantity;
			
		}
		
		
		public EquityBuilder setCloseOfBusinessDayPrice(
				BigDecimal closeOfBusinessDayPrice) {
			this.closeOfBusinessDayPrice = closeOfBusinessDayPrice;
			return this;
			
		}

		public EquityBuilder setDescription(String description) {
			this.description = description;
			return this;
		}

		public EquityBuilder setRating(String rating) {
			this.rating = rating;
			return this;
		}


		public Equity build(){
	            return new Equity(this);
	     }
		
		
	}
	
}
