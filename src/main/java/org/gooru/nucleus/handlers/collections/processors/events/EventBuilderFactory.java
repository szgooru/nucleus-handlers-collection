package org.gooru.nucleus.handlers.collections.processors.events;

import io.vertx.core.json.JsonObject;

/**
 * Created by ashish on 19/1/16.
 */
public class EventBuilderFactory {

  private static final String EVT_COLLECTION_CREATE = "event.collection.create";
  private static final String EVT_COLLECTION_UPDATE = "event.collection.update";
  private static final String EVT_COLLECTION_DELETE = "event.collection.delete";
  private static final String EVT_COLLECTION_COPY = "event.collection.copy";
  private static final String EVENT_NAME = "event.name";
  private static final String EVENT_BODY = "event.body";
  private static final String COLLECTION_ID = "id";

  public static EventBuilder getDeleteCollectionEventBuilder(String collectionId) {
    return new EventBuilder() {
      @Override
      public JsonObject build() {
        return new JsonObject().put(EVENT_NAME, EVT_COLLECTION_DELETE).put(EVENT_BODY, new JsonObject().put(COLLECTION_ID, collectionId));
      }
    };
  }

  public static EventBuilder getCreateCollectionEventBuilder(String collectionId) {
    return new EventBuilder() {
      @Override
      public JsonObject build() {
        return new JsonObject().put(EVENT_NAME, EVT_COLLECTION_CREATE).put(EVENT_BODY, new JsonObject().put(COLLECTION_ID, collectionId));
      }
    };
  }

  public static EventBuilder getUpdateCollectionEventBuilder(String collectionId) {
    return new EventBuilder() {
      @Override
      public JsonObject build() {
        return new JsonObject().put(EVENT_NAME, EVT_COLLECTION_UPDATE).put(EVENT_BODY, new JsonObject().put(COLLECTION_ID, collectionId));
      }
    };
  }

  public static EventBuilder getCopyCollectionEventBuilder(String collectionId) {
    return new EventBuilder() {
      @Override
      public JsonObject build() {
        return new JsonObject().put(EVENT_NAME, EVT_COLLECTION_COPY).put(EVENT_BODY, new JsonObject().put(COLLECTION_ID, collectionId));
      }
    };
  }
}
