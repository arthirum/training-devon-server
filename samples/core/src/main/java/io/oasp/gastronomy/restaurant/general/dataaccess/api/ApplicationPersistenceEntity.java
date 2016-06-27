package io.oasp.gastronomy.restaurant.general.dataaccess.api;

import javax.persistence.MappedSuperclass;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;

/**
 * Abstract Entity for all Entities with an id and a version field.
 *
 * @author hohwille
 * @author rjoeris
 */
@MappedSuperclass
public abstract class ApplicationPersistenceEntity extends AbstractPersistenceApplicationEntity
    implements ApplicationEntity {

  private static final long serialVersionUID = 1L;

  /**
   * The constructor.
   */
  public ApplicationPersistenceEntity() {

    super();
  }

}
