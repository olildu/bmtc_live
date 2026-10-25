package app.chalo.ncmc.ui.landing;

import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardActivePassDetailsUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCardActivePassDetailsUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6342a;
    public final String b;
    public final String c;
    public final String d;

    public ChaloCardActivePassDetailsUiModel(String str, String str2, String str3, String str4) {
        this.f6342a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardActivePassDetailsUiModel)) {
            return false;
        }
        ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel = (ChaloCardActivePassDetailsUiModel) obj;
        return Intrinsics.d(this.f6342a, chaloCardActivePassDetailsUiModel.f6342a) && Intrinsics.d(this.b, chaloCardActivePassDetailsUiModel.b) && Intrinsics.d(this.c, chaloCardActivePassDetailsUiModel.c) && Intrinsics.d(this.d, chaloCardActivePassDetailsUiModel.d);
    }

    public final int hashCode() {
        int iHashCode = this.f6342a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return r30.i(dd.e("ChaloCardActivePassDetailsUiModel(name=", this.f6342a, ", validity=", this.b, ", planType="), this.c, ", tripsLeft=", this.d, ")");
    }
}
