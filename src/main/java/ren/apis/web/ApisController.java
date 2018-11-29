package ren.apis.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApisController {
	@RequestMapping("index")
	public String dindex() {
		return "apis/index";
	}

}
