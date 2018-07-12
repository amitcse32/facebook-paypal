package com.cssoft.paypalapp.model;

import com.google.gson.annotations.SerializedName;

public class Feed  {

	@SerializedName("posts")
	public Posts posts;

	@SerializedName("email")
	public String email;
}