package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.RoomName;
import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;
import com.tvd12.ezyfox.core.entities.ApiRoom;

@RoomName("")
@ServerEventHandler(event = ServerEvent.USER_JOIN_ROOM)
public class UserJoinRoomHandler6 {

    public void handle(AppContext context, ApiRoom room, AppUser user) {
        
    }
    
}
