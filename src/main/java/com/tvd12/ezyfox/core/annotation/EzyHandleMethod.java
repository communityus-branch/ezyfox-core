package com.tvd12.ezyfox.core.annotation; 
 
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention; 
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target; 
 
/** 
 * Indicates that a method in a class process handle a server event 
 * To be used in conjunction with {@code @EzyServerEventHandler} classes 
 *  
 * @author tavandung12 
 * 
 */ 
 
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface EzyHandleMethod { 
 
} 