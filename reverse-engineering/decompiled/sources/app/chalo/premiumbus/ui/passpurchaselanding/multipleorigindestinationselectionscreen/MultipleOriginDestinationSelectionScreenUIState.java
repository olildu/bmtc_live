package app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/multipleorigindestinationselectionscreen/MultipleOriginDestinationSelectionScreenUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultipleOriginDestinationSelectionScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultipleOriginDestinationSelectionScreenUISpec f7682a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final TitleSubtitleUiState d;

    public MultipleOriginDestinationSelectionScreenUIState(TextUIState.ChaloTextUIState title, List originDestinationCardUIStateList, TitleSubtitleUiState suggestADifferentStopUIState) {
        MultipleOriginDestinationSelectionScreenUISpec multipleOriginDestinationSelectionScreenUISpec = new MultipleOriginDestinationSelectionScreenUISpec();
        Intrinsics.i(title, "title");
        Intrinsics.i(originDestinationCardUIStateList, "originDestinationCardUIStateList");
        Intrinsics.i(suggestADifferentStopUIState, "suggestADifferentStopUIState");
        this.f7682a = multipleOriginDestinationSelectionScreenUISpec;
        this.b = title;
        this.c = originDestinationCardUIStateList;
        this.d = suggestADifferentStopUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipleOriginDestinationSelectionScreenUIState)) {
            return false;
        }
        MultipleOriginDestinationSelectionScreenUIState multipleOriginDestinationSelectionScreenUIState = (MultipleOriginDestinationSelectionScreenUIState) obj;
        return Intrinsics.d(this.f7682a, multipleOriginDestinationSelectionScreenUIState.f7682a) && Intrinsics.d(this.b, multipleOriginDestinationSelectionScreenUIState.b) && Intrinsics.d(this.c, multipleOriginDestinationSelectionScreenUIState.c) && Intrinsics.d(this.d, multipleOriginDestinationSelectionScreenUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.b(r30.f(this.b, this.f7682a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "MultipleOriginDestinationSelectionScreenUIState(spec=" + this.f7682a + ", title=" + this.b + ", originDestinationCardUIStateList=" + this.c + ", suggestADifferentStopUIState=" + this.d + ")";
    }
}
