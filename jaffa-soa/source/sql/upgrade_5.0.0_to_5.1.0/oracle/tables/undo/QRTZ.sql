-- Downgrading Quartz tables as per the changes from version 1.6.2 to 1.5.2

ALTER TABLE QRTZ_CALENDARS MODIFY(CALENDAR_NAME VARCHAR2(80));

ALTER TABLE QRTZ_FIRED_TRIGGERS DROP(PRIORITY);
ALTER TABLE QRTZ_FIRED_TRIGGERS MODIFY(TRIGGER_NAME VARCHAR2(80), TRIGGER_GROUP VARCHAR2(80), INSTANCE_NAME VARCHAR2(80), JOB_NAME VARCHAR2(80), JOB_GROUP VARCHAR2(80));

ALTER TABLE QRTZ_TRIGGER_LISTENERS MODIFY(TRIGGER_NAME  VARCHAR2(80), TRIGGER_GROUP VARCHAR2(80), TRIGGER_LISTENER VARCHAR2(80));

ALTER TABLE QRTZ_BLOB_TRIGGERS MODIFY(TRIGGER_NAME VARCHAR2(80), TRIGGER_GROUP VARCHAR2(80));

ALTER TABLE QRTZ_CRON_TRIGGERS MODIFY(TRIGGER_NAME VARCHAR2(80), TRIGGER_GROUP VARCHAR2(80), CRON_EXPRESSION VARCHAR2(80));

ALTER TABLE QRTZ_SIMPLE_TRIGGERS MODIFY(TRIGGER_NAME VARCHAR2(80), TRIGGER_GROUP VARCHAR2(80));

ALTER TABLE QRTZ_TRIGGERS DROP(PRIORITY);
ALTER TABLE QRTZ_TRIGGERS MODIFY(TRIGGER_NAME VARCHAR2(80), TRIGGER_GROUP VARCHAR2(80), JOB_NAME  VARCHAR2(80), JOB_GROUP VARCHAR2(80), DESCRIPTION VARCHAR2(120), CALENDAR_NAME VARCHAR2(80));

ALTER TABLE QRTZ_JOB_LISTENERS MODIFY(JOB_NAME  VARCHAR2(80), JOB_GROUP VARCHAR2(80), JOB_LISTENER VARCHAR2(80));

ALTER TABLE QRTZ_JOB_DETAILS MODIFY(JOB_NAME  VARCHAR2(80), JOB_GROUP VARCHAR2(80), DESCRIPTION VARCHAR2(120), JOB_CLASS_NAME   VARCHAR2(128));

ALTER TABLE QRTZ_PAUSED_TRIGGER_GRPS MODIFY(TRIGGER_GROUP  VARCHAR2(80));

ALTER TABLE QRTZ_SCHEDULER_STATE ADD(RECOVERER VARCHAR2(80) NULL);
ALTER TABLE QRTZ_SCHEDULER_STATE MODIFY(INSTANCE_NAME VARCHAR2(80));