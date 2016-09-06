package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.ClientRequestListener;
import com.tvd12.ezyfox.core.annotation.ClientResponseHandler;
import com.tvd12.ezyfox.core.content.AppContext;

@ClientResponseHandler
@ClientRequestListener(command = "bet")
public class BettingRequestListener4 {

    public void execute(AppContext context, PokerUser user) {
    }
    
}
