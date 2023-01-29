public class Main {
    public static void main(String[] args) {
        class DB {

            private List<Player> allPlayers;

            public DB() {
                allPlayers = new ArrayList<Player>();
            }


            public boolean addPlayer(Player player) {
                for (Player plr : allPlayers) {
                    if (player.getPlayerId().equals(plr.getPlayerId()))
                        return false;
                }
//        if(assignLeague(player))
                allPlayers.add(player);

                return true;
            }

            public List<Player> getAllPlayers() {
                return allPlayers;
            }

            public List<Player> getPlayersByLeague(League league) {
                List<Player> playersByLeagueList = new LinkedList<>();

                for (Player player : allPlayers) {
                    if (player.getLeague().equals(league))
                        playersByLeagueList.add(player);
                }
                return playersByLeagueList;
            }

//        public void makeResetLeagueScores() {
//            for(Player player: allPlayers){
//                player.setScoreInLeague(0);
//            }
        }

        public void printAllPlayers() {
            System.out



