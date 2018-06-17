package DynatracePrimes.Primes.controllers;

import DynatracePrimes.Primes.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ResultController {


    @GetMapping("/")
    public String index(Model model){
        Authentication auth = new Authentication();
        auth.connect();
        Data data = ParseJSON.parsing(auth.getJson());
        String primes = PrimeAlgorithm.prime(data.getData());
        model.addAttribute("liczby", primes);
        return "index";
    }

    @PostMapping("/")
    public String indexAgain (Model model){
        Authentication auth = new Authentication();
        auth.connect();
        Data data = ParseJSON.parsing(auth.getJson());
        String primes = PrimeAlgorithm.prime(data.getData());
        model.addAttribute("liczby", primes);
        return "index";
    }

}
