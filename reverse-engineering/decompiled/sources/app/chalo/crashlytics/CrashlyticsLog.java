package app.chalo.crashlytics;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/crashlytics/CrashlyticsLog;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CrashlyticsLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2307a;
    public final String b;

    public CrashlyticsLog(String tag, String message) {
        Intrinsics.i(tag, "tag");
        Intrinsics.i(message, "message");
        this.f2307a = tag;
        this.b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrashlyticsLog)) {
            return false;
        }
        CrashlyticsLog crashlyticsLog = (CrashlyticsLog) obj;
        return Intrinsics.d(this.f2307a, crashlyticsLog.f2307a) && Intrinsics.d(this.b, crashlyticsLog.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2307a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("CrashlyticsLog(tag=", this.f2307a, ", message=", this.b, ")");
    }
}
