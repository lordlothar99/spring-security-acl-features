package com.github.lothar.security.acl.grant;

import com.github.lothar.security.acl.AclFeatureType;

public final class GrantEvaluatorFeature implements AclFeatureType<GrantEvaluator> {

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}