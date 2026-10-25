package app.chalo.home.ui.home;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeTabCallbacks;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomeTabCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f3578a;

    public HomeTabCallbacks(Function1 onBottomSheetVisibilityChanged) {
        Intrinsics.i(onBottomSheetVisibilityChanged, "onBottomSheetVisibilityChanged");
        this.f3578a = onBottomSheetVisibilityChanged;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeTabCallbacks) && Intrinsics.d(this.f3578a, ((HomeTabCallbacks) obj).f3578a);
    }

    public final int hashCode() {
        return this.f3578a.hashCode();
    }

    public final String toString() {
        return "HomeTabCallbacks(onBottomSheetVisibilityChanged=" + this.f3578a + ")";
    }
}
