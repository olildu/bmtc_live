package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/UnknownProductValidDurationInfoResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnknownProductValidDurationInfoResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8653a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public UnknownProductValidDurationInfoResponseAppModel(long j, String displayName, boolean z, boolean z2, String str) {
        Intrinsics.i(displayName, "displayName");
        this.f8653a = j;
        this.b = displayName;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownProductValidDurationInfoResponseAppModel)) {
            return false;
        }
        UnknownProductValidDurationInfoResponseAppModel unknownProductValidDurationInfoResponseAppModel = (UnknownProductValidDurationInfoResponseAppModel) obj;
        return this.f8653a == unknownProductValidDurationInfoResponseAppModel.f8653a && Intrinsics.d(this.b, unknownProductValidDurationInfoResponseAppModel.b) && this.c == unknownProductValidDurationInfoResponseAppModel.c && this.d == unknownProductValidDurationInfoResponseAppModel.d && Intrinsics.d(this.e, unknownProductValidDurationInfoResponseAppModel.e);
    }

    public final int hashCode() {
        long j = this.f8653a;
        int iE = (((nf1.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31;
        String str = this.e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnknownProductValidDurationInfoResponseAppModel(duration=");
        sb.append(this.f8653a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", isActive=");
        sb.append(this.c);
        sb.append(", isVisible=");
        sb.append(this.d);
        return z40.h(sb, ", inactiveReason=", this.e, ")");
    }
}
