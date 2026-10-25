package app.chalo.deeplink;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/StopTripDetailsDeepLinkData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopTripDetailsDeepLinkData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2477a;
    public final String b;
    public final ChaloTransitMode c;
    public final String d;
    public final String e;
    public final String f;

    public StopTripDetailsDeepLinkData(String str, String str2, ChaloTransitMode chaloTransitMode, String str3, String str4, String str5) {
        this.f2477a = str;
        this.b = str2;
        this.c = chaloTransitMode;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripDetailsDeepLinkData)) {
            return false;
        }
        StopTripDetailsDeepLinkData stopTripDetailsDeepLinkData = (StopTripDetailsDeepLinkData) obj;
        return Intrinsics.d(this.f2477a, stopTripDetailsDeepLinkData.f2477a) && Intrinsics.d(this.b, stopTripDetailsDeepLinkData.b) && this.c == stopTripDetailsDeepLinkData.c && Intrinsics.d(this.d, stopTripDetailsDeepLinkData.d) && Intrinsics.d(this.e, stopTripDetailsDeepLinkData.e) && Intrinsics.d(this.f, stopTripDetailsDeepLinkData.f);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(n21.c(this.c, nf1.e(this.f2477a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("StopTripDetailsDeepLinkData(stopId=", this.f2477a, ", stopName=", this.b, ", mode=");
        sbE.append(this.c);
        sbE.append(", cityName=");
        sbE.append(this.d);
        sbE.append(", source=");
        return r30.i(sbE, this.e, ", tag=", this.f, ")");
    }
}
