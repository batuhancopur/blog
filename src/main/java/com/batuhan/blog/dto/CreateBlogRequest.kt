package com.batuhan.blog.dto

import javax.validation.constraints.*

data class CreateBlogRequest(

    val id: String,
    @field:NotBlank
    val name: String,
    @field:Max(value = 100)
    @field:Min(value = 1)
    @field:Positive
    val age: Int,
    @field:Email
    val email: String
)
