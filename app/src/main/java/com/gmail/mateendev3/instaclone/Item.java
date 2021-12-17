package com.gmail.mateendev3.instaclone;

public class Item {
    private final int postedUserProfileImgResId;
    private final String postedUserName;
    private final int userUploadedPhotoImgResId;
    private final String postedUserText;
    private final int watchingUserProfileImgResId;
    private final String postPostedAgo;

    public Item(int postedUserProfileImgResId, String postedUserName, int userUploadedPhotoImgResId, String postedUserText, int watchingUserProfileImgResId, String postPostedAgo) {
        this.postedUserProfileImgResId = postedUserProfileImgResId;
        this.postedUserName = postedUserName;
        this.userUploadedPhotoImgResId = userUploadedPhotoImgResId;
        this.postedUserText = postedUserText;
        this.watchingUserProfileImgResId = watchingUserProfileImgResId;
        this.postPostedAgo = postPostedAgo;
    }

    public int getPostedUserProfileImgResId() {
        return postedUserProfileImgResId;
    }

    public String getPostedUserName() {
        return postedUserName;
    }

    public int getUserUploadedPhotoImgResId() {
        return userUploadedPhotoImgResId;
    }

    public String getPostedUserText() {
        return postedUserText;
    }

    public int getWatchingUserProfileImgResId() {
        return watchingUserProfileImgResId;
    }

    public String getPostPostedAgo() {
        return postPostedAgo;
    }
}
