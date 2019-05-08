package com.gino.redditclient.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class RedditListing implements RedditObject
{
    private List<RedditObject> children;
    private String before;
    private String after;
}
