package io.github.dialogflowai.sdk;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UserInputResult {
    @JsonProperty("Successful")
    SUCCESSFUL,
    @JsonProperty("Timeout")
    TIMEOUT,
}
