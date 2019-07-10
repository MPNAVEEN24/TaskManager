package com.iiht.taskmanager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Tasks")
public class Task implements Comparable<Task> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long taskId;

	@Column(name = "task")
	private String task;

	@Column(name = "priority")
	private int priority;



	@Column(name = "parentTask")
	private String parentTask;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "startDate")
	private Date startDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "endDate")
	private Date endDate;

	@Column(name = "activeTask")
	private boolean activeTask;

	


	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getParentTask() {
		return parentTask;
	}

	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isActiveTask() {
		return activeTask;
	}

	public void setActiveTask(boolean activeTask) {
		this.activeTask = activeTask;
	}
	

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", task=" + task + ", priority=" + priority + ", parentTask=" + parentTask
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", activeTask=" + activeTask + "]";
	}

	@Override
	public int compareTo(Task arg0) {

		return (this.priority < arg0.priority ? -1 : (this.priority > arg0.priority ? 1 : 0));

	}

}
