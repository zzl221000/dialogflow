package io.github.dialogflowai.sdk;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum NextAction {
    @JsonProperty("Terminate")
    TERMINATE,
    @JsonProperty("None")
    NONE,
}
