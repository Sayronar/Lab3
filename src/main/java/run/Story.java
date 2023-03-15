package run;

import coreConsole.Console;
import coreFurniture.FurnitureJournal;
import coreHuman.*;
import coreInterior.*;
import utility.Firewood;

public class Story {
    public static void main(String[] args) {
        Karlson karlson = new Karlson();
        Junior junior = new Junior();
        Narrator narrator = new Narrator();
        Team team = new Team();
        Workbench workbench = new Workbench();
        Floor floor = new Floor();
        Sofa sofa = new Sofa();
        FurnitureJournal furnitureJournal = new FurnitureJournal();
        Console console = new Console();
        Player player = new Player();

        narrator.speak();
        team.sitDown(karlson, junior, sofa);
        player.choseGame(karlson, console);
        player.playGame(karlson,junior,console);
        karlson.moodChange(player);
        junior.moodChange(player);

        karlson.wish(furnitureJournal);
        workbench.location();
        workbench.contained();
        karlson.throwOff(workbench, floor);
        karlson.pulledOut(sofa);
        team.started(karlson, junior);

        team.teamNag(karlson, junior, Firewood.BOARD, furnitureJournal);
        team.teamNag(karlson, junior, Firewood.CHOCK, furnitureJournal);
        team.teamPlane(karlson, junior, Firewood.BOARD, furnitureJournal);
        team.teamPlane(karlson, junior, Firewood.CHOCK, furnitureJournal);
        team.teamKnockTogether(karlson, junior, Firewood.BOARD, furnitureJournal);
        team.teamKnockTogether(karlson, junior, Firewood.CHOCK, furnitureJournal);

        team.finishingStory(karlson, junior);
    }
}