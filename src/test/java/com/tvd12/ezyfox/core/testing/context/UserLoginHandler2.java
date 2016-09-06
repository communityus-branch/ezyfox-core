package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;
import com.tvd12.ezyfox.core.entities.ApiLogin;

@ServerEventHandler(event = ServerEvent.USER_LOGIN)
public class UserLoginHandler2 {
    
    public void handle(AppContext context, ApiLogin data) {
        
    }
    
}
