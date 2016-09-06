package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.ClientRequestListener;
import com.tvd12.ezyfox.core.annotation.ClientResponseHandler;
import com.tvd12.ezyfox.core.content.AppContext;
import com.tvd12.ezyfox.core.exception.BadRequestException;

@ClientResponseHandler
@ClientRequestListener(command = "bet")
public class BettingRequestListener6 {

    public void execute(AppContext context, AppUser user) throws BadRequestException {
        throw new BadRequestException("error", 1);
    }
    
}
