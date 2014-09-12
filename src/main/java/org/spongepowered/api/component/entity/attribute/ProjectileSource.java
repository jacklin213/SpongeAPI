package org.spongepowered.api.component.entity.attribute;

import org.spongepowered.api.component.entity.EntityComponent;

/**
 * Gives the attribute "projectile source" to an {@link org.spongepowered.api.entity.Entity Entity}.
 */
public interface ProjectileSource extends EntityComponent {
	Projectile getProjectile();
    ProjectileSource getProjectileSource();
    void setProjectile(Projectile projectile);
    void setProjectileSource(ProjectileSource projectileSource);
}
