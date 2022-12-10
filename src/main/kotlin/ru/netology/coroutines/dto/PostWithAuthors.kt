package ru.netology.coroutines.dto

data class PostWithAuthors(
    val post: Post,
    val authors: List<Author>,
)
