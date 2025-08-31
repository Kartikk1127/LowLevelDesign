package multithreadingAndConcurrency.deadlockAndPrevention.lockOrdering;

public class Resource {
     final int id;
     final int value;

    public Resource(int id, int value) {
        this.id = id;
        this.value = value;
    }
}
