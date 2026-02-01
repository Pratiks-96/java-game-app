package com.example.game;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api/game")
@CrossOrigin
public class GameController {

    private final Random random = new Random();

    @GetMapping("/guess")
    public String guess(@RequestParam int number) {
        int generated = random.nextInt(10) + 1;
        if (number == generated) {
            return "🎉 You won! The number was " + generated;
        } else {
            return "❌ You lost! The number was " + generated;
        }
    }

    @GetMapping("/health")
    public String health() {
        return "Backend is running!";
    }
}
