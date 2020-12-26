package com.khan.hyder.islamicresourcefinder.rest.controller;

import javax.validation.Valid;

import com.khan.hyder.islamicresourcefinder.rest.request.GeoLocation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MosqueFinderController {


    @GetMapping(value = "/mosque-near-me", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getMosquesNearMe(@Valid GeoLocation geoLocation){
        return geoLocation.getLatitude() + "," + geoLocation.getLongitude();
    }

}
