package me.sploky.ssm.gui.buttons;

import me.sploky.ssm.elements.Element;
import me.sploky.ssm.gui.RenderUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.entity.Render;

public class ElementBaseButton extends GuiButton {
    public Element element;

    public ElementBaseButton(Element element) {
        super(0, 0, 0, 0, 0, "");
        this.element = element;
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        resizeButton();
    }

    protected void resizeButton() {
        xPosition = element.getScreenPositionX() - element.sizeX / 2;
        yPosition = element.getScreenPositionX() - element.sizeY / 2;
        width = element.sizeX;
        height = element.sizeY;
    }
}
