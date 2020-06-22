package com.demo;

public class Vacuum {
    private Direction direction;
    private int xCoordinate;
    private int yCoordinate;

    public Vacuum(Direction direction, int xCoordinate, int yCordinate) {
        this.direction = direction;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCordinate;
    }

    public int turn(Control control){
        if(control == Control.L){
            this.setDirection(direction.changeDirectionUponControlLeft());
        } else if (control == Control.R){
            this.setDirection(direction.changeDirectionUponControlRight());
        } else {

        }

        return 0;
    }


    public void changeDirection(Control control){

    }

    public Direction getDirection() {
        return direction;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
