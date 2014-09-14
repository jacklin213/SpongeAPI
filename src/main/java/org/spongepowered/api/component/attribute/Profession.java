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
            FLETCHER(0, "minecraft:farmer", "minecraft:cfletcher"),
            FARMER(1, "minecraft:farmer", "minecraft:cfarmer"),
            FISHERMAN(2, "minecraft:farmer", "minecraft:cfisherman"),
            SHEPHERD(3, "minecraft:farmer", "minecraft:cshepherd"),
            LIBRARIAN(0, "minecraft:librarian", "minecraft:clibrarian"),
            CLERIC(0, "minecraft:priest", "minecraft:ccleric"),
            TOOLSMITH(0, "minecraft:blacksmith", "minecraft:ctoolsmith"),
            ARMORER(1, "minecraft:blacksmith", "minecraft:carmorer"),
            WEAPONSMITH(2, "minecraft:blacksmith", "minecraft:cweaponsmith"),
            BUTCHER(0, "minecraft:butcher", "minecraft:cbutcher"),
            LEATHERWORKER(1, "minecraft:butcher", "minecraft:cleatherworker")
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
