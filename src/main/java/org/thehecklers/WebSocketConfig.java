package org.thehecklers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

/**
 * @author Mark Heckler (mark.heckler@gmail.com, @mkheck)
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Autowired
    private DataHandler dataHandler;
    @Autowired
    private ControlHandler controlHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(dataHandler, "/data").setAllowedOrigins("*");
        registry.addHandler(controlHandler, "/control").setAllowedOrigins("*");
    }
}
