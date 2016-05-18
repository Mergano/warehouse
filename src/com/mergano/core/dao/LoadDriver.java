/*
 * Copyright 2016 vchuk.
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
package com.mergano.core.dao;

public class LoadDriver {

    private static String driver;
    private static String url_head;

    public LoadDriver() {
        driver = null;
        url_head = null;
    }

    public void LoadDBDriver(int DriverType) {
        switch (DriverType) {
            case 1: // MySQL
                setUrlHeader("jdbc:mysql://");
                setDriver("com.mysql.jdbc.Driver");
                break;
            case 2: // Postgresql
                setUrlHeader("jdbc:postgresql://");
                setDriver("org.postgresql.Driver");
                break;
            case 3: // SQL Server
                setUrlHeader("jdbc:microsoft:sqlserver://");
                setDriver("com.microsoft.jdbc.sqlserver.SQLServerDriver");
                break;
            case 4: // DB2
                setUrlHeader("jdbc:as400://");
                setDriver("com.ibm.as400.access.AS400JDBCDriver");
                break;
            default:
                break;
        }
    }

    public static String getDriver() {
        return driver;
    }

    public static void setDriver(String driver) {
        LoadDriver.driver = driver;
    }

    public static String getUrlHeader() {
        return url_head;
    }

    public static void setUrlHeader(String url_head) {
        LoadDriver.url_head = url_head;
    }

}
