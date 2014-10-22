package com.mycompany;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class HomePage extends WebPage
{

  private static final long serialVersionUID = 1L;

  public HomePage(final PageParameters parameters)
  {
    super(parameters);
    WebMarkupContainer container = new WebMarkupContainer("container");
    Label label = new Label("label", new Model("Show me"));

    add(new MyPanel("panel"));

    queue(label);
    queue(container);
    queue(new Label("panelLabel"));
  }
}
