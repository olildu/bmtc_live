package app.chalo.home.ui.history.uistate;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/SeeMoreIconUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeeMoreIconUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f3482a;
    public final SeeMoreIconUISpec b;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public SeeMoreIconUiState(ImageUIState imageUIState) {
        SeeMoreIconUISpec seeMoreIconUISpec = new SeeMoreIconUISpec();
        this.f3482a = imageUIState;
        this.b = seeMoreIconUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeeMoreIconUiState)) {
            return false;
        }
        SeeMoreIconUiState seeMoreIconUiState = (SeeMoreIconUiState) obj;
        return Intrinsics.d(this.f3482a, seeMoreIconUiState.f3482a) && Intrinsics.d(this.b, seeMoreIconUiState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3482a.hashCode() * 31);
    }

    public final String toString() {
        return "SeeMoreIconUiState(icon=" + this.f3482a + ", spec=" + this.b + ")";
    }
}
