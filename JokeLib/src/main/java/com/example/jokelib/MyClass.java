package com.example.jokelib;


import java.util.Random;

public class MyClass {
    public static String[] jokes =
    {"Q: Can Bees fly in the rain? A: Not without their yellow jackets.",
            "Q: What is a Queens favorite kind of precipitation? A: Reign!",
            "Q: What is the Mexican weather report? A: Chili today and hot tamale.",
            "Q. What is the biggest lie in the entire universe? A. I have read and agree to the Terms & Conditions."
};
    public String getJoke() {
        Random random = new Random();
        int randomN = random.nextInt(jokes.length);
        return jokes[randomN];
    }

}

