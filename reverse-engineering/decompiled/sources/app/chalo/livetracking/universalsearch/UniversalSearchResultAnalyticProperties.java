package app.chalo.livetracking.universalsearch;

import defpackage.dd;
import defpackage.i71;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/UniversalSearchResultAnalyticProperties;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalSearchResultAnalyticProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4965a;
    public final long b;
    public final String c;
    public final String d;

    public UniversalSearchResultAnalyticProperties(long j, long j2, String screenSource, String str) {
        Intrinsics.i(screenSource, "screenSource");
        this.f4965a = j;
        this.b = j2;
        this.c = screenSource;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalSearchResultAnalyticProperties)) {
            return false;
        }
        UniversalSearchResultAnalyticProperties universalSearchResultAnalyticProperties = (UniversalSearchResultAnalyticProperties) obj;
        return this.f4965a == universalSearchResultAnalyticProperties.f4965a && this.b == universalSearchResultAnalyticProperties.b && Intrinsics.d(this.c, universalSearchResultAnalyticProperties.c) && Intrinsics.d(this.d, universalSearchResultAnalyticProperties.d);
    }

    public final int hashCode() {
        long j = this.f4965a;
        long j2 = this.b;
        int iE = nf1.e(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.c);
        String str = this.d;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbG = i71.g(this.f4965a, "UniversalSearchResultAnalyticProperties(searchQueryStartTime=", ", sessionStartTimestamp=");
        dd.k(this.b, ", screenSource=", this.c, sbG);
        return z40.h(sbG, ", searchType=", this.d, ")");
    }
}
