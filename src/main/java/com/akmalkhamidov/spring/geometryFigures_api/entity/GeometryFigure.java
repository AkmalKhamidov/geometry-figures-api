package com.akmalkhamidov.spring.geometryFigures_api.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


// jackson helps to convert data to JSON by using getters and setters.
// @JsonTypeInfo is using to wrap object (in this case GeometryFigure abstract class). By default, is using PROPERTY type of wrappign
// By using @JsonSubTypes I can sort child classes of GeometryFigure by using type (in this case I don't need to write logic in PostMapping method with if statements
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,  property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = RectangleFigure.class, name = "RECTANGLE"),
        @JsonSubTypes.Type(value = SquareFigure.class, name = "SQUARE"),
        @JsonSubTypes.Type(value = TriangleFigure.class, name = "TRIANGLE"),
        @JsonSubTypes.Type(value = CircleFigure.class, name = "CIRCLE")

})
public abstract class GeometryFigure {

    public abstract boolean isValidFigure();

    public GeometryFigure() {
    }

    public abstract void findPerimeter();

    public abstract void findArea();

}
