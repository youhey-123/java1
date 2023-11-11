package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class BoardController {

	@Autowired
	HttpSession session;

	@RequestMapping("/")
	public String index() {
		session.invalidate();
		return "board";
	}

	@RequestMapping(value = "/apply", method = RequestMethod.POST)
	public ModelAndView apply(@RequestParam("name") String name, @RequestParam("choiceFeeling") String feeling,
			@RequestParam("contents") String contents, ModelAndView mv) {

		@SuppressWarnings("unchecked")
		List<Record> allContents = (List<Record>) session.getAttribute("contentsList");
		if (allContents == null) {
			allContents = new ArrayList<>();
			session.setAttribute("contentsList", allContents);
		}

		String errMsg = "";
		Boolean registFlg = true;

		if (name.isEmpty() || contents.isEmpty()) {
			errMsg = "名前と書き込みを入力してください";
			registFlg = false;
		}

		if (registFlg) {

			allContents.add(new Record(name, feeling, contents));
		}

		mv.addObject("allContents", allContents);
		mv.addObject("errMsg", errMsg);

		mv.setViewName("board");
		return mv;
	}
}