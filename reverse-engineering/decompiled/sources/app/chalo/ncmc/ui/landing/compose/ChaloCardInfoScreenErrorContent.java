package app.chalo.ncmc.ui.landing.compose;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/compose/ChaloCardInfoScreenErrorContent;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCardInfoScreenErrorContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6379a;
    public final String b;
    public final String c;

    public ChaloCardInfoScreenErrorContent(String errorTitle, String errorMsg, String str) {
        Intrinsics.i(errorTitle, "errorTitle");
        Intrinsics.i(errorMsg, "errorMsg");
        this.f6379a = errorTitle;
        this.b = errorMsg;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardInfoScreenErrorContent)) {
            return false;
        }
        ChaloCardInfoScreenErrorContent chaloCardInfoScreenErrorContent = (ChaloCardInfoScreenErrorContent) obj;
        return Intrinsics.d(this.f6379a, chaloCardInfoScreenErrorContent.f6379a) && Intrinsics.d(this.b, chaloCardInfoScreenErrorContent.b) && this.c.equals(chaloCardInfoScreenErrorContent.c);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + nf1.e(this.f6379a.hashCode() * 31, 31, this.b)) * 31) + 1237;
    }

    public final String toString() {
        return vo1.p(dd.e("ChaloCardInfoScreenErrorContent(errorTitle=", this.f6379a, ", errorMsg=", this.b, ", actionBtnCopy="), this.c, ", shouldShowActionBtn=false)");
    }
}
