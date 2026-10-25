package app.chalo.uistate.searchbar;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import defpackage.mb1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/searchbar/SearchBarUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchBarUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchBarUiSpecs f10067a;
    public final BaseTextFieldUIState.TextFieldUIState b;
    public final ImageUIState c;

    public SearchBarUiState(SearchBarUiSpecs searchBarUiSpecs, BaseTextFieldUIState.TextFieldUIState textFieldUIState, int i) {
        SearchBarUiSpecs searchBarUiSpecs2 = (i & 1) != 0 ? new SearchBarUiSpecs(null, 255) : searchBarUiSpecs;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState2 = (i & 2) != 0 ? new BaseTextFieldUIState.TextFieldUIState("", TextFieldEventHandlerHelper.b(1, null, new mb1(13)), null, null, null, null, false, null, 0, null, null, 0.0f, 131068) : textFieldUIState;
        ImageUIState imageUIState = new ImageUIState(IconType.SEARCH, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().i)), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230);
        Intrinsics.i(searchBarUiSpecs2, "searchBarUiSpecs");
        this.f10067a = searchBarUiSpecs2;
        this.b = textFieldUIState2;
        this.c = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarUiState)) {
            return false;
        }
        SearchBarUiState searchBarUiState = (SearchBarUiState) obj;
        return Intrinsics.d(this.f10067a, searchBarUiState.f10067a) && Intrinsics.d(this.b, searchBarUiState.b) && Intrinsics.d(this.c, searchBarUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f10067a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SearchBarUiState(searchBarUiSpecs=" + this.f10067a + ", searchTextUiState=" + this.b + ", searchImageUiState=" + this.c + ")";
    }
}
