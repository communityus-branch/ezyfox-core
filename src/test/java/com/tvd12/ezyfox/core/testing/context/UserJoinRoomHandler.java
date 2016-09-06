package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;

@ServerEventHandler(event = ServerEvent.USER_JOIN_ROOM)
public class UserJoinRoomHandler {

    public void handle(AppContext context, PokerRoom room, AppUser user) {
        
    }
    
}
