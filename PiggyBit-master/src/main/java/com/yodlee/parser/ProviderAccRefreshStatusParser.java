/*
* Copyright (c) 2016 Yodlee, Inc. All Rights Reserved.
*
* This software is the confidential and proprietary information of Yodlee, Inc.
* Use is subject to license terms.
*/

package com.yodlee.parser;

import java.io.IOException;

import com.google.gson.Gson;
import com.yodlee.beans.ProviderAccountRefreshStatus;

public class ProviderAccRefreshStatusParser implements Parser{

	private String fqcn = this.getClass().getName();
	public ProviderAccountRefreshStatus parseJSON(String json) throws IOException 
	{
		String mn = "parseJSON(" + json + ")";
		System.out.println(fqcn + " :: " + mn);
		Gson gson = new Gson();
		return (ProviderAccountRefreshStatus)gson.fromJson(json, ProviderAccountRefreshStatus.class);
	}

}