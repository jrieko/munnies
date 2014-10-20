package org.aokigahara.munnies.account;

import java.math.BigDecimal;

import org.joda.time.DateTime;

/**
 * TODO
 * 
 * @author rieko
 */
public class ExpirationalInterest extends Interest {
	private DateTime expiration;
	private BigDecimal expirationalAPR;

	/**
	 * @see org.aokigahara.munnies.account.Interest#getAPR()
	 */
	@Override
	public BigDecimal getAPR() {
		if (DateTime.now().isBefore(this.getExpiration()))
			return expirationalAPR;
		return super.getAPR();
	}

	/**
	 * @return TODO
	 */
	public DateTime getExpiration() {
		return expiration;
	}

	/**
	 * @return TODO
	 */
	public BigDecimal getExpirationalAPR() {
		return expirationalAPR;
	}
}
