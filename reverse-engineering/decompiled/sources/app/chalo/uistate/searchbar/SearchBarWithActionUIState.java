package app.chalo.uistate.searchbar;

import androidx.core.app.FrameMetricsAggregator;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/searchbar/SearchBarWithActionUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchBarWithActionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchBarWithActionUISpecs f10069a;
    public final BaseTextFieldUIState.TextFieldUIState b;
    public final IconButtonUIState c;
    public final IconButtonUIState d;
    public final CircularProgressIndicatorUIState e;
    public final ImageUISize f;

    public SearchBarWithActionUIState(SearchBarWithActionUISpecs specs, BaseTextFieldUIState.TextFieldUIState textFieldUIState, IconButtonUIState iconButtonUIState, IconButtonUIState iconButtonUIState2, CircularProgressIndicatorUIState circularProgressIndicatorUIState, int i) {
        specs = (i & 1) != 0 ? new SearchBarWithActionUISpecs(null, null, FrameMetricsAggregator.EVERY_DURATION) : specs;
        circularProgressIndicatorUIState = (i & 16) != 0 ? null : circularProgressIndicatorUIState;
        ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
        Intrinsics.i(specs, "specs");
        this.f10069a = specs;
        this.b = textFieldUIState;
        this.c = iconButtonUIState;
        this.d = iconButtonUIState2;
        this.e = circularProgressIndicatorUIState;
        this.f = imageUISize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarWithActionUIState)) {
            return false;
        }
        SearchBarWithActionUIState searchBarWithActionUIState = (SearchBarWithActionUIState) obj;
        return Intrinsics.d(this.f10069a, searchBarWithActionUIState.f10069a) && Intrinsics.d(this.b, searchBarWithActionUIState.b) && Intrinsics.d(this.c, searchBarWithActionUIState.c) && Intrinsics.d(this.d, searchBarWithActionUIState.d) && Intrinsics.d(this.e, searchBarWithActionUIState.e) && Intrinsics.d(this.f, searchBarWithActionUIState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f10069a.hashCode() * 31)) * 31;
        IconButtonUIState iconButtonUIState = this.c;
        int iHashCode2 = (iHashCode + (iconButtonUIState == null ? 0 : iconButtonUIState.hashCode())) * 31;
        IconButtonUIState iconButtonUIState2 = this.d;
        int iHashCode3 = (iHashCode2 + (iconButtonUIState2 == null ? 0 : iconButtonUIState2.hashCode())) * 31;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState = this.e;
        return this.f.hashCode() + ((iHashCode3 + (circularProgressIndicatorUIState != null ? circularProgressIndicatorUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SearchBarWithActionUIState(specs=" + this.f10069a + ", textUiState=" + this.b + ", leadingIcon=" + this.c + ", trailingIcon=" + this.d + ", loader=" + this.e + ", imageSize=" + this.f + ")";
    }
}
