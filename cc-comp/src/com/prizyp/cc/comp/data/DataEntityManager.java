package com.prizyp.cc.comp.data;

public interface DataEntityManager<T extends DataEntity> {
	

	  /**
	   * Retrieves all the entities.
	   *
	   * @return an {@code Iterable} collection of all entities.
	   */
	  Iterable<T> getEntities();

	  /**
	   * Deletes an entity.
	   *
	   * @param entity the entity to be deleted.
	   *
	   * @return the deleted entity; return null if the entity does not exist.
	   */
	  T deleteEntity(T entity);

	  /**
	   * Updates or insert an entity.
	   *
	   * @param dataEntity the entity object.
	   *
	   * @return the entity object after upserted.
	   */
	  T upsertEntity(T dataEntity);	

}
