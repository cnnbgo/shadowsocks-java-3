package com.fsneak.shadowsocks.encrypt;

/**
 * @author xiezhiheng
 */
public interface EncryptionHandler {
	byte[] encrypt(byte[] source);

	byte[] decrypt(byte[] source);
}