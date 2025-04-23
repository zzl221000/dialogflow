package io.github.dialogflowai.sdk;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum VarKind {
    @JsonProperty("String")
    STRING,
    @JsonProperty("Number")
    NUMBER,
}
