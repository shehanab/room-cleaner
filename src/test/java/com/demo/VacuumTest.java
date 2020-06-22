package com.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacuumTest {

    Vacuum vacuum;

    @BeforeEach
    void setUp() {


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void turnVacuumLeft() {
        vacuum = new Vacuum(Direction.N, 2, 2);
        int turn = vacuum.turn(Control.L);
        assertEquals(Direction.W, vacuum.getDirection());
    }


    @Test
    void turnVacuumLeftToFaceWest() {
        vacuum = new Vacuum(Direction.W, 2, 2);
        int turn = vacuum.turn(Control.L);
        assertEquals(Direction.S, vacuum.getDirection());
    }



    @Test
    void turnVacuumLeftToFaceSouth() {
        vacuum = new Vacuum(Direction.S, 2, 2);
        int turn = vacuum.turn(Control.L);
        assertEquals(Direction.E, vacuum.getDirection());
    }


}