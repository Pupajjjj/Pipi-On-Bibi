package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DonationController {

    private int peeCount = 0;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("count", peeCount); // Pass the counter value to the view
        return "index";
    }

    @PostMapping("/pee")
    @ResponseBody
    public String incrementPeeCount() {
        peeCount++; // Increment the counter
        return String.valueOf(peeCount); // Return the updated counter as a string
    }
}
