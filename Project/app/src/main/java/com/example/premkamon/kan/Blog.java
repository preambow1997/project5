package com.example.premkamon.kan;

/**
 * Created by premkamon on 10/10/2559.
 */
public class Blog {
    String status;

    int count;

    @SerializedName("count_total")
    int totalCount;

    int pages;

    List<Post> posts;

    // Blog จะ map ทั้ง JSON
}
