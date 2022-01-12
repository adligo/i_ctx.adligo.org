package org.adligo.i.ctx.shared;

/**
 * This represents a root context that can be use for the Context Creation and
 * Contextualtian patterns.  This interface should be use for Libraries 
 * and Tools that are intended to transpile to Javascript / Typescript using JSweets;
 *   Also this should be the root context for JME /  CLDC, MEEP, MIDP Systems.
 *    
 * @author scott
 *
 */
public interface I_Ctx {

  /**
   * This method creates a new instance of the Java Class clazz 
   * It MAY use any implementation however the common patterns include;
   * 
   * The contexts
   * @param <T>
   * @param clazz
   * @return
   */
  public Object create(String name);
  
  /**
   * This method obtains the current instance of a Contextualtian
   * a design pattern simmilar to a Singleton, with the main difference
   * being there could potentially be multiple contexts per System 
   * or JVM.
   *  
   * @param name
   * @return
   */
  public Object get(String name);
}
