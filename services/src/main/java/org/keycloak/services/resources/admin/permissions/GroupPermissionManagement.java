/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.keycloak.services.resources.admin.permissions;

import org.keycloak.authorization.model.Policy;
import org.keycloak.authorization.model.Resource;
import org.keycloak.models.GroupModel;
import org.keycloak.models.RoleModel;

import java.util.Map;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface GroupPermissionManagement {
    boolean isPermissionsEnabled(GroupModel group);
    void setPermissionsEnabled(GroupModel group, boolean enable);

    Policy viewMembersPermission(GroupModel group);
    Policy manageMembersPermission(GroupModel group);
    Policy viewPermissionGroup(GroupModel group);
    Policy managePermissionGroup(GroupModel group);

    Resource resource(GroupModel group);

    Map<String, String> getPermissions(GroupModel group);
}
