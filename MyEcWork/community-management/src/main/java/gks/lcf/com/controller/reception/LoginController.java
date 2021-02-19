package gks.lcf.com.controller.reception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import gks.lcf.com.entity.Stu;
import gks.lcf.com.service.LoginService;
import gks.lcf.com.util.Result;
import gks.lcf.com.util.ResultGenerator;

@Controller
@RequestMapping("/user")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("toLogin")
	public String toLogin() {
		return "reception/login";
	}
	
	@PostMapping("login")
	@ResponseBody
	public Result login(@RequestParam("username") String username,@RequestParam("password") String password,HttpServletRequest request ) {
		Stu stu = loginService.login(username, password);
		if(stu!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("stu", stu);
			return ResultGenerator.getSuccessResult();
		}
		else
			return ResultGenerator.getFailResult("账号或者密码错误");
	}
	
	@RequestMapping("toRegister")
	public String toRegister() {
		
		return "register";
	}
	
	@PostMapping("register")
	@ResponseBody
	public Result register(@RequestBody Stu stu) {
		
		
		return ResultGenerator.getSuccessResult("注册成功!");
	}
	
	@RequestMapping("logout")
	public String logout(HttpServletRequest request) {
		request.getSession().removeAttribute("stu");
		return "redirect:/user/toLogin";
	}
}
