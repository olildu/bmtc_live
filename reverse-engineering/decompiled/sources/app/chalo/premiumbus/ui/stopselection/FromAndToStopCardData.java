package app.chalo.premiumbus.ui.stopselection;

import app.chalo.premiumbus.data.models.app.PBModeToReachStopType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.py;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/FromAndToStopCardData;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FromAndToStopCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7955a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final PBModeToReachStopType f;
    public final Long g;
    public final String h;
    public final PBModeToReachStopType i;
    public final String j;
    public final String k;

    public FromAndToStopCardData(String str, String fromStopName, String toStopName, Long l, String str2, PBModeToReachStopType modeTypeToReachFromStop, Long l2, String str3, PBModeToReachStopType modeTypeToReachToStop, int i) {
        str = (i & 1) != 0 ? null : str;
        modeTypeToReachFromStop = (i & 32) != 0 ? PBModeToReachStopType.NOT_APPLICABLE : modeTypeToReachFromStop;
        modeTypeToReachToStop = (i & 256) != 0 ? PBModeToReachStopType.NOT_APPLICABLE : modeTypeToReachToStop;
        Intrinsics.i(fromStopName, "fromStopName");
        Intrinsics.i(toStopName, "toStopName");
        Intrinsics.i(modeTypeToReachFromStop, "modeTypeToReachFromStop");
        Intrinsics.i(modeTypeToReachToStop, "modeTypeToReachToStop");
        this.f7955a = str;
        this.b = fromStopName;
        this.c = toStopName;
        this.d = l;
        this.e = str2;
        this.f = modeTypeToReachFromStop;
        this.g = l2;
        this.h = str3;
        this.i = modeTypeToReachToStop;
        this.j = null;
        this.k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FromAndToStopCardData)) {
            return false;
        }
        FromAndToStopCardData fromAndToStopCardData = (FromAndToStopCardData) obj;
        return Intrinsics.d(this.f7955a, fromAndToStopCardData.f7955a) && Intrinsics.d(this.b, fromAndToStopCardData.b) && Intrinsics.d(this.c, fromAndToStopCardData.c) && Intrinsics.d(this.d, fromAndToStopCardData.d) && Intrinsics.d(this.e, fromAndToStopCardData.e) && this.f == fromAndToStopCardData.f && Intrinsics.d(this.g, fromAndToStopCardData.g) && Intrinsics.d(this.h, fromAndToStopCardData.h) && this.i == fromAndToStopCardData.i && Intrinsics.d(this.j, fromAndToStopCardData.j) && Intrinsics.d(this.k, fromAndToStopCardData.k);
    }

    public final int hashCode() {
        String str = this.f7955a;
        int iE = nf1.e(nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int iHashCode = (iE + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Long l2 = this.g;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode4 = (this.i.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 961;
        String str4 = this.j;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("FromAndToStopCardData(stopPairTag=", this.f7955a, ", fromStopName=", this.b, ", toStopName=");
        cb0.r(this.d, this.c, ", timeToReachFromStopInSec=", ", timeToReachFromStopFormatted=", sbE);
        sbE.append(this.e);
        sbE.append(", modeTypeToReachFromStop=");
        sbE.append(this.f);
        sbE.append(", timeToReachToStopInSec=");
        py.t(this.g, ", timeToReachToStopFormatted=", this.h, ", modeTypeToReachToStop=", sbE);
        sbE.append(this.i);
        sbE.append(", disclaimerMessage=null, timeToReachToStopInSecString=");
        sbE.append(this.j);
        sbE.append(", timeToReachFromStopInSecString=");
        return vo1.p(sbE, this.k, ")");
    }
}
