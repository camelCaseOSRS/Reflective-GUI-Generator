package org.script;

import com.google.gson.annotations.SerializedName;
import org.script.nui.UITab;

public class Data {
    @SerializedName("hoursUntilMuleOff")
    @UITab("script")
    public int hoursUntilMuleOff = 12;
    @SerializedName("initalGP")
    @UITab("script")
    public int initalGP = 16_000_000;
    @SerializedName("slayerLvl")
    @UITab({"skilling", "slayer"})
    public int slayerLvl = 30;
    @SerializedName("slayDragons")
    @UITab({"skilling", "slayer"} )
    public boolean slayDragons = false;
    @SerializedName("slayWithWhip")
    @UITab({"skilling", "slayer"})
    public boolean slayWithWhip = true;
    @SerializedName("prayerTarget")
    @UITab({"skilling", "prayer"})
    public int prayerTarget = 60;
    @SerializedName("prayInPOH")
    @UITab({"skilling", "prayer"})
    public boolean prayInPOH = true;
    @SerializedName("moneyLeftAfterMuling")
    @UITab("script")
    public int moneyLeftAfterMuling = 1_000_000;
    @SerializedName("minLootValue")
    @UITab("script")
    public int minLootValue = 1000;

}
