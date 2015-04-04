package com.example.demo.repository;

import com.example.demo.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jirawong Wongdokpuang <greannetwork@gmail.com> on 4/4/2015 AD.
 */
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
