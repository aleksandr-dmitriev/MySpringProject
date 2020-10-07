package main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index()
  {
    return "index";
  }

  @RequestMapping(method = {RequestMethod.OPTIONS, RequestMethod.GET}, value = "/**/{path:[^\\\\.]*}")
  public String redirectToIndex() {
    return "forward:/"; //делаем перенаправление
  }
}
