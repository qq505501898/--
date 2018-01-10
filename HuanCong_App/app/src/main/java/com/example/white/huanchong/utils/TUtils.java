package com.example.white.huanchong.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by 卢本伟·White on 2018/1/3.
 */
public class TUtils {

        private static Class<?> oClass;
        private static Type superclass;
        private static Type[] arguments;

        public static  <T>T  getT(Object o, int i){


            try {
                oClass = o.getClass();
                superclass = oClass.getGenericSuperclass();
                arguments = ((ParameterizedType) superclass).getActualTypeArguments();
                Type t=arguments[i];
                return ((Class<T>)t).newInstance();


            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            return null;
        }
}
