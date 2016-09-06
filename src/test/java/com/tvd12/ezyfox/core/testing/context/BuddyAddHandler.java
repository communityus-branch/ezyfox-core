package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;
import com.tvd12.ezyfox.core.entities.ApiBuddy;
import com.tvd12.ezyfox.core.entities.ApiZone;

/**
 * @author tavandung12
 * Created on May 30, 2016
 *
 */
@ServerEventHandler(event = ServerEvent.BUDDY_ADD)
public class BuddyAddHandler {

    public void handle(AppContext context, ApiZone zone, ApiBuddy buddy) {
        
    }
    
}
