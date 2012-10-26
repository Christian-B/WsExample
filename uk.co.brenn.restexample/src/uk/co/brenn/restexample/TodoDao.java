/*
 * Code copied from
 * http://www.vogella.com/articles/REST/article.html#crud_class
 */
package uk.co.brenn.restexample;

import java.util.HashMap;
import java.util.Map;

public enum TodoDao {
  instance;
  
  private Map<String, Todo> contentProvider = new HashMap<String, Todo>();
  
  private TodoDao() {
    
    Todo todo = new Todo("1", "Learn REST");
    todo.setDescription("Read http://www.vogella.com/articles/REST/article.html");
    contentProvider.put("1", todo);
    todo = new Todo("2", "Do something");
    todo.setDescription("Read complete http://www.vogella.com");
    contentProvider.put("2", todo);
    
  }
  public Map<String, Todo> getModel(){
    return contentProvider;
  }
  
} 