/*
 * Copyright (c) 2015 - 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package com.ge.predix.analytics.customdto;

public class Response {

	protected CDM_TimeSeries updatedCDM;

	public CDM_TimeSeries getUpdatedCDM() {
		return updatedCDM;
	}

	public void setUpdatedCDM(CDM_TimeSeries updatedCDM) {
		this.updatedCDM = updatedCDM;
	}
}

