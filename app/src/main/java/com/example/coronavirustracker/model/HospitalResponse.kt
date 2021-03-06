package com.example.coronavirustracker.model

import com.google.gson.annotations.SerializedName

data class HospitalResponse(

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("province")
	val province: String? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("region")
	val region: String? = null
)
