package com.fortmocks.core.mock.rest.model.event.service.message.output;

import com.fortmocks.core.basis.model.Output;
import com.fortmocks.core.basis.model.validation.NotNull;
import com.fortmocks.core.mock.rest.model.event.dto.RestEventDto;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class ReadRestEventOutput implements Output {

    @NotNull
    private RestEventDto restEvent;

    public ReadRestEventOutput(RestEventDto restEvent) {
        this.restEvent = restEvent;
    }

    public RestEventDto getRestEvent() {
        return restEvent;
    }

    public void setRestEvent(RestEventDto restEvent) {
        this.restEvent = restEvent;
    }
}