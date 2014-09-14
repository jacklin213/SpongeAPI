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
 * Gives the "profession" attribute, used for villagers.
 */
public interface Profession extends Component {
    
    /**
     * Returns the identifier of the profession.
     * 
     * @return The profession identifier
     */
    String getProfession();
    
    /**
     * Returns the identifier of the career.
     * 
     * @return The career identifier
     */
    String getCareer();
    
    /**
     * Enum representing all Vanilla professions.
     */
    public static enum VanillaProfession implements Profession {
        FARMER_FLETCHER(0, 0, "minecraft:farmer", "minecraft:farmerfletcher"),
        FARMER_FARMER(0, 1, "minecraft:farmer", "minecraft:farmerfarmer"),
        FARMER_FISHERMAN(0, 2, "minecraft:farmer", "minecraft:farmerfisherman"),
        FARMER_SHEPHERD(0, 1, "minecraft:farmer", "minecraft:farmershepherd"),
        LIBRARIAN_LIBRARIAN(1, 0, "minecraft:librarian", "minecraft:librarianlibrarian"),
        PRIEST(2, 0, "minecraft:priest", "minecraft:preistcleric"),
        BLACKSMITH_TOOLSMITH(3, 0, "minecraft:blacksmith", "minecraft:blacksmithtoolsmith"),
        BLACKSMITH_AMRORER(3, 1, "minecraft:blacksmith", "minecraft:blacksmithamrorer"),
        BLACKSMITH_WEAPONSMITH(3, 2, "minecraft:blacksmith", "minecraft:blacksmithweaponsmith"),
        BUTCHER(4, 0, "minecraft:butcher", "minecraft:butcher"),
        BUTCHER_LEATHERWORKER(4, 1, "minecraft:butcher", "minecraft:butcherleatherworker")
        ;

        private final int pID;
        private final int cID;
        private final String profession;
        private final String career;
        
        VanillaProfession(int pID, int cID, String profession, String career) {
            this.pID = pID;
            this.cID = cID;
            this.profession = profession;
            this.career = career;
        }

        public final int getPID() {
            return pID;
        }
        
        public final int getCID() {
            return cID;
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
