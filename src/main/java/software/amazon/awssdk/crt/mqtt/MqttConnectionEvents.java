
/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package software.amazon.awssdk.crt.mqtt;

/** 
 * Interface used to receive connection events from the CRT 
 */
public interface MqttConnectionEvents {
    /**
     * connection was lost (or disconnected), reconnect will be attempted automatically until
     * disconnect() is called
     */
    void onConnectionInterrupted(int errorCode);

    /**
     *  called on first successful connect, and whenever a reconnect succeeds 
     */
    void onConnectionResumed(boolean sessionPresent);
}
