package com.briup.app02.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 路由的命名空间
 * http://127.0.0.1:8080 可以访问到当前项目
 * http://127.0.0.1:8080/test 可访问到当前项目TestController这个类
 * http://127.0.0.1:8080/testhello 
 * hello方法执行完毕后会返回一个字符串，这个字符串将会发送给浏览器
 *浏览器发送请求-->服务接受请求-->服务返回响应-->游览器接收回应
 *http协议！！
 */

@RestController
@RequestMapping("test/")
public class TestController {
	@GetMapping("hello")
	public String hello(){
		return "helllo word,你好世界";
	}

}
