package view;

import org.apache.commons.lang3.tuple.Pair;

import model.entities.survivor.SurvivorFactory;
import view.graphics_survivor.CommonGraphics;
import view.survivor_game.GameSurvivor;
import view.survivor_game.IGameSurvivor;

public class FactorySurvivorGame {
    private SurvivorFactory sur = new SurvivorFactory();

    public IGameSurvivor gameSurvivorCommon(final int live,final int attack, final Pair<Double,Double> pos, final Pair<Double,Double> vel){
        return new GameSurvivor(sur.createCommon(live, attack, pos, vel),
                     new CommonGraphics());
    }
}
