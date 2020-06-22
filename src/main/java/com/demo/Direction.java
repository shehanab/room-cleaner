package com.demo;

public enum Direction {
    N("W", "E"), E("N", "S"), W("S", "N"), S("E", "W");

    String left;
    String right;

    Direction(String left, String right) {

        this.left = left;
        this.right = right;
    }

    Direction changeDirectionUponControlLeft() {
        return Direction.valueOf(left);
    }

    Direction changeDirectionUponControlRight() {
        return Direction.valueOf(right);
    }
}
