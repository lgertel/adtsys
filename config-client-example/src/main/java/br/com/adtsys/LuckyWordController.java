package br.com.adtsys;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lgertel on 20/06/17.
 */
@RestController
public class LuckyWordController {

    @Value("${lucky-word}") String luckyWord;

    @RequestMapping("/lucky-word")
    public String sayTheLuckyWord() {
        return "The Lucky Word is: " + luckyWord;
    }
}
