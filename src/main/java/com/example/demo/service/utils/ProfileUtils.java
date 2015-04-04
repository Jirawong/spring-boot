package com.example.demo.service.utils;

import com.example.demo.domain.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Jirawong Wongdokpuang <greannetwork@gmail.com> on 4/4/2015 AD.
 */
public class ProfileUtils {

    public static Profile concatName(Profile profile){
        profile.setFirstName(profile.getFirstName()+" "+profile.getLastName());
        return profile;
    }

}
