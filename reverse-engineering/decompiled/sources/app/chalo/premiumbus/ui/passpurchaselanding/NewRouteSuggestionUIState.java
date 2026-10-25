package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/NewRouteSuggestionUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NewRouteSuggestionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewRouteSuggestionUISpecs f7642a;
    public final TextUIState.ChaloTextUIState b;
    public final TitleSubtitleUiState c;
    public final TitleSubtitleUiState d;
    public final DividerUIState e;
    public final ImageUIState f;
    public final ButtonUIState g;
    public final ButtonUIState h;

    public NewRouteSuggestionUIState(TextUIState.ChaloTextUIState title, TitleSubtitleUiState fromStopTextField, TitleSubtitleUiState toStopTextField, ImageUIState imageUIState, ButtonUIState submitButtonUIState, ButtonUIState buttonUIState) {
        NewRouteSuggestionUISpecs newRouteSuggestionUISpecs = new NewRouteSuggestionUISpecs();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, null, 4);
        Intrinsics.i(title, "title");
        Intrinsics.i(fromStopTextField, "fromStopTextField");
        Intrinsics.i(toStopTextField, "toStopTextField");
        Intrinsics.i(submitButtonUIState, "submitButtonUIState");
        this.f7642a = newRouteSuggestionUISpecs;
        this.b = title;
        this.c = fromStopTextField;
        this.d = toStopTextField;
        this.e = dividerUIState;
        this.f = imageUIState;
        this.g = submitButtonUIState;
        this.h = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewRouteSuggestionUIState)) {
            return false;
        }
        NewRouteSuggestionUIState newRouteSuggestionUIState = (NewRouteSuggestionUIState) obj;
        return Intrinsics.d(this.f7642a, newRouteSuggestionUIState.f7642a) && Intrinsics.d(this.b, newRouteSuggestionUIState.b) && Intrinsics.d(this.c, newRouteSuggestionUIState.c) && Intrinsics.d(this.d, newRouteSuggestionUIState.d) && Intrinsics.d(this.e, newRouteSuggestionUIState.e) && Intrinsics.d(this.f, newRouteSuggestionUIState.f) && Intrinsics.d(this.g, newRouteSuggestionUIState.g) && Intrinsics.d(this.h, newRouteSuggestionUIState.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + r30.d(this.g, r30.e(this.f, py.c(this.e, (this.d.hashCode() + ((this.c.hashCode() + r30.f(this.b, this.f7642a.hashCode() * 31, 31)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NewRouteSuggestionUIState(spec=" + this.f7642a + ", title=" + this.b + ", fromStopTextField=" + this.c + ", toStopTextField=" + this.d + ", textFieldDividerUIState=" + this.e + ", closeBtnUIState=" + this.f + ", submitButtonUIState=" + this.g + ", cancelButtonUIState=" + this.h + ")";
    }
}
