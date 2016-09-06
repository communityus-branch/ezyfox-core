package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.BuddyVariable;
import com.tvd12.ezyfox.core.annotation.UserAgent;
import com.tvd12.ezyfox.core.annotation.Variable;
import com.tvd12.ezyfox.core.entities.ApiUser;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@UserAgent
@EqualsAndHashCode(callSuper=false)
public class AppUser extends ApiUser {
    
    @Variable
    private long money;
    
    @Variable("2")
    @BuddyVariable("2")
    private String hello = "hello";
    
}
