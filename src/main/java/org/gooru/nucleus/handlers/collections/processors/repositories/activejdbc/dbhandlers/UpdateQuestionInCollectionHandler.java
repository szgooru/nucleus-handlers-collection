package org.gooru.nucleus.handlers.collections.processors.repositories.activejdbc.dbhandlers;

import org.gooru.nucleus.handlers.collections.processors.ProcessorContext;
import org.gooru.nucleus.handlers.collections.processors.responses.ExecutionResult;
import org.gooru.nucleus.handlers.collections.processors.responses.MessageResponse;

/**
 * Created by ashish on 12/1/16.
 */
class UpdateQuestionInCollectionHandler implements DBHandler {
  private final ProcessorContext context;

  public UpdateQuestionInCollectionHandler(ProcessorContext context) {
    this.context = context;
  }

  @Override
  public ExecutionResult<MessageResponse> checkSanity() {
    return null;
  }

  @Override
  public ExecutionResult<MessageResponse> validateRequest() {
    return null;
  }

  @Override
  public ExecutionResult<MessageResponse> executeRequest() {
    return null;
  }

  @Override
  public boolean handlerReadOnly() {
    return false;
  }
}
