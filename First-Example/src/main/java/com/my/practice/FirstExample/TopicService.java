package com.my.practice.FirstExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topic = new ArrayList(Arrays.asList(new Topic("abc ", "asdd", "asd"), new Topic("pqr ", "asdd", "asd"),
			new Topic("mno ", "asdd", "asd")));

	public List<Topic> getList() {

		return topic;

	}

	public Topic getId(String id) {
		System.out.println("printn topic");

		return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopics(Topic topic2) {

		topic.add(topic2);
	}

	public void updateTopics(String id, Topic topic2) {

		for (int i = 0; i < topic.size(); i++) {

			Topic t = topic.get(i);
			if (t.getId().equals(id)) {

				topic.set(i, topic2);
				return;
			}
		}

	}

	public void deleteTopics(String id) {

		topic.removeIf(t -> t.getId().equals(id));

	}

}
