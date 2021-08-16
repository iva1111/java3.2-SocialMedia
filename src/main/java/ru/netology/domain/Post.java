package ru.netology.domain;

public class Post {
    private String id;   // идентификатор записи
    private int ownerId;  // идентификатор владельца стены, на которой размещена запись
    private int fromId;  // идентификатор автора записи (от чьего имени опубликована запись)
    private String date;  // дата создания поста
    private String text;  // текст поста
    private String likePost;  // лайки поста
    private String comments;  // информация о комментариях к записи

    private CommentInfo commentInfo;
    private Copyright copyright;
    private Geo geo;
    private Likes likes;
    private PostSource postSource;
    private Repost repost;
    private Views views;

    // + get/set

}
