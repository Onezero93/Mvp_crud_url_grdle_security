package com.example.mvpcrud.model

import com.google.gson.annotations.SerializedName

data class ResponseUser(
    @SerializedName("page")
    val page: Int,
    @SerializedName("per_page")
    val perpage: Int,
    @SerializedName("total")
    val total: Int,
    @SerializedName("total_pages")
    val totalpage: Int,
    @SerializedName("data")
    val data: List<DataItem>,
    @SerializedName("support")
    val support: List<SupportItem>

)
data class DataItem(
    @SerializedName("id")
    val id: Int,
    @SerializedName("email")
    val email: String,
    @SerializedName("first_name")
    val firstname: String,
    @SerializedName("last_name")
    val lastname: String,
    @SerializedName("avatar")
    val avatar: String
)
class SupportItem(
    @SerializedName("url")
    val url: String,
    @SerializedName("text")
    val text: String
)