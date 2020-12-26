package com.khan.hyder.islamicresourcefinder.rest.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class MosqueFinderControllerTest {

    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";

    @Autowired MockMvc mockMvc;

    @Test
    public void shouldGetMosqueGeoLocation() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/mosque-near-me")
                .queryParam(LATITUDE, "45")
                .queryParam(LONGITUDE, "-127.554334"))
                .andExpect(status().isOk())
                .andReturn();
    }
}