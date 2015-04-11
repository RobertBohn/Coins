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

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        List<Coin> coins = coinDao.getCoins();
        model.addAttribute("coins", coins);
        return "main";
	}

    @RequestMapping(value="coin/{id}", method = RequestMethod.GET)
    public @ResponseBody Coin getShopInJSON(@PathVariable String id) {
        return coinDao.get(id);
    }
}