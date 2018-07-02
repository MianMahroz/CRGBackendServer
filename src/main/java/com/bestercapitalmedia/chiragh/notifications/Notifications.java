
package com.bestercapitalmedia.chiragh.notifications;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;



import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Notifications.
 */

@Entity
@Table(catalog = "chiraghdatabase", name = "notifications")
public class Notifications implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The notifications id. */

	@Column(name = "notifications_Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer notificationsId;
	
	/** The notification message. */

	@Column(name = "notification_Message", columnDefinition = "TEXT")
	@Basic(fetch = FetchType.EAGER)
	String notificationMessage;
	
	/** The message from. */

	@Column(name = "message_From", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String messageFrom;
	
	/** The message to. */

	@Column(name = "message_To", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String messageTo;
	
	/** The message from id. */

	@Column(name = "message_From_Id")
	@Basic(fetch = FetchType.EAGER)
	Integer messageFromId;
	
	/** The message to id. */

	@Column(name = "message_To_Id")
	@Basic(fetch = FetchType.EAGER)
	Integer messageToId;
	
	/** The message user type. */

	@Column(name = "message_User_Type", length = 10)
	@Basic(fetch = FetchType.EAGER)
	String messageUserType;
	
	/** The message subject. */

	@Column(name = "message_Subject", length = 45)
	@Basic(fetch = FetchType.EAGER)
	String messageSubject;

	/**
	 * Sets the notifications id.
	 *
	 * @param notificationsId the new notifications id
	 */
	public void setNotificationsId(Integer notificationsId) {
		this.notificationsId = notificationsId;
	}

	/**
	 * Gets the notifications id.
	 *
	 * @return the notifications id
	 */
	public Integer getNotificationsId() {
		return this.notificationsId;
	}

	/**
	 * Sets the notification message.
	 *
	 * @param notificationMessage the new notification message
	 */
	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}

	/**
	 * Gets the notification message.
	 *
	 * @return the notification message
	 */
	public String getNotificationMessage() {
		return this.notificationMessage;
	}

	/**
	 * Sets the message from.
	 *
	 * @param messageFrom the new message from
	 */
	public void setMessageFrom(String messageFrom) {
		this.messageFrom = messageFrom;
	}

	/**
	 * Gets the message from.
	 *
	 * @return the message from
	 */
	public String getMessageFrom() {
		return this.messageFrom;
	}

	/**
	 * Sets the message to.
	 *
	 * @param messageTo the new message to
	 */
	public void setMessageTo(String messageTo) {
		this.messageTo = messageTo;
	}

	/**
	 * Gets the message to.
	 *
	 * @return the message to
	 */
	public String getMessageTo() {
		return this.messageTo;
	}

	/**
	 * Sets the message from id.
	 *
	 * @param messageFromId the new message from id
	 */
	public void setMessageFromId(Integer messageFromId) {
		this.messageFromId = messageFromId;
	}

	/**
	 * Gets the message from id.
	 *
	 * @return the message from id
	 */
	public Integer getMessageFromId() {
		return this.messageFromId;
	}

	/**
	 * Sets the message to id.
	 *
	 * @param messageToId the new message to id
	 */
	public void setMessageToId(Integer messageToId) {
		this.messageToId = messageToId;
	}

	/**
	 * Gets the message to id.
	 *
	 * @return the message to id
	 */
	public Integer getMessageToId() {
		return this.messageToId;
	}

	/**
	 * Sets the message user type.
	 *
	 * @param messageUserType the new message user type
	 */
	public void setMessageUserType(String messageUserType) {
		this.messageUserType = messageUserType;
	}

	/**
	 * Gets the message user type.
	 *
	 * @return the message user type
	 */
	public String getMessageUserType() {
		return this.messageUserType;
	}

	/**
	 * Sets the message subject.
	 *
	 * @param messageSubject the new message subject
	 */
	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
	}

	/**
	 * Gets the message subject.
	 *
	 * @return the message subject
	 */
	public String getMessageSubject() {
		return this.messageSubject;
	}

	/**
	 * Instantiates a new notifications.
	 */
	public Notifications() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
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
	 * @return the string
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((notificationsId == null) ? 0 : notificationsId.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
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
