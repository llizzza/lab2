public class CreatingCity {
    private String name;
    private CreatingCity[] nearbyCities;
    private int[] cost;
    private int countPath;

    public CreatingCity(String name) {
        this.name = name;
        this.nearbyCities = new CreatingCity[0];
        this.cost = new int[0];
        this.countPath = 0;
    }

    public CreatingCity(String name, CreatingCity[] nearbyCities, int[] cost) {
        this.name = name;
        this.nearbyCities = new CreatingCity[nearbyCities.length];
        this.cost = new int[cost.length];
        this.countPath = nearbyCities.length;
        for (int i = 0; i < nearbyCities.length; i++) {
            this.nearbyCities[i] = nearbyCities[i];
            this.cost[i] = cost[i];
        }
    }

    public void add(CreatingCity city, int costs) {
        if (countPath == nearbyCities.length) {
            int newSize;
            if (countPath == 0) {
                newSize = 1;
            } else {
                newSize = countPath * 2;
            }
            CreatingCity[] newNearby = new CreatingCity[newSize];
            int[] newCost = new int[newSize];
            for (int i = 0; i < countPath; i++) {
                newNearby[i] = nearbyCities[i];
                newCost[i] = cost[i];
            }
            nearbyCities = newNearby;
            cost = newCost;
        }
        nearbyCities[countPath] = city;
        cost[countPath] = costs;
        countPath++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder();
        line.append(name).append(": ");
        for (int i = 0; i < countPath; i++) {
            line.append(nearbyCities[i].getName()).append(":").append(cost[i]);
            if (i < countPath - 1) {
                line.append(", ");
            }
        }
        return line.toString();
    }
}
