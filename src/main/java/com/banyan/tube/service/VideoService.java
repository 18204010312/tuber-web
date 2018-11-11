package com.banyan.tube.service;

import java.util.List;

import com.banyan.tube.form.VideoForm;

public interface VideoService {

	List<VideoForm> selectAll(Integer userId);

	List<VideoForm> search(VideoForm form);

	VideoForm view(Integer id);
	
}
