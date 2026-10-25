package app.chalo.premiumbus.ui.slotselection;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NoRideAvailableForSelectedTimeUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoRideAvailableForSelectedTimeUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NoRideAvailableForSelectedTimeUISpec f7814a = new NoRideAvailableForSelectedTimeUISpec();
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public NoRideAvailableForSelectedTimeUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        this.b = chaloTextUIState;
        this.c = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoRideAvailableForSelectedTimeUIState)) {
            return false;
        }
        NoRideAvailableForSelectedTimeUIState noRideAvailableForSelectedTimeUIState = (NoRideAvailableForSelectedTimeUIState) obj;
        return Intrinsics.d(this.f7814a, noRideAvailableForSelectedTimeUIState.f7814a) && Intrinsics.d(this.b, noRideAvailableForSelectedTimeUIState.b) && Intrinsics.d(this.c, noRideAvailableForSelectedTimeUIState.c);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f7814a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        return iF + (imageUIState == null ? 0 : imageUIState.hashCode());
    }

    public final String toString() {
        return "NoRideAvailableForSelectedTimeUIState(spec=" + this.f7814a + ", bannerText=" + this.b + ", bannerIcon=" + this.c + ")";
    }
}
