package app.chalo.home.ui.savedplacesandrides;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesViewSpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SavedPlacesAndRidesViewSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3692a;

    public SavedPlacesAndRidesViewSpecs() {
        float f = ChaloThemeHelper.a().h;
        this.f3692a = new ChaloPadding(f, f, f, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavedPlacesAndRidesViewSpecs) && Intrinsics.d(this.f3692a, ((SavedPlacesAndRidesViewSpecs) obj).f3692a);
    }

    public final int hashCode() {
        return this.f3692a.hashCode();
    }

    public final String toString() {
        return "SavedPlacesAndRidesViewSpecs(contentPadding=" + this.f3692a + ")";
    }
}
