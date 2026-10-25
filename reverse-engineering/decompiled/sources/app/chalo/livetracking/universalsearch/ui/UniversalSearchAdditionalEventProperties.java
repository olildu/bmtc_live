package app.chalo.livetracking.universalsearch.ui;

import defpackage.cb0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalSearchAdditionalEventProperties;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalSearchAdditionalEventProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5085a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public /* synthetic */ UniversalSearchAdditionalEventProperties(int i, long j, String str, String str2, String str3) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (Long) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalSearchAdditionalEventProperties)) {
            return false;
        }
        UniversalSearchAdditionalEventProperties universalSearchAdditionalEventProperties = (UniversalSearchAdditionalEventProperties) obj;
        return this.f5085a == universalSearchAdditionalEventProperties.f5085a && Intrinsics.d(this.b, universalSearchAdditionalEventProperties.b) && Intrinsics.d(this.c, universalSearchAdditionalEventProperties.c) && Intrinsics.d(this.d, universalSearchAdditionalEventProperties.d) && Intrinsics.d(this.e, universalSearchAdditionalEventProperties.e);
    }

    public final int hashCode() {
        long j = this.f5085a;
        int iE = nf1.e(nf1.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalSearchAdditionalEventProperties(sessionStartTimestamp=");
        sb.append(this.f5085a);
        sb.append(", sourceString=");
        sb.append(this.b);
        cb0.t(sb, ", screenSource=", this.c, ", searchType=", this.d);
        sb.append(", resultsShownTimeStamp=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public UniversalSearchAdditionalEventProperties(long j, String sourceString, String screenSource, String str, Long l) {
        Intrinsics.i(sourceString, "sourceString");
        Intrinsics.i(screenSource, "screenSource");
        this.f5085a = j;
        this.b = sourceString;
        this.c = screenSource;
        this.d = str;
        this.e = l;
    }
}
