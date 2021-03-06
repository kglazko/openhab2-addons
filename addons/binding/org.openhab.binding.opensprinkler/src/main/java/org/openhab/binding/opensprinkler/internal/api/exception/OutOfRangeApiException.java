/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.opensprinkler.internal.api.exception;

/**
 * The {@link OutOfRangeApiException} exception is thrown when result from the OpenSprinkler
 * API is "result" : 17.
 *
 * @author Chris Graham - Initial contribution
 */
public class OutOfRangeApiException extends Exception {
    /**
     * Serial ID of this error class.
     */
    private static final long serialVersionUID = 928567037902289026L;

    /**
     * Basic constructor allowing the storing of a single message.
     *
     * @param message Descriptive message about the error.
     */
    public OutOfRangeApiException(String message) {
        super(message);
    }
}
