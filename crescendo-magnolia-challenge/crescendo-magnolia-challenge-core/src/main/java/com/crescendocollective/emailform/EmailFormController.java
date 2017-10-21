package com.crescendocollective.emailform;

import javax.jcr.Node;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import info.magnolia.module.blossom.annotation.Area;
import info.magnolia.module.blossom.annotation.AutoGenerator;
import info.magnolia.module.blossom.annotation.AvailableComponentClasses;
import info.magnolia.module.blossom.annotation.Template;

//@Template(id = "crescendo-magnolia-challenge:pages/contact", title = "Contact Template", dialog="crescendo-magnolia-challenge:pages/global")
@Controller
public class EmailFormController {
	
//	// @RequestMapping("/contact")
//	    public String render() {
//	        return "pages/contact.ftl";
//	    }
//	 
//	 @Area("main")
//	    @AvailableComponentClasses(FormComponent.class)
//	    public static class ContentArea {
//		 @AutoGenerator
//		 public void generate(Node node) {
//		     // if node has no sub nodes add nodes for components
//		 }
//		
//	    }
//	
	
	@RequestMapping(method = RequestMethod.POST, value = "/joinList")
	public String joinMailingList(@ModelAttribute EmailForm form){
		return form.getFirstName();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String hello(){
		return "hello world";
	}

}
