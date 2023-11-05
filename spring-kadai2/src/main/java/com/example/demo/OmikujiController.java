package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OmikujiController {
	@RequestMapping("/omikuji.html")
	public ModelAndView top(ModelAndView mv) {
		mv.setViewName("omikujiController");
		return mv;
	}

	@RequestMapping(value = "/omikuji", method = RequestMethod.POST)
	public ModelAndView apply(@RequestParam("name") String name, ModelAndView mv) {

		Random rand = new Random();
		int num = rand.nextInt(6);
		String omikuji = "";
		String text1 = "";
		String text2 = "";

		switch (num) {
		case 0:
			omikuji = "大吉";
			break;
		case 1:
		case 2:
		case 3:
			omikuji = "吉";
			break;
		case 4:
			omikuji = "小吉";
			break;
		case 5:
			omikuji = "凶";
			break;
		}

		if (name == "") {
			name = "ゲスト";
		}

		text1 = "こんにちは、" + name + "さん";
		text2 = "本日の運勢は..." + omikuji + "です。";
		mv.addObject("text1", text1);
		mv.addObject("text2", text2);

		mv.setViewName("omikujiResult");
		return mv;
	}
}