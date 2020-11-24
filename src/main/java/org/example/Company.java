package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Company(
        @JsonProperty("name") String name,
        @JsonProperty("catchPhrase") String catchPhrase,
        @JsonProperty("bs") String bs

) {
}
