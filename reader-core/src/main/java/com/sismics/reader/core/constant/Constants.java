package com.sismics.reader.core.constant;

/**
 * Application constants.
 * 
 * @author jtremeaux
 */
public class Constants {
    /**
     * Default locale.
     */
    public static final String DEFAULT_LOCALE_ID = "en";

    /**
     * Default timezone ID.
     */
    public static final String DEFAULT_TIMEZONE_ID = "Europe/London";
    
    /**
     * Administrator's default password ("admin").
     */
    public static final String DEFAULT_ADMIN_PASSWORD = "$2a$05$6Ny3TjrW3aVAL1or2SlcR.fhuDgPKp5jp.P9fBXwVNePgeLqb4i3C";

    /**
     * RAM Lucene directory storage.
     */
    public static final String LUCENE_DIRECTORY_STORAGE_RAM = "RAM";
    
    /**
     * File Lucene directory storage.
     */
    public static final String LUCENE_DIRECTORY_STORAGE_FILE = "FILE";
}
