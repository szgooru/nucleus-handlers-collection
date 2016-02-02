package org.gooru.nucleus.handlers.collections.processors.repositories.activejdbc.entities;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ashish on 2/2/16.
 */
@Table("content")
public class AJEntityContent extends Model {

  public static final String CONTENT_FOR_REORDER_COLLECTION_QUERY = "select id from content where collection_id = ?::uuid and is_deleted = false";
  public static final String REORDER_QUERY =
    "update content set sequence_id = ?, modifier_id = ?::uuid, updated_at = now() where id = ?::uuid and collection_id = ?::uuid and is_deleted = " +
      "false";
  public static final String SEQUENCE_ID = "sequence_id";
  public static final String MAX_CONTENT_SEQUENCE_QUERY = "select max(sequence_id) from content where collection_id = ?::uuid";
  public static final String TABLE_CONTENT = "content";
  public static final String CONTENT_FOR_ADD_FILTER =
    "id = ?::uuid and is_deleted = false and course_id is null and collection_id is null and creator_id = ?::uuid";

  public static final String DELETE_CONTENTS_QUERY =
    "update content set is_deleted = true, modifier_id = ?::uuid, updated_at = now()  where collection_id = ?::uuid and is_deleted = false";
  // FIXME: 2/2/16 Fix up the fields name for question/resources combined
  public static final String FETCH_CONTENT_SUMMARY_QUERY =
    "select id, title, creator_id, original_creator_id, publish_date, short_title, content_subformat, answer, metadata, taxonomy, " +
      "depth_of_knowledge, hint_explanation_detail, thumbnail, sequence_id, visible_on_profile from content where collection_id = ?::uuid and " +
      " is_deleted = false order by sequence_id asc";
  public static final List<String> FETCH_CONTENT_SUMMARY_FIELDS = Arrays
    .asList("id", "title", "creator_id", "original_creator_id", "publish_date", "short_title", "content_subformat", "answer", "metadata", "taxonomy",
      "depth_of_knowledge", "hint_explanation_detail", "thumbnail", "sequence_id", "visible_on_profile");
  public static final String CONTENT = "content";
}
