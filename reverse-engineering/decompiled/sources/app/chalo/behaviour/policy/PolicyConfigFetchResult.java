package app.chalo.behaviour.policy;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/behaviour/policy/PolicyConfigFetchResult;", "TOverride", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PolicyConfigFetchResult<TOverride> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1011a;
    public final boolean b;
    public final PolicyRemoteConfig c;

    public PolicyConfigFetchResult(String selectedKey, boolean z, PolicyRemoteConfig policyRemoteConfig) {
        Intrinsics.i(selectedKey, "selectedKey");
        this.f1011a = selectedKey;
        this.b = z;
        this.c = policyRemoteConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyConfigFetchResult)) {
            return false;
        }
        PolicyConfigFetchResult policyConfigFetchResult = (PolicyConfigFetchResult) obj;
        return Intrinsics.d(this.f1011a, policyConfigFetchResult.f1011a) && this.b == policyConfigFetchResult.b && Intrinsics.d(this.c, policyConfigFetchResult.c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f1011a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        PolicyRemoteConfig policyRemoteConfig = this.c;
        return iHashCode + (policyRemoteConfig == null ? 0 : policyRemoteConfig.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("PolicyConfigFetchResult(selectedKey=", this.f1011a, ", isPresent=", ", remoteConfig=", this.b);
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}
