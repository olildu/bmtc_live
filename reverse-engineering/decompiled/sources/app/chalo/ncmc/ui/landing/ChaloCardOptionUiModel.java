package app.chalo.ncmc.ui.landing;

import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOptionUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCardOptionUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloCardOperationType f6375a;
    public final String b;
    public final String c;

    public ChaloCardOptionUiModel(ChaloCardOperationType type, String title, String str) {
        Intrinsics.i(type, "type");
        Intrinsics.i(title, "title");
        this.f6375a = type;
        this.b = title;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardOptionUiModel)) {
            return false;
        }
        ChaloCardOptionUiModel chaloCardOptionUiModel = (ChaloCardOptionUiModel) obj;
        return Intrinsics.d(this.f6375a, chaloCardOptionUiModel.f6375a) && Intrinsics.d(this.b, chaloCardOptionUiModel.b) && Intrinsics.d(this.c, chaloCardOptionUiModel.c);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6375a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloCardOptionUiModel(type=");
        sb.append(this.f6375a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        return vo1.p(sb, this.c, ")");
    }
}
