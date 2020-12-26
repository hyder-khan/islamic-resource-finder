package com.khan.hyder.islamicresourcefinder.rest.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeoLocation {

    protected static final String LATITUDE_PATTERN="^(\\+|-)?(?:90(?:(?:\\.0{1,6})?)|(?:[0-9]|[1-8][0-9])(?:(?:\\.[0-9]{1,6})?))$";
    protected static final String LONGITUDE_PATTERN="^(\\+|-)?(?:180(?:(?:\\.0{1,6})?)|(?:[0-9]|[1-9][0-9]|1[0-7][0-9])(?:(?:\\.[0-9]{1,6})?))$";


    @NotBlank
    @Pattern(regexp = LATITUDE_PATTERN)
    private String latitude;

    @NotBlank
    @Pattern(regexp = LONGITUDE_PATTERN)
    private String longitude;

}
