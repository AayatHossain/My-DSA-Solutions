Arrays.sort(a, Comparator.comparingInt(arr -> arr[0]));

Arrays.sort(arr, new Comparator<String>() {
    @Override
    public int compare(String X, String Y) {
        // Compare YX and XY lexicographically
        return (Y + X).compareTo(X + Y);
    }
});
