/*
 * Copyright 2013 Moving Blocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.physics;

import org.terasology.entitySystem.event.AbstractEvent;

import javax.vecmath.Vector3f;

/**
 * Created with IntelliJ IDEA.
 * User: Pencilcheck
 * Date: 12/23/12
 * Time: 12:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class MovedEvent extends AbstractEvent {
    private Vector3f delta;
    private Vector3f final_position;

    public MovedEvent(Vector3f delta, Vector3f final_position) {
        this.delta = delta;
        this.final_position = final_position;
    }

    public Vector3f getDelta() {
        return delta;
    }

    public Vector3f getPosition() {
        return final_position;
    }
}
