package com.example.brickbreaker;

public class Paddle {
    private int x;
    private int y;
    private int width;
    private int height;
    private int xSpeed;

    public Paddle(int x, int y, int width, int height, int xSpeed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.xSpeed = xSpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setX(int i) {
        x = i;
    }
}
