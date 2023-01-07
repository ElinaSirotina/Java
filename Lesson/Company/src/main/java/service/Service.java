package service;

import model.Bottom;
import model.Middle;
import model.Top;
import org.example.Position;

public class Service {
    public static void changePosition(Top top) {
        top.p = Position.middle;

    }
    public static void changePosition1(Middle middle) {
        middle.p = Position.top;

    }
    public static void changePosition2(Bottom bottom) {
        bottom.p = Position.middle;

    }
}
