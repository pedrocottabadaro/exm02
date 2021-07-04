package br.ufjf.dcc193.pedrocottabadaro.exm02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    
    @RequestMapping({"","index.html"})
    @ResponseBody
    public String home(){
        return "Hello World";
    }
}
