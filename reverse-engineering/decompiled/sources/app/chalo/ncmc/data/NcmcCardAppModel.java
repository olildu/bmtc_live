package app.chalo.ncmc.data;

import defpackage.cb0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/data/NcmcCardAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NcmcCardAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6032a;
    public final Long b;
    public final Long c;
    public final NcmcCardStatus d;
    public final String e;
    public final Long f;
    public final Long g;

    public NcmcCardAppModel(String str, Long l, Long l2, NcmcCardStatus ncmcCardStatus, String str2, Long l3, Long l4) {
        Intrinsics.i(ncmcCardStatus, "ncmcCardStatus");
        this.f6032a = str;
        this.b = l;
        this.c = l2;
        this.d = ncmcCardStatus;
        this.e = str2;
        this.f = l3;
        this.g = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NcmcCardAppModel)) {
            return false;
        }
        NcmcCardAppModel ncmcCardAppModel = (NcmcCardAppModel) obj;
        return Intrinsics.d(this.f6032a, ncmcCardAppModel.f6032a) && Intrinsics.d(this.b, ncmcCardAppModel.b) && Intrinsics.d(this.c, ncmcCardAppModel.c) && this.d == ncmcCardAppModel.d && Intrinsics.d(this.e, ncmcCardAppModel.e) && Intrinsics.d(this.f, ncmcCardAppModel.f) && Intrinsics.d(this.g, ncmcCardAppModel.g);
    }

    public final int hashCode() {
        String str = this.f6032a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.g;
        return iHashCode5 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NcmcCardAppModel(cardNumber=");
        sb.append(this.f6032a);
        sb.append(", onlineBalance=");
        sb.append(this.b);
        sb.append(", offlineBalance=");
        sb.append(this.c);
        sb.append(", ncmcCardStatus=");
        sb.append(this.d);
        sb.append(", kitNo=");
        cb0.r(this.f, this.e, ", remainingOfflineLoadLimit=", ", remainingOnlineLoadLimit=", sb);
        return pk0.l(sb, this.g, ")");
    }
}
