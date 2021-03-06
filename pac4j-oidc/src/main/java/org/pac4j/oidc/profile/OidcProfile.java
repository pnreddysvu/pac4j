/*
  Copyright 2012 -2014 pac4j organization

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package org.pac4j.oidc.profile;

import org.pac4j.core.profile.CommonProfile;
import org.pac4j.oidc.client.OidcClient;

import com.nimbusds.oauth2.sdk.token.BearerAccessToken;

/**
 * <p>This class is the user profile for sites using OpenID Connect protocol.</p>
 * <p>It is returned by the {@link OidcClient}.</p>
 * 
 * @author Michael Remond
 * @version 1.7.0
 */
public class OidcProfile extends CommonProfile {

    private static final long serialVersionUID = -52855988661742374L;

    private BearerAccessToken accessToken;

    public OidcProfile() {
    }

    public OidcProfile(BearerAccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public BearerAccessToken getAccessToken() {
        return this.accessToken;
    }

}
