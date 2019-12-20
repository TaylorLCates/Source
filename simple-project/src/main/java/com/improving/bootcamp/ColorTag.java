package com.improving.bootcamp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Random;

public class ColorTag extends SimpleTagSupport {


    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        boolean morning = new Random().nextBoolean();
        if (morning) {
            out.println("'Red'");
        } else out.println("'blue'");

    }
}
