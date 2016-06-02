package com.momo.live.dubbo.common.extensionloader.adaptive;

import com.momo.live.dubbo.common.URL;
import com.momo.live.dubbo.common.extension.Adaptive;
import com.momo.live.dubbo.common.extension.SPI;

/**
 * @author ding.lid
 */
@SPI
public interface HasAdaptiveExt {
    @Adaptive
    String echo(URL url, String s);
}
