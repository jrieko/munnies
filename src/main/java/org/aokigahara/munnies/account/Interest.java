package org.aokigahara.munnies.account;

import java.math.BigDecimal;

/**
 * TODO
 * 
 * @author rieko
 */
public class Interest {
	private BigDecimal APR;

	/**
	 * @return TODO
	 */
	public BigDecimal getAPR() {
		return APR;
	}

	/**
	 * @return TODO
	 */
	public BigDecimal getMPR() {
		return getAPR().divide(BigDecimal.valueOf(12));
	}
}
