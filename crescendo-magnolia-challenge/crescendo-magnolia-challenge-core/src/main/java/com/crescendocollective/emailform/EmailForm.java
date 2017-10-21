package com.crescendocollective.emailform;

import javax.jcr.Node;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;

import info.magnolia.rendering.model.RenderingModel;
import info.magnolia.rendering.model.RenderingModelImpl;
import info.magnolia.rendering.template.configured.ConfiguredTemplateDefinition;

public class EmailForm <RD extends ConfiguredTemplateDefinition> extends RenderingModelImpl<ConfiguredTemplateDefinition> {
	
	public EmailForm(Node content, ConfiguredTemplateDefinition definition, RenderingModel<?> parent) {
		super(content, definition, parent);
		statusMessage = "";
		// TODO Auto-generated constructor stub
	}
	
	private String firstName;
	private String lastName;
	private String email;
	private String statusMessage;
	private boolean join;
	
	
	
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isJoin() {
		return join;
	}
	public void setJoin(boolean join) {
		this.join = join;
	}
	
	public void confirmSubmit(){
		statusMessage = "";
		if (join) { 
			String message = "please add " + firstName + " " + lastName + " " + email + " to the mailing list";
			EmailService.sendEmail("s.keuler@gmail.com", email, message);
			statusMessage = "user " + firstName + " has been added to the mailing list";
		}else  {
			statusMessage = "user " + firstName + " has not been added to the mailing list";
		}
	}
	
	
	
	

}
