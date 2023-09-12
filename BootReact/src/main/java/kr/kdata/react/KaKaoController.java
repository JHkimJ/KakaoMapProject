package kr.kdata.react;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KaKaoController {
	
	@GetMapping(value = {"/kakao"})
	public String index() {
		return "kakao.html";
	}
}
