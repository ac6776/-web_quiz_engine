public long get(int x) {
    // implement me
        if (x < 0)
            return -1L;
        if (x == 0)
            return 1L;
        return x * get(x - 1);
}