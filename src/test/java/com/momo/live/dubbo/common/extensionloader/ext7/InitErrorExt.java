/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.momo.live.dubbo.common.extensionloader.ext7;

import com.momo.live.dubbo.common.URL;
import com.momo.live.dubbo.common.extension.Adaptive;
import com.momo.live.dubbo.common.extension.SPI;

/**
 * 用于测试：
 * DUBBO-144 扩展点加载失败（如依赖的三方库运行时没有），如扩展点没有用到，则加载不要报错（在使用到时报错）
 * 
 * @author ding.lid
 */
@SPI
public interface InitErrorExt {
    @Adaptive
    String echo(URL url, String s);
}