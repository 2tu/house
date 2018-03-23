package com.tu.poi.transform;

/**
 * This class will convert an object to an array of its parts.
 *
 * @author Tu enum@foxmail.com.
 */
public interface FieldExtractor<T> {

  /**
   * @return an array containing item's parts
   */
  Object[] extract(T item);

}