package com.codepath.articlesearch

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "article_table") // table name for the database
data class ArticleEntity( // data class for the article entity
    @PrimaryKey(autoGenerate = true) val id: Long = 0,// primary key for the article entity
    @ColumnInfo(name = "headline") val headline: String?, // column for the headline
    @ColumnInfo(name = "articleAbstract") val articleAbstract: String?, // column for the article abstract
    @ColumnInfo(name = "byline") val byline: String?,
    @ColumnInfo(name = "mediaImageUrl") val mediaImageUrl: String?
)