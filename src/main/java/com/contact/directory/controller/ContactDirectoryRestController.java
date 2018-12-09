package com.contact.directory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contact.directory.service.ContactDirectoryService;

@Controller
@RequestMapping(value = "/contact", method = RequestMethod.GET)
public class ContactDirectoryRestController {
	 
	@Autowired
	private ContactDirectoryService contactDirectoryService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<String> getContacts() {
			return contactDirectoryService.getContacts();
		}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody String getContact(@PathVariable("name") String contact) {
			return contactDirectoryService.getContact(contact);
		}
		
	@RequestMapping(value = "/create/{name}", method = RequestMethod.POST)
	public @ResponseBody boolean createContact(@PathVariable("name") String contact) {
			return contactDirectoryService.createContact(contact);
		}
		
	@RequestMapping(value = "/update/{oldname}/{newname}", method = RequestMethod.PUT)
	public @ResponseBody boolean updateContact(@PathVariable("oldname") String oldContact,@PathVariable("newname")  String newContact) {
			return contactDirectoryService.updateContact(oldContact, newContact);
		}
		
	@RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteContact(@PathVariable("name") String contact) {
			return contactDirectoryService.deleteContact(contact);
		}
	 
}