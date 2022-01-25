package org.adligo.i.ctx.shared;


/**
 * This interfaces marks a class or other interface as having a constructor
 * with a single {@link I_Ctx} argument. Note that in most cases the I_JseCtx
 * from the {@link <a href="https://github.com/adligo/i_ctx4jse.adligo.org">i_ctx4jse.adligo.org</a>}
 * will be desired because of it's ability to use generics in the ctx pattern.<br/>
 *   Note that the leaf most context will be passed to the constructor.
 * <br/>
 * 
 * @author scott<br/>
 *         <br/>
 * 
 * <pre><code>
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
 * </code><pre>
 */
public interface I_CtxAware {

  public I_Ctx getCtx();
}
