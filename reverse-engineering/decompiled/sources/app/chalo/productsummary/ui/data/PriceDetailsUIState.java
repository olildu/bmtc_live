package app.chalo.productsummary.ui.data;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/PriceDetailsUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PriceDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8755a;
    public final TitleSubtitleUiState b;
    public final List c;
    public final DashedLineUIState d;

    public PriceDetailsUIState(TextUIState.ChaloTextUIState title, TitleSubtitleUiState titleSubtitleUiState, List fareBreakupComponentList, DashedLineUIState dashedLineUIState) {
        Intrinsics.i(title, "title");
        Intrinsics.i(fareBreakupComponentList, "fareBreakupComponentList");
        this.f8755a = title;
        this.b = titleSubtitleUiState;
        this.c = fareBreakupComponentList;
        this.d = dashedLineUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDetailsUIState)) {
            return false;
        }
        PriceDetailsUIState priceDetailsUIState = (PriceDetailsUIState) obj;
        return Intrinsics.d(this.f8755a, priceDetailsUIState.f8755a) && Intrinsics.d(this.b, priceDetailsUIState.b) && Intrinsics.d(this.c, priceDetailsUIState.c) && Intrinsics.d(this.d, priceDetailsUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f8755a.hashCode() * 31;
        TitleSubtitleUiState titleSubtitleUiState = this.b;
        int iB = r30.b((iHashCode + (titleSubtitleUiState == null ? 0 : titleSubtitleUiState.hashCode())) * 31, 31, this.c);
        DashedLineUIState dashedLineUIState = this.d;
        return iB + (dashedLineUIState != null ? dashedLineUIState.hashCode() : 0);
    }

    public final String toString() {
        return "PriceDetailsUIState(title=" + this.f8755a + ", totalFare=" + this.b + ", fareBreakupComponentList=" + this.c + ", dashedLineState=" + this.d + ")";
    }
}
