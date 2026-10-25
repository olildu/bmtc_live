package app.chalo.features.adjust;

import defpackage.cb0;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/adjust/CommonAdjustAttribution;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonAdjustAttribution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2625a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Double i;
    public final String j;
    public final String k;

    public CommonAdjustAttribution(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Double d, String str9, String str10) {
        this.f2625a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = d;
        this.j = str9;
        this.k = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAdjustAttribution)) {
            return false;
        }
        CommonAdjustAttribution commonAdjustAttribution = (CommonAdjustAttribution) obj;
        return Intrinsics.d(this.f2625a, commonAdjustAttribution.f2625a) && Intrinsics.d(this.b, commonAdjustAttribution.b) && Intrinsics.d(this.c, commonAdjustAttribution.c) && Intrinsics.d(this.d, commonAdjustAttribution.d) && Intrinsics.d(this.e, commonAdjustAttribution.e) && Intrinsics.d(this.f, commonAdjustAttribution.f) && Intrinsics.d(this.g, commonAdjustAttribution.g) && Intrinsics.d(this.h, commonAdjustAttribution.h) && Intrinsics.d(this.i, commonAdjustAttribution.i) && Intrinsics.d(this.j, commonAdjustAttribution.j) && Intrinsics.d(this.k, commonAdjustAttribution.k);
    }

    public final int hashCode() {
        String str = this.f2625a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d = this.i;
        int iHashCode9 = (iHashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        return iHashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CommonAdjustAttribution(trackerToken=", this.f2625a, ", trackerName=", this.b, ", network=");
        cb0.t(sbE, this.c, ", campaign=", this.d, ", adgroup=");
        cb0.t(sbE, this.e, ", creative=", this.f, ", clickLabel=");
        cb0.t(sbE, this.g, ", costType=", this.h, ", costAmount=");
        sbE.append(this.i);
        sbE.append(", costCurrency=");
        sbE.append(this.j);
        sbE.append(", fbInstallReferrer=");
        return vo1.p(sbE, this.k, ")");
    }
}
