package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.RoomName;
import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;

@RoomName("Lobby")
@ServerEventHandler(event = ServerEvent.USER_JOIN_ROOM)
public class UserJoinRoomHandler2 {

    public void handle(AppContext context, PokerRoom room, AppUser user) {
        
    }
    
}
