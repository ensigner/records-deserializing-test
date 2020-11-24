package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Address(
        @JsonProperty("street") String street,
        @JsonProperty("suite") String suite,
        @JsonProperty("city") String city,
        @JsonProperty("zipcode") String zipcode,
        @JsonProperty("geo") Geo geo

) {
}
