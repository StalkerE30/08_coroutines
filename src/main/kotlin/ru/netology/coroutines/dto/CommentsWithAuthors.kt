package ru.netology.coroutines.dto

data class CommentsWithAuthors(
    val comment: Comment,
    val authors: List<Author>,
)
