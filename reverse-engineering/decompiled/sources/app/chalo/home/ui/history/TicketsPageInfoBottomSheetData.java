package app.chalo.home.ui.history;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/TicketsPageInfoBottomSheetData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketsPageInfoBottomSheetData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketsPageErrorImage f3445a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public TicketsPageInfoBottomSheetData(TicketsPageErrorImage imageType, String title, String msg, String positiveBtnText, String str) {
        Intrinsics.i(imageType, "imageType");
        Intrinsics.i(title, "title");
        Intrinsics.i(msg, "msg");
        Intrinsics.i(positiveBtnText, "positiveBtnText");
        this.f3445a = imageType;
        this.b = title;
        this.c = msg;
        this.d = positiveBtnText;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketsPageInfoBottomSheetData)) {
            return false;
        }
        TicketsPageInfoBottomSheetData ticketsPageInfoBottomSheetData = (TicketsPageInfoBottomSheetData) obj;
        return this.f3445a == ticketsPageInfoBottomSheetData.f3445a && Intrinsics.d(this.b, ticketsPageInfoBottomSheetData.b) && Intrinsics.d(this.c, ticketsPageInfoBottomSheetData.c) && Intrinsics.d(this.d, ticketsPageInfoBottomSheetData.d) && Intrinsics.d(this.e, ticketsPageInfoBottomSheetData.e);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f3445a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketsPageInfoBottomSheetData(imageType=");
        sb.append(this.f3445a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", msg=");
        cb0.t(sb, this.c, ", positiveBtnText=", this.d, ", negativeBtnText=");
        return vo1.p(sb, this.e, ")");
    }
}
