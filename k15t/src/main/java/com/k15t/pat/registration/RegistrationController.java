package com.k15t.pat.registration;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k15t.pat.registration.model.Register;

import java.io.StringWriter;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;


@RestController
public class RegistrationController{

    @Autowired private VelocityEngine velocityEngine;
	private ApplicationContext applicationContext;

    @RequestMapping("/registration.html")
    public String registration() {

        Template template = velocityEngine.getTemplate("templates/registration.vm");
        VelocityContext context = new VelocityContext();
        StringWriter writer = new StringWriter();
        template.merge(context, writer);

        return writer.toString();
    }
    
    @POST
    @RequestMapping("/result.html")
    public String result(Register member) {
    	
    	Template template = velocityEngine.getTemplate("templates/result.vm");
        VelocityContext context = new VelocityContext();
        context.put("member", member);
        StringWriter writer = new StringWriter();
        template.merge(context, writer);
        
        return writer.toString();
    }
}
