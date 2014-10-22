package com.mycompany;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;


/**
 * @author Martin Dilger
 * @since: 22.10.14
 */
public class MyPanel extends Panel
{

  public MyPanel(String id)
  {
    super(id);
    queue(new Label("panelLabel", "Hello Panel"));
  }
}
