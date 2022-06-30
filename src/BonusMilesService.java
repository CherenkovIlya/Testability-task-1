public class BonusMilesService {

    public int calculate(int cost) {
        int costMile = 20;
        int bonus = cost / costMile;
        return bonus;
    }
}
