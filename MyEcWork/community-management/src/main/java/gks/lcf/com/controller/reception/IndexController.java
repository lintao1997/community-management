package gks.lcf.com.controller.reception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	private static Logger logger = LogManager.getLogger();
	
	
	@RequestMapping(value = {"index","/"})
	public String index() {
		logger.info("启动成功。。。");
		
		return "reception/index";
	}
}
