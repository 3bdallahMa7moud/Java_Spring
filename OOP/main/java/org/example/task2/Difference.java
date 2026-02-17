package org.example.task2;

public class Difference {
        private long a;
        private long b;
        private long c;
        private long d;

        public Difference(long a, long b, long c, long d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public long calculate() {
            return (a * b) - (c * d);
        }
    }


