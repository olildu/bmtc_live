package app.chalo.behaviour.policy;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/SdkIntegrationPolicyManager;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SdkIntegrationPolicyManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResolvedSdkIntegrationPolicy f1078a;

    public SdkIntegrationPolicyManager(SdkIntegrationPolicyOverride sdkIntegrationPolicyOverride) {
        Boolean bool = sdkIntegrationPolicyOverride.f1079a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Boolean bool2 = sdkIntegrationPolicyOverride.b;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        Boolean bool3 = sdkIntegrationPolicyOverride.c;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
        Boolean bool4 = sdkIntegrationPolicyOverride.d;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : true;
        Boolean bool5 = sdkIntegrationPolicyOverride.e;
        this.f1078a = new ResolvedSdkIntegrationPolicy(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, bool5 != null ? bool5.booleanValue() : false);
    }
}
