package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.ResponseParam;
import com.tvd12.ezyfox.core.annotation.ResponseParams;
import com.tvd12.ezyfox.core.annotation.RoomAgent;
import com.tvd12.ezyfox.core.entities.ApiRoom;

@RoomAgent
@ResponseParams
public class VideoPokerRoom extends ApiRoom {

    @ResponseParam("nus")
    public int numberOfUser() {
        return 100;
    }
    
    @ResponseParam("12")
    public CurrentState1 currentState() {
        return new CurrentState1(this);
    }
}
