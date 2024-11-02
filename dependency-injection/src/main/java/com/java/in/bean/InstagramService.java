package com.java.in.bean;

public class InstagramService implements SocialMediaService{
    @Override
    public void getUserFeeds() {
        System.out.println("loading user feeds from instagram ...");
    }
}
