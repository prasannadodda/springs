
package com.cg.module2test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.module2test.dto.ForumBean;
import com.cg.module2test.service.IForumService;

@Controller
public class MyController {
	@Autowired
	IForumService forumservice;

	@RequestMapping(value = "all")
	public String screen1() {
		return "screen1";
	}

	@RequestMapping(value = "dosearch", method = RequestMethod.GET)
	public ModelAndView FetchQueryDetails(@RequestParam("queryId") int id,
			@Valid @ModelAttribute("my1") ForumBean forumbean,
			Map<String, Object> model) {

		ForumBean bean = forumservice.searchQuery(id);
		if (bean != null) {
			List<String> names = new ArrayList<>();
			names.add("Please select");
			names.add("Uma");
			names.add("Rahul");
			names.add("Kavita");
			names.add("Hema");
			model.put("select", names);
			return new ModelAndView("search", "query", bean);

		} else {
			return new ModelAndView("errorInQuery","id",id);
		}
	}

	@RequestMapping(value = "updatedata", method = RequestMethod.POST)
	public ModelAndView updateEmployee(@Valid @ModelAttribute("my1") ForumBean forumbean) {

		boolean res = false;

		res = forumservice.updateEmployee(forumbean);

		if (res == true) {
			return new ModelAndView("updateSuccess", "edata", forumbean.getQuery_id());
		} else {
			return new ModelAndView("errorInQuery");
		}

	}

}