package org.adligo.i.ctx.shared;

/**
 * This represents a root context that can be use for the Context Creation and
 * Contextualtian patterns. These patterns allow stubbing with tools like;
 * {@link <a href=
 * "https://github.com/adligo/mockito_ext.adligo.org">mockito_ext.adligo.org</a>}
 * This interface should be use for Libraries <br/>
 * <br/>
 * and Tools that are intended to transpile to Javascript / Typescript using
 * JSweets; Also this should be the root context for JME / CLDC, MEEP, MIDP
 * Systems. Finally this interface MAY eventually be use for some GWT JSNI
 * compliation, however the overrides in I_JseCtx should be preferred for most
 * GWT Systems.<br/>
 * <br/>
 * 
 * @author scott<br/>
 *         <br/>
 * 
 *         <pre>
 *         <code>
 * ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2022 Adligo Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </code>
 * 
 *         <pre>
 */
public interface I_Ctx {

  /**
   * This method creates a new instance of the Java Class clazz It MAY use any
   * implementation however the common patterns include;
   * 
   * The contexts
   * 
   * @param <T>
   * @param clazz
   * @return
   */
  public Object create(String name);

  /**
   * This method obtains the current instance of a Contextualtian a design pattern
   * similar to a Singleton, with the main difference being there could
   * potentially be multiple contexts per System or JVM. If a instance of the
   * Class doesn't exist then one should be created using the create method above.
   * 
   * @param name
   * @return
   */
  public Object get(String name);

  /**
   * This will almost always return the {@link System#currentTimeMillis()}, unless
   * you have stubbed it with something like mockito_ext.adligo.org :)
   * 
   * @return
   */
  public long getTime();
}
