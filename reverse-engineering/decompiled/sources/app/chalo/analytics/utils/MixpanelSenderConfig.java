package app.chalo.analytics.utils;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/utils/MixpanelSenderConfig;", "", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MixpanelSenderConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f882a;
    public final String b;

    public MixpanelSenderConfig(String deviceId, String token) {
        Intrinsics.i(deviceId, "deviceId");
        Intrinsics.i(token, "token");
        this.f882a = deviceId;
        this.b = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixpanelSenderConfig)) {
            return false;
        }
        MixpanelSenderConfig mixpanelSenderConfig = (MixpanelSenderConfig) obj;
        return Intrinsics.d(this.f882a, mixpanelSenderConfig.f882a) && Intrinsics.d(this.b, mixpanelSenderConfig.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f882a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("MixpanelSenderConfig(deviceId=", this.f882a, ", token=", this.b, ")");
    }
}
