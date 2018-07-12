package com.cssoft.paypalapp.model;

import com.google.gson.annotations.SerializedName;

public class DataItem  {

	@SerializedName("full_picture")
	public String fullPicture;

	@SerializedName("id")
	public String id;

	@SerializedName("message")
	public String message;
}