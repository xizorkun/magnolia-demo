package com.crescendocollective.emailform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import info.magnolia.module.blossom.annotation.Template;

@Controller
@Template(title = " Contact Form", id = "crescendo-magnolia-challenge:components/contact/contactForm")
public class FormComponent {
	@RequestMapping(method = RequestMethod.GET, value = "/contact/contactForm")
    public String render() {
        return "components/contactForm.ftl";
    }

}
