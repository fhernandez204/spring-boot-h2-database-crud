package com.api.mock;

import com.api.model.SpaceCraft;

public class SimulationData {

    public static long ID_SAPCE = 1;
    public static String VOID = "";
    public static Integer OK = 200;
    public static String statusCard = "NORM";

    public static SpaceCraft createSpaceCraft() {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.setTitle("Speeders");
        spaceCraft.setDescription("Speeders Nave");
        spaceCraft.setPublished(true);
        return spaceCraft;
    }

}
