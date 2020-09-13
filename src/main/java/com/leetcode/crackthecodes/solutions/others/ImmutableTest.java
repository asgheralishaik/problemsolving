package com.leetcode.crackthecodes.solutions.others;

public final class ImmutableTest {



    private final String attribute1;
    private final String attribute2;

    private final int attribute3;

    public ImmutableTest(final String attribute1New,final String attribute2New,final int attribute3new){
        this.attribute1 = attribute1New;
        this.attribute2 = attribute2New;
        this.attribute3 = attribute3new;
    }

    public int getAttribute3() {
        return attribute3;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }
}
