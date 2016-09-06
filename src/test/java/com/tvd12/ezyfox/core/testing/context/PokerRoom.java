package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.RoomAgent;
import com.tvd12.ezyfox.core.annotation.Variable;
import com.tvd12.ezyfox.core.entities.ApiRoom;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@RoomAgent
@EqualsAndHashCode(callSuper = false)
public class PokerRoom extends ApiRoom {

    @Variable("1")
    private int maxMoney = 1000;
    
    
}
