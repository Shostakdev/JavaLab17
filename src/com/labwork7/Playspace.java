package com.labwork7;

/**
 * Playspace class
 */
public class Playspace {
    /**
     * Length of the playspace
     */
    private int length;
    /**
     * Width of the playspace
     */
    private int width;

    /**
     * Constructor
     * @param builder Builder object
     */
    private Playspace(Builder builder) {
        this.length = builder.length;
        this.width = builder.width;
    }

    /**
     * Get the length of the playspace
     * @return Length of the playspace
     */
    public int getLength() {
        return length;
    }

    /**
     * Get the width of the playspace
     * @return Width of the playspace
     */
    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Playspace [length=" + length + ", width=" + width + "]";
    }

    /**
     * Builder class
     */
    public static class Builder {
        /**
         * Length of the playspace
         */
        private int length;
        /**
         * Width of the playspace
         */
        private int width;

        /**
         * Set the length of the playspace
         * @param length Length of the playspace
         * @return Builder object
         */
        public Builder setLength(int length) {
            this.length = length;
            return this;
        }

        /**
         * Set the width of the playspace
         * @param width Width of the playspace
         * @return Builder object
         */
        public Builder setWidth(int width) {
            this.width = width;
            return this;
        }

        /**
         * Build the playspace object
         * @return Playspace object
         */
        public Playspace build() {
            return new Playspace(this);
        }
    }
}
