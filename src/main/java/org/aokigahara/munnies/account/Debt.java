package org.aokigahara.munnies.account;

import org.joda.money.Money;

/**
 * TODO
 * 
 * @author rieko
 */
public abstract class Debt {
	private Money balance;
	private Interest interest;

	/**
	 * @return TODO
	 */
	public Money getBalance() {
		return balance;
	}

	/**
	 * @return TODO
	 */
	public Interest getInterest() {
		return interest;
	}
}
