package com.frogermcs.gactions.sample;

import com.frogermcs.gactions.api.RequestHandler;
import com.frogermcs.gactions.api.request.AIRequest;

/**
 * Created by froger_mcs on 29/04/2017.
 */
public class MyPermissionRequestHandlerFactory extends RequestHandler.Factory{
    @Override
    public RequestHandler create(AIRequest rootRequest) {
        return new MyPermissionRequestHandler(rootRequest);
    }
}
