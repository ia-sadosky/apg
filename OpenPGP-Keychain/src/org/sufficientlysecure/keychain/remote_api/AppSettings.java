package org.sufficientlysecure.keychain.remote_api;

import org.sufficientlysecure.keychain.Id;

public class AppSettings {
    private String packageName;
    private long keyId = Id.key.none;
    private boolean asciiArmor;
    private int encryptionAlgorithm = 7; // AES-128
    private int hashAlgorithm = 10; // SHA-512
    private int compression = 2; // zlib

    public AppSettings() {

    }

    public AppSettings(String packageName) {
        super();
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public long getKeyId() {
        return keyId;
    }

    public void setKeyId(long scretKeyId) {
        this.keyId = scretKeyId;
    }

    public boolean isAsciiArmor() {
        return asciiArmor;
    }

    public void setAsciiArmor(boolean asciiArmor) {
        this.asciiArmor = asciiArmor;
    }

    public int getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(int encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public int getHashAlgorithm() {
        return hashAlgorithm;
    }

    public void setHashAlgorithm(int hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    public int getCompression() {
        return compression;
    }

    public void setCompression(int compression) {
        this.compression = compression;
    }

}