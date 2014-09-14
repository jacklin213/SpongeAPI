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

import java.util.Arrays;

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
     * Nested interface giving the "career" part to "profession"
     */
    public interface Career extends Profession {
        
        /**
         * Returns the identifier of the career.
         * 
         * @return The career identifier
         */
        String getCareer();
        
        public static enum VanillaCareer implements Career {
            FLETCHER(0, 0, "minecraft:cfletcher"),
            FARMER(0, 1, "minecraft:cfarmer"),
            FISHERMAN(0, 2, "minecraft:cfisherman"),
            SHEPHERD(0, 3, "minecraft:cshepherd"),
            LIBRARIAN(1, 0, "minecraft:clibrarian"),
            CLERIC(2, 0, "minecraft:ccleric"),
            TOOLSMITH(3, 0, "minecraft:ctoolsmith"),
            ARMORER(3, 1, "minecraft:carmorer"),
            WEAPONSMITH(3, 2, "minecraft:cweaponsmith"),
            BUTCHER(4, 0, "minecraft:cbutcher"),
            LEATHERWORKER(4, 1, "minecraft:cleatherworker")
            ;
            
            private final int pID;
            private final int cID;
            private final String career;
            
            VanillaCareer(int pID, int cID, String career) {
                this.pID = pID;
                this.cID = cID;
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
                return VanillaProfession.getProfession(pID);
            }

            @Override
            public String getCareer() {
                return career;
            }
        }
    }
    
    /**
     * Enum representing all Vanilla professions.
     */
    public static enum VanillaProfession implements Profession {
        FARMER(0, "minecraft:farmer"),
        LIBRARIAN(1, "minecraft:librarian"),
        PRIEST(2, "minecraft:priest"),
        BLACKSMITH(3, "minecraft:blacksmith"),
        BUTCHER(4,"minecraft:butcher"),
        ;

        private final int id;
        private final String profession;
        
        VanillaProfession(int id, String profession) {
            this.id = id;
            this.profession = profession;
        }

        public final int getID() {
            return id;
        }
        
        @Override
        public String getProfession() {
            return profession;
        }
        
        public static String getProfession(int id) {
            if (id == -1)return null;
            return values()[id].toString();
        }
        
    }
}
