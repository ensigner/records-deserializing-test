package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Geo(
        @JsonProperty("lat") String lat,
        @JsonProperty("lng") String lng
) {
}
