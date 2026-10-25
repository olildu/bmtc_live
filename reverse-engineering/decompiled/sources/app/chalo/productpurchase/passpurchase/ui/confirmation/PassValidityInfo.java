package app.chalo.productpurchase.passpurchase.ui.confirmation;

import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassValidityInfo;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassValidityInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8396a;
    public final Long b;
    public final Long c;

    public PassValidityInfo(Long l, Long l2, Long l3) {
        this.f8396a = l;
        this.b = l2;
        this.c = l3;
    }

    public static PassValidityInfo a(PassValidityInfo passValidityInfo, Long l, Long l2) {
        Long l3 = passValidityInfo.b;
        passValidityInfo.getClass();
        return new PassValidityInfo(l, l3, l2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getF8396a() {
        return this.f8396a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassValidityInfo)) {
            return false;
        }
        PassValidityInfo passValidityInfo = (PassValidityInfo) obj;
        return Intrinsics.d(this.f8396a, passValidityInfo.f8396a) && Intrinsics.d(this.b, passValidityInfo.b) && Intrinsics.d(this.c, passValidityInfo.c);
    }

    public final int hashCode() {
        Long l = this.f8396a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassValidityInfo(passExpiryTime=");
        sb.append(this.f8396a);
        sb.append(", passExpiryDuration=");
        sb.append(this.b);
        sb.append(", passStartTime=");
        return pk0.l(sb, this.c, ")");
    }
}
