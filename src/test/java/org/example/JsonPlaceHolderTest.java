package org.example;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class JsonPlaceHolderTest {
    /**
     * GRigorous Test :-) лол
     */
    @Test
    public void usersShouldMatch() {
        //may be supplied separately by DataProvider - it is just an experiment in this case
        User expectedUser = new User(
                3,
                "Clementine Bauch",
                "Samantha",
                "Nathan@yesenia.net",
                new Address(
                        "Douglas Extension",
                        "Suite 847",
                        "McKenziehaven",
                        "59590-4157",
                        new Geo(
                                "-68.6102",
                                "-47.0653"
                        )
                ),
                "1-463-123-4447",
                "ramiro.info",
                new Company("Romaguera-Jacobson",
                        "Face to face bifurcated interface",
                        "e-enable strategic applications")
        );

        User actualUser =
                given()
                        .get("https://jsonplaceholder.typicode.com/users/3")
                        .as(User.class);
        assertEquals(expectedUser, actualUser);

    }

}
