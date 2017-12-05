package com.example;

import java.util.Random;

public class JokeTeller {

    private String[] jokes;
    private Random random;

    public JokeTeller()
    {
        jokes = new String[3];
        jokes[0] = "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"";
        jokes[1] = "Q: How does Bill Gates get fresh air into his mansion?\n" +
                "A: One clicks on an icon and a window opens!";
        jokes[2] = "Why do Java developers wear glasses? Because they can't C#";
        random = new Random();
    }

    public String getJoke()
    {
        return jokes[random.nextInt(jokes.length)];
    }
}
