/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.component.attribute;

import org.spongepowered.api.component.Component;

/**
 * Gives the "career" attribute, used for villagers.
 */
public interface Career extends Component {
    
    /**
     * Returns the identifier of the career.
     * 
     * @return The career identifier
     */
    String getCareer();
    
    /**
     * Returns the identifier of the profession based on the career.
     * 
     * @return The profession identifier
     */
    String getProfession();
    
    public static enum VanillaCareer implements Career {
        FLETCHER(0, "minecraft:farmer", "minecraft:career_fletcher"),
        FARMER(1, "minecraft:farmer", "minecraft:career_farmer"),
        FISHERMAN(2, "minecraft:farmer", "minecraft:career_fisherman"),
        SHEPHERD(3, "minecraft:farmer", "minecraft:career_shepherd"),
        LIBRARIAN(0, "minecraft:librarian", "minecraft:career_librarian"),
        CLERIC(0, "minecraft:priest", "minecraft:career_cleric"),
        TOOLSMITH(0, "minecraft:blacksmith", "minecraft:career_toolsmith"),
        ARMORER(1, "minecraft:blacksmith", "minecraft:career_armorer"),
        WEAPONSMITH(2, "minecraft:blacksmith", "minecraft:career_weaponsmith"),
        BUTCHER(0, "minecraft:butcher", "minecraft:career_butcher"),
        LEATHERWORKER(1, "minecraft:butcher", "minecraft:career_leatherworker")
        ;
        
        private final int id;
        private final String profession;
        private final String career;
        
        VanillaCareer(int id, String profession, String career) {
            this.id = id;
            this.profession = profession;
            this.career = career;
        }

        public final int getID() {
            return id;
        }

        @Override
        public String getProfession() {
            return profession;
        }

        @Override
        public String getCareer() {
            return career;
        }
    }
}
