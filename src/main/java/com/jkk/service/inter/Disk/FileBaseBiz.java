package com.jkk.service.inter.Disk;

public interface FileBaseBiz {
	Integer getFileIdByMD5(String MD5);

	String getFileMD5ByID(int id);

	Boolean existFile(String MD5);

	String getFileSizeByID(int id);

	String getFileSizeByMD5(String MD5);

	String FindFilePathByID(int id);

	String FindFilePathByMD5(String MD5);

	int getFileNumInSystemFolder(String folder);

	String getNextFolder();
}
