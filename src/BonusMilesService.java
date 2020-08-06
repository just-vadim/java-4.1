public class BonusMilesService {
    public int calculate (int cost){
        int bonusRate = 20;
        int bonusMiles = cost / bonusRate;
        return bonusMiles;
    }
}