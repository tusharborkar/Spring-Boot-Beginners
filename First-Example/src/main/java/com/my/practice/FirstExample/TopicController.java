package com.my.practice.FirstExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/getid/{id}")
	public Topic getId(@PathVariable String id) {
		System.out.println("iddddddd");
		return topicService.getId(id);

	}

	@RequestMapping("/getList")
	public List<Topic> getList() {
		return topicService.getList();

	}

	@RequestMapping(method = RequestMethod.POST, value = "/addTopic")
	public void addInList(@RequestBody Topic topic) {
		topicService.addTopics(topic);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/updateTopic/{id}")
	public void updateInList(@RequestBody Topic topic, @PathVariable String id) {
		System.out.println("service call update");
		topicService.updateTopics(id, topic);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteTopic/{id}")
	public void deleteInList(@RequestBody Topic topic, @PathVariable String id) {
		System.out.println("service call Delete");
		topicService.deleteTopics(id);

	}

}
