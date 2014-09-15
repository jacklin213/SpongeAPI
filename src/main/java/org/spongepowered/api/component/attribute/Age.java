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
 * Gives the "age" attribute. </p> Examples of entities that "age" : Zombie,
 * Chicken, Sheep, etc.
 */
public interface Age extends Component {

    // TODO: Decide on how the "age" value works. Which int signifies what age

    /**
     * Gets the age of the entity.
     * 
     * @return age The age value
     */
    int getAge();

    /**
     * Checks to see if age is locked
     * 
     * @return true If locked
     */
    boolean isAgeLock();

    /**
     * Checks if the entity is a baby
     * 
     * @return true If age value is baby
     */
    boolean isBaby();

    /**
     * Sets the age of the entity.
     * 
     * @param age The age value
     */
    void setAge(int age);
    
    /**
     * Sets the lock on age therefore preventing the entity from "growing".
     * 
     * @param lock true To lock
     */
    void setAgeLock(boolean lock);

}
