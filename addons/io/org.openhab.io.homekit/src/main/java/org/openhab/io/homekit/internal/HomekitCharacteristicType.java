/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.io.homekit.internal;

import java.util.HashMap;
import java.util.Map;

/**
 * Characteristics are used by complex accessories that can't be represented by
 * a single item (i.e. a thermostat)
 *
 * @author Andy Lintner - Initial contribution
 */
public enum HomekitCharacteristicType {

    CURRENT_TEMPERATURE("CurrentTemperature"),
    TARGET_TEMPERATURE("TargetTemperature"),
    HEATING_COOLING_MODE("homekit:HeatingCoolingMode");

    private static final Map<String, HomekitCharacteristicType> TAG_MAP = new HashMap<>();

    static {
        for (HomekitCharacteristicType type : HomekitCharacteristicType.values()) {
            TAG_MAP.put(type.tag, type);
        }
    }

    private final String tag;

    private HomekitCharacteristicType(String tag) {
        this.tag = tag;
    }

    public static HomekitCharacteristicType valueOfTag(String tag) {
        return TAG_MAP.get(tag);
    }
}
