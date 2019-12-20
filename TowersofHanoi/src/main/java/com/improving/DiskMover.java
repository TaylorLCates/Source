package com.improving;

public class DiskMover {
    int totalMoves = 0;
    public void diskMover(int n, char fromRod, char toRod, char ibxRod) {

        if (n == 1)
        {
            System.out.println("a Move disk 1 from rod " +  fromRod + " to rod " + toRod);
            totalMoves++;
            return;
        }

        diskMover(n-1, fromRod, ibxRod, toRod);
        totalMoves++;
        System.out.println("b Move disk " + n + " from rod " +  fromRod + " to rod " + toRod);
        diskMover(n-1,ibxRod, toRod, fromRod);
        System.out.println(totalMoves);
    }
}
