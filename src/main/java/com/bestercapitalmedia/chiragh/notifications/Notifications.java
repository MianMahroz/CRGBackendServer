
package com.bestercapitalmedia.chiragh.notifications;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "notifications")
public class Notifications implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "notifications_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer notificationsId;
	/**
	 */

	@Column(name = "notification_Message", columnDefinition = "TEXT")
	@Basic(fetch = FetchType.EAGER)
	String notificationMessage;
	/**
	 */

	@Column(name = "message_From", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String messageFrom;
	/**
	 */

	@Column(name = "message_To", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String messageTo;
	/**
	 */

	@Column(name = "message_From_Id")
	@Basic(fetch = FetchType.EAGER)
	Integer messageFromId;
	/**
	 */

	@Column(name = "message_To_Id")
	@Basic(fetch = FetchType.EAGER)
	Integer messageToId;
	/**
	 */

	@Column(name = "message_User_Type", length = 10)
	@Basic(fetch = FetchType.EAGER)
	String messageUserType;
	/**
	 */

	@Column(name = "message_Subject", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String messageSubject;

	/**
	 */
	public void setNotificationsId(Integer notificationsId) {
		this.notificationsId = notificationsId;
	}

	/**
	 */
	public Integer getNotificationsId() {
		return this.notificationsId;
	}

	/**
	 */
	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}

	/**
	 */
	public String getNotificationMessage() {
		return this.notificationMessage;
	}

	/**
	 */
	public void setMessageFrom(String messageFrom) {
		this.messageFrom = messageFrom;
	}

	/**
	 */
	public String getMessageFrom() {
		return this.messageFrom;
	}

	/**
	 */
	public void setMessageTo(String messageTo) {
		this.messageTo = messageTo;
	}

	/**
	 */
	public String getMessageTo() {
		return this.messageTo;
	}

	/**
	 */
	public void setMessageFromId(Integer messageFromId) {
		this.messageFromId = messageFromId;
	}

	/**
	 */
	public Integer getMessageFromId() {
		return this.messageFromId;
	}

	/**
	 */
	public void setMessageToId(Integer messageToId) {
		this.messageToId = messageToId;
	}

	/**
	 */
	public Integer getMessageToId() {
		return this.messageToId;
	}

	/**
	 */
	public void setMessageUserType(String messageUserType) {
		this.messageUserType = messageUserType;
	}

	/**
	 */
	public String getMessageUserType() {
		return this.messageUserType;
	}

	/**
	 */
	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
	}

	/**
	 */
	public String getMessageSubject() {
		return this.messageSubject;
	}

	/**
	 */
	public Notifications() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Notifications that) {
		setNotificationsId(that.getNotificationsId());
		setNotificationMessage(that.getNotificationMessage());
		setMessageFrom(that.getMessageFrom());
		setMessageTo(that.getMessageTo());
		setMessageFromId(that.getMessageFromId());
		setMessageToId(that.getMessageToId());
		setMessageUserType(that.getMessageUserType());
		setMessageSubject(that.getMessageSubject());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("notificationsId=[").append(notificationsId).append("] ");
		buffer.append("notificationMessage=[").append(notificationMessage).append("] ");
		buffer.append("messageFrom=[").append(messageFrom).append("] ");
		buffer.append("messageTo=[").append(messageTo).append("] ");
		buffer.append("messageFromId=[").append(messageFromId).append("] ");
		buffer.append("messageToId=[").append(messageToId).append("] ");
		buffer.append("messageUserType=[").append(messageUserType).append("] ");
		buffer.append("messageSubject=[").append(messageSubject).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((notificationsId == null) ? 0 : notificationsId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Notifications))
			return false;
		Notifications equalCheck = (Notifications) obj;
		if ((notificationsId == null && equalCheck.notificationsId != null) || (notificationsId != null && equalCheck.notificationsId == null))
			return false;
		if (notificationsId != null && !notificationsId.equals(equalCheck.notificationsId))
			return false;
		return true;
	}
}
