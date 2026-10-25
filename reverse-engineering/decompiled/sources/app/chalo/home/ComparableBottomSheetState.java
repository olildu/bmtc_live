package app.chalo.home;

import app.chalo.home.ui.base.CommonBottomSheetType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ComparableBottomSheetState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ComparableBottomSheetState implements Comparable<ComparableBottomSheetState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2852a;
    public final CommonBottomSheetType b;

    public ComparableBottomSheetState(int i, CommonBottomSheetType state) {
        Intrinsics.i(state, "state");
        this.f2852a = i;
        this.b = state;
    }

    @Override // java.lang.Comparable
    public final int compareTo(ComparableBottomSheetState comparableBottomSheetState) {
        ComparableBottomSheetState other = comparableBottomSheetState;
        Intrinsics.i(other, "other");
        return this.f2852a - other.f2852a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableBottomSheetState)) {
            return false;
        }
        ComparableBottomSheetState comparableBottomSheetState = (ComparableBottomSheetState) obj;
        return this.f2852a == comparableBottomSheetState.f2852a && Intrinsics.d(this.b, comparableBottomSheetState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2852a * 31);
    }

    public final String toString() {
        return "ComparableBottomSheetState(rank=" + this.f2852a + ", state=" + this.b + ")";
    }
}
