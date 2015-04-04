package com.example.demo.service;

import com.example.demo.domain.Profile;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.service.utils.ProfileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jirawong Wongdokpuang <greannetwork@gmail.com> on 4/4/2015 AD.
 */
@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Profile processProfile(Profile profile) {
        Profile profile1 = ProfileUtils.concatName(profile);
        return profileRepository.save(profile1);
    }
}
