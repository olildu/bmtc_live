package app.chalo.ncmc.ui.cardrechargeamount.compose;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.b3;
import defpackage.cb0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/compose/ChaloCardRechargeScreenErrorContent;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCardRechargeScreenErrorContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconType f6310a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public /* synthetic */ ChaloCardRechargeScreenErrorContent(int i, IconType iconType, String str, String str2, String str3) {
        this((i & 1) != 0 ? null : iconType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardRechargeScreenErrorContent)) {
            return false;
        }
        ChaloCardRechargeScreenErrorContent chaloCardRechargeScreenErrorContent = (ChaloCardRechargeScreenErrorContent) obj;
        return this.f6310a == chaloCardRechargeScreenErrorContent.f6310a && Intrinsics.d(this.b, chaloCardRechargeScreenErrorContent.b) && Intrinsics.d(this.c, chaloCardRechargeScreenErrorContent.c) && Intrinsics.d(this.d, chaloCardRechargeScreenErrorContent.d) && this.e == chaloCardRechargeScreenErrorContent.e;
    }

    public final int hashCode() {
        IconType iconType = this.f6310a;
        return nf1.e(nf1.e(nf1.e((iconType == null ? 0 : iconType.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloCardRechargeScreenErrorContent(iconType=");
        sb.append(this.f6310a);
        sb.append(", errorTitle=");
        sb.append(this.b);
        sb.append(", errorMsg=");
        cb0.t(sb, this.c, ", actionBtnCopy=", this.d, ", shouldShowActionBtn=");
        return b3.g(")", sb, this.e);
    }

    public ChaloCardRechargeScreenErrorContent(IconType iconType, String errorTitle, String errorMsg, String actionBtnCopy, boolean z) {
        Intrinsics.i(errorTitle, "errorTitle");
        Intrinsics.i(errorMsg, "errorMsg");
        Intrinsics.i(actionBtnCopy, "actionBtnCopy");
        this.f6310a = iconType;
        this.b = errorTitle;
        this.c = errorMsg;
        this.d = actionBtnCopy;
        this.e = z;
    }
}
