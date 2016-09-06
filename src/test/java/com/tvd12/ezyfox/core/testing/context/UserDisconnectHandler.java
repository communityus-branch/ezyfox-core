package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;
import com.tvd12.ezyfox.core.entities.ApiDisconnection;

/**
 * @author tavandung12
 * Created on Jun 30, 2016
 *
 */
@ServerEventHandler(event = ServerEvent.USER_DISCONNECT)
public class UserDisconnectHandler {

    public void handle(AppContext context, ApiDisconnection disconnection) {
        
    }
    
}
