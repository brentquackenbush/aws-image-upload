package com.UplAndDownIMG.awsimageupload.datastore;

import com.UplAndDownIMG.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("d1f65820-8268-412f-8895-d3ea4951e948"),"George Foreman",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("662fcdb1-bc1c-4403-8e7b-151e940a12ba"),"Kat Love",null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
