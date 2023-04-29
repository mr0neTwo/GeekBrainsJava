package HomeWorkOOP.HomeWork04;

public class HomeWork04 {

    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>();

        archerTeam.addWarrior(new Archer("Jaime Lannister", 30,  new Bow(), new WoodenShield()));
        archerTeam.addWarrior(new Archer("Robert Baratheon", 50,  new Bow(), new WoodenShield()));

        Team<Assasin> assasins = new Team<>();

        assasins.addWarrior(new Assasin("Ezio Auditore da Firenze", 40, new Knife()));
        assasins.addWarrior(new Assasin("Altair Ibn-La'Ahad", 45, new Knife()));
        assasins.addWarrior(new Assasin("Emily Kaldwin", 50, new Knife()));
        
        System.out.println(archerTeam);
        System.out.println();
        System.out.println(assasins);

        System.out.println();
        Assasin one = new Assasin("Ezio Auditore da Firenze", 40, new Knife());
        Archer two = new Archer("Jaime Lannister", 30,  new Bow(), new WoodenShield());
        Battle battle = new Battle(one, two);
        Warrior winner = battle.fight();
        
        System.out.println();
        System.out.println("Winner:");
        System.out.println(winner);
    }
    
    
}
