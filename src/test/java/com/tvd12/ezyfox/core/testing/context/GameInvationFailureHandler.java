package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;
import com.tvd12.ezyfox.core.entities.ApiZone;

/**
 * @author tavandung12
 * Created on Jul 3, 2016
 *
 */
@ServerEventHandler(event = ServerEvent.GAME_INVITATION_FAILURE)
public class GameInvationFailureHandler {

    public void handle(AppContext context, ApiZone zone, PokerRoom room) {
        
    }
    
}
