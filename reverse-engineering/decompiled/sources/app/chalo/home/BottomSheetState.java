package app.chalo.home;

import app.chalo.home.ui.base.CommonBottomSheetType;
import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/BottomSheetState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BottomSheetState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommonBottomSheetData f2843a;
    public final CommonBottomSheetType b;
    public final boolean c;

    public BottomSheetState(CommonBottomSheetData bottomSheetData, CommonBottomSheetType bottomSheetType, boolean z) {
        Intrinsics.i(bottomSheetData, "bottomSheetData");
        Intrinsics.i(bottomSheetType, "bottomSheetType");
        this.f2843a = bottomSheetData;
        this.b = bottomSheetType;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetState)) {
            return false;
        }
        BottomSheetState bottomSheetState = (BottomSheetState) obj;
        return Intrinsics.d(this.f2843a, bottomSheetState.f2843a) && Intrinsics.d(this.b, bottomSheetState.b) && this.c == bottomSheetState.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.f2843a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetState(bottomSheetData=");
        sb.append(this.f2843a);
        sb.append(", bottomSheetType=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return b3.g(")", sb, this.c);
    }

    public /* synthetic */ BottomSheetState(int i) {
        this(new CommonBottomSheetData.GenericBottomSheetData(null, null, null, null, null, null, 63), CommonBottomSheetType.None.b, false);
    }
}
