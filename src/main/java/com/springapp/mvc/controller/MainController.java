package com.springapp.mvc.controller;

import com.springapp.mvc.data.CoinDao;
import com.springapp.mvc.model.Coin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    CoinDao coinDao;

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public @ResponseBody Coin get(@PathVariable String id) {
        return coinDao.get(id);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public @ResponseBody List<Coin> list() {
        return coinDao.getCoins();
    }

    @RequestMapping("*")
    public String main() {
        return "main";
    }
}