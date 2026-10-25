package app.chalo.behaviour.policy;

import defpackage.b3;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/behaviour/policy/ResolvedSdkIntegrationPolicy;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResolvedSdkIntegrationPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1073a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ResolvedSdkIntegrationPolicy$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ResolvedSdkIntegrationPolicy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f1073a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedSdkIntegrationPolicy)) {
            return false;
        }
        ResolvedSdkIntegrationPolicy resolvedSdkIntegrationPolicy = (ResolvedSdkIntegrationPolicy) obj;
        return this.f1073a == resolvedSdkIntegrationPolicy.f1073a && this.b == resolvedSdkIntegrationPolicy.b && this.c == resolvedSdkIntegrationPolicy.c && this.d == resolvedSdkIntegrationPolicy.d && this.e == resolvedSdkIntegrationPolicy.e;
    }

    public final int hashCode() {
        return ((((((((this.f1073a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("ResolvedSdkIntegrationPolicy(enableAdjust=", ", enablePlotline=", ", enableThoughtNudge=", this.f1073a, this.b);
        z40.r(sbR, this.c, ", enableFreshchat=", this.d, ", enableAds=");
        return b3.g(")", sbR, this.e);
    }
}
