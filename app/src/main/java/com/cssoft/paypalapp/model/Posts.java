package com.cssoft.paypalapp.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Posts {

	@SerializedName("data")
	public List<DataItem> data;
}