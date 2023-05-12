public class BonusMilesService {
    public int calculate(int ticketCost) {

        int milesPerRur = 20;
        int miles = (ticketCost / milesPerRur);
        return miles;
    }
}