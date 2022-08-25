package com.UplAndDownIMG.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("quack-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
