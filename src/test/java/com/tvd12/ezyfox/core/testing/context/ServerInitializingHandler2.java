package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;

@ServerEventHandler(event = ServerEvent.SERVER_INITIALIZING)
public class ServerInitializingHandler2 {

    public void handle(AppContext context) {
    }
    
}
