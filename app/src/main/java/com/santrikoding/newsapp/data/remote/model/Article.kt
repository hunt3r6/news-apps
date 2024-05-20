package com.santrikoding.newsapp.data.remote.model

import com.google.gson.annotations.SerializedName

data class Article(

    @field:SerializedName("image")
    var image: String,

    @field:SerializedName("category_id")
    var categoryId: String,

    @field:SerializedName("updated_at")
    var updatedAt: String,

    @field:SerializedName("user_id")
    var userId: String,

    @field:SerializedName("created_at")
    var createdAt: String,

    @field:SerializedName("id")
    var id: Int,

    @field:SerializedName("views_count")
    var viewsCount: String,

    @field:SerializedName("title")
    var title: String,

    @field:SerializedName("user")
    var user: User,

    @field:SerializedName("slug")
    var slug: String,

    @field:SerializedName("content")
    var content: String,

    @field:SerializedName("category")
    var category: Category,

    var isBookmark: Boolean = false,
)