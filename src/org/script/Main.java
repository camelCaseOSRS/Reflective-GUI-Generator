package org.script;

import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.script.nui.TabbedUI;

import javax.swing.*;

@ScriptManifest(category = Category.MISC,
        name = "UI starter",
        description = "template script to show the GUI framework",
        author = "SirPugger",
        version = 0.0
)
public class Main extends AbstractScript {
    @Override
    public void onStart() {
        // in a real script you would probably want to deserialize this from a json document somewhere
        SwingUtilities.invokeLater(() -> new TabbedUI(new Data()));
    }

    @Override
    public int onLoop() {
        return 10_000;
    }
}