package br.com.xavecoding.regescweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("hello"); // nome do arquivo html a ser renderizado
        mv.addObject( "nome", "Andrea");
        return mv; // o Spring vai renderizar o arquivo que esta em templates/hello.html
    }
    @GetMapping("/hello-model")
    public String hello(Model model){
        model.addAttribute( "nome", "Toguepi");
        return "hello"; // o Spring vai renderizar o arquivo que esta em templates/hello.html
    }

    @GetMapping("/hello-servlet")
    public String hello(HttpServletRequest request){
        request.setAttribute( "nome", "Diego");
        return "hello"; // o Spring vai renderizar o arquivo que esta em templates/hello.html
    }


}
