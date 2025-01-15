/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package management.api;

// [START securitycenter_list_descendant_event_threat_detection_custom_module]
import com.google.cloud.securitycentermanagement.v1.ListDescendantEventThreatDetectionCustomModulesRequest;
import com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient;
import com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient.ListDescendantEventThreatDetectionCustomModulesPagedResponse;
import java.io.IOException;

public class ListDescendantEventThreatDetectionCustomModules {

  public static void main(String[] args) throws IOException {
    // TODO: Developer should replace project_id with a real project ID before running this code
    String projectId = "project_id";

    listDescendantEventThreatDetectionCustomModules(projectId);
  }

  public static ListDescendantEventThreatDetectionCustomModulesPagedResponse
      listDescendantEventThreatDetectionCustomModules(String projectId) throws IOException {

    // Initialize client that will be used to send requests. This client only needs
    // to be created
    // once, and can be reused for multiple requests.
    try (SecurityCenterManagementClient client = SecurityCenterManagementClient.create()) {

      String parent = String.format("projects/%s/locations/global", projectId);

      ListDescendantEventThreatDetectionCustomModulesRequest request =
          ListDescendantEventThreatDetectionCustomModulesRequest.newBuilder()
              .setParent(parent)
              .build();

      ListDescendantEventThreatDetectionCustomModulesPagedResponse response =
          client.listDescendantEventThreatDetectionCustomModules(request);

      return response;
    }
  }
}
// [END securitycenter_list_descendant_event_threat_detection_custom_module]