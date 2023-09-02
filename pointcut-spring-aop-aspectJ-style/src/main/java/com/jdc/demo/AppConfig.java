package com.jdc.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {
		"com.jdc.demo.admin",
		"com.jdc.demo.member",
		"com.jdc.demo.utils"
})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ImportResource("/application.xml")
public class AppConfig {

}
