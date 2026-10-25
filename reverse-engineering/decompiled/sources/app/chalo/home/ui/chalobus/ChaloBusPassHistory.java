package app.chalo.home.ui.chalobus;

import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusPassHistory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusPassHistory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3249a;
    public final String b;
    public final int c;
    public final String d;
    public final SuperPassStatus e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final SuperPassSubType j;
    public final boolean k;
    public final String l;
    public final IconType m;
    public final boolean n;
    public final LottieType o;

    public ChaloBusPassHistory(String configId, String passId, int i, String passName, SuperPassStatus passStatus, long j, String str, String str2, String str3, SuperPassSubType passSubType, boolean z, String str4, IconType iconType, boolean z2, LottieType lottieType) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(passId, "passId");
        Intrinsics.i(passName, "passName");
        Intrinsics.i(passStatus, "passStatus");
        Intrinsics.i(passSubType, "passSubType");
        this.f3249a = configId;
        this.b = passId;
        this.c = i;
        this.d = passName;
        this.e = passStatus;
        this.f = j;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = passSubType;
        this.k = z;
        this.l = str4;
        this.m = iconType;
        this.n = z2;
        this.o = lottieType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusPassHistory)) {
            return false;
        }
        ChaloBusPassHistory chaloBusPassHistory = (ChaloBusPassHistory) obj;
        return Intrinsics.d(this.f3249a, chaloBusPassHistory.f3249a) && Intrinsics.d(this.b, chaloBusPassHistory.b) && this.c == chaloBusPassHistory.c && Intrinsics.d(this.d, chaloBusPassHistory.d) && this.e == chaloBusPassHistory.e && this.f == chaloBusPassHistory.f && Intrinsics.d(this.g, chaloBusPassHistory.g) && Intrinsics.d(this.h, chaloBusPassHistory.h) && Intrinsics.d(this.i, chaloBusPassHistory.i) && this.j == chaloBusPassHistory.j && this.k == chaloBusPassHistory.k && Intrinsics.d(this.l, chaloBusPassHistory.l) && this.m == chaloBusPassHistory.m && this.n == chaloBusPassHistory.n && this.o == chaloBusPassHistory.o;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + nf1.e((nf1.e(this.f3249a.hashCode() * 31, 31, this.b) + this.c) * 31, 31, this.d)) * 31;
        long j = this.f;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.g;
        int iHashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode4 = (((this.j.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31) + (this.k ? 1231 : 1237)) * 31;
        String str4 = this.l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        IconType iconType = this.m;
        int iHashCode6 = (((iHashCode5 + (iconType == null ? 0 : iconType.hashCode())) * 31) + (this.n ? 1231 : 1237)) * 31;
        LottieType lottieType = this.o;
        return iHashCode6 + (lottieType != null ? lottieType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ChaloBusPassHistory(configId=", this.f3249a, ", passId=", this.b, ", fareMappingId=");
        pk0.t(this.c, ", passName=", this.d, ", passStatus=", sbE);
        sbE.append(this.e);
        sbE.append(", expiryTime=");
        sbE.append(this.f);
        cb0.t(sbE, ", passValidityInString=", this.g, ", remainingTrips=", this.h);
        sbE.append(", totalTrips=");
        sbE.append(this.i);
        sbE.append(", passSubType=");
        sbE.append(this.j);
        sbE.append(", isExpired=");
        sbE.append(this.k);
        sbE.append(", infoMessage=");
        sbE.append(this.l);
        sbE.append(", messageIcon=");
        sbE.append(this.m);
        sbE.append(", markedAsUnlimited=");
        sbE.append(this.n);
        sbE.append(", messageGif=");
        sbE.append(this.o);
        sbE.append(")");
        return sbE.toString();
    }
}
