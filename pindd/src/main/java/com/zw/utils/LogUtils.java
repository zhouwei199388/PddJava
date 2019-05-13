package com.zw.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zw on 2019/3/24.
 */
public class LogUtils {
    private static Logger logger = LoggerFactory.getLogger(LogUtils.class);

    public static void info(String text) {
        logger.info(text);
    }

}
