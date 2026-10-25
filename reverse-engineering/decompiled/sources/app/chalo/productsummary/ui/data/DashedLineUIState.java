package app.chalo.productsummary.ui.data;

import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/DashedLineUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DashedLineUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f8749a = ChaloColorToken.ShadyGray.f9851a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DashedLineUIState) {
            return Float.compare(1.0f, 1.0f) == 0 && this.f8749a.equals(((DashedLineUIState) obj).f8749a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8749a.hashCode() + (Float.floatToIntBits(1.0f) * 31);
    }

    public final String toString() {
        return "DashedLineUIState(width=1.0, color=" + this.f8749a + ")";
    }
}
