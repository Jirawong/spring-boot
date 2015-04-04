package com.example.demo.controller;

import com.example.demo.domain.Profile;
import com.example.demo.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Jirawong Wongdokpuang <greannetwork@gmail.com> on 4/4/2015 AD.
 */
//@Controller
@RestController
public class LoginController {

    @Autowired
    private ProfileRepository profileRepository;


//    @RequestMapping("/")
//    public String unknowName(Model model){
//
//        Profile profile = new Profile();
//        profile.setFirstName("xxxxxx");
//        profile.setLastName("yyyyyy");
//
//
//        model.addAttribute("data",profile);
//        return "index";
//    }

    @RequestMapping(value = "/json",produces = "application/json")
    public Profile profile(){
        Profile profile = new Profile();
        profile.setFirstName("xxxxxx");
        profile.setLastName("yyyyyy");
        return  profile;
    }

    @RequestMapping(value = "/form",method = RequestMethod.POST,produces = "text/plain")
    public ResponseEntity<Profile> form(@ModelAttribute Profile profile){
        System.out.println(profile.getFirstName());
        profileRepository.save(profile);
        return new ResponseEntity<Profile>(profile, HttpStatus.OK);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestBody Profile profile){
        System.out.println(profile.getFirstName()+"xxxxxxxx");
        profileRepository.save(profile);
        return "OK!";
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Profile getProfile(@PathVariable("id") Long id){
        return profileRepository.findOne(id);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Profile> getAllProfile(){
        return profileRepository.findAll();
    }
}
