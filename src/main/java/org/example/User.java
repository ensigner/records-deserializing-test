package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public record User(
        @JsonProperty("id") Integer postCode,
        @JsonProperty("name") String name,
        @JsonProperty("username") String username,
        @JsonProperty("email") String email,
        @JsonProperty("address") Address address,
        @JsonProperty("phone") String phone,
        @JsonProperty("website") String website,
        @JsonProperty("company") Company company

) {
}
