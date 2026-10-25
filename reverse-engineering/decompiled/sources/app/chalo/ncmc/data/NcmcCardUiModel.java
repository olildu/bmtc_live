package app.chalo.ncmc.data;

import defpackage.cb0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/data/NcmcCardUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NcmcCardUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6044a;
    public final Long b;
    public final Long c;
    public final NcmcCardStatus d;
    public final String e;
    public final Long f;
    public final Long g;

    public NcmcCardUiModel(String str, Long l, Long l2, NcmcCardStatus ncmcCardStatus, String str2, Long l3, Long l4) {
        Intrinsics.i(ncmcCardStatus, "ncmcCardStatus");
        this.f6044a = str;
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
        if (!(obj instanceof NcmcCardUiModel)) {
            return false;
        }
        NcmcCardUiModel ncmcCardUiModel = (NcmcCardUiModel) obj;
        return Intrinsics.d(this.f6044a, ncmcCardUiModel.f6044a) && this.b.equals(ncmcCardUiModel.b) && this.c.equals(ncmcCardUiModel.c) && this.d == ncmcCardUiModel.d && Intrinsics.d(this.e, ncmcCardUiModel.e) && this.f.equals(ncmcCardUiModel.f) && this.g.equals(ncmcCardUiModel.g);
    }

    public final int hashCode() {
        String str = this.f6044a;
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 961;
        String str2 = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NcmcCardUiModel(cardNumber=");
        sb.append(this.f6044a);
        sb.append(", onlineBalance=");
        sb.append(this.b);
        sb.append(", offlineBalance=");
        sb.append(this.c);
        sb.append(", ncmcCardStatus=");
        sb.append(this.d);
        sb.append(", userId=null, kitNo=");
        cb0.r(this.f, this.e, ", remainingOfflineLoadLimit=", ", remainingOnlineLoadLimit=", sb);
        return pk0.l(sb, this.g, ")");
    }
}
