package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/SearchFieldComponentUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchFieldComponentUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchFieldComponentUIStateSpec f7675a;
    public final SearchItemUIState b;
    public final SearchItemUIState c;
    public final ImageUIState d;

    public SearchFieldComponentUIState(SearchItemUIState fromSearchItemUIState, SearchItemUIState toSearchItemUIState, ImageUIState imageUIState, int i) {
        SearchFieldComponentUIStateSpec searchFieldComponentUIStateSpec = new SearchFieldComponentUIStateSpec();
        fromSearchItemUIState = (i & 2) != 0 ? new SearchItemUIState() : fromSearchItemUIState;
        toSearchItemUIState = (i & 4) != 0 ? new SearchItemUIState() : toSearchItemUIState;
        imageUIState = (i & 8) != 0 ? new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : imageUIState;
        Intrinsics.i(fromSearchItemUIState, "fromSearchItemUIState");
        Intrinsics.i(toSearchItemUIState, "toSearchItemUIState");
        this.f7675a = searchFieldComponentUIStateSpec;
        this.b = fromSearchItemUIState;
        this.c = toSearchItemUIState;
        this.d = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFieldComponentUIState)) {
            return false;
        }
        SearchFieldComponentUIState searchFieldComponentUIState = (SearchFieldComponentUIState) obj;
        return Intrinsics.d(this.f7675a, searchFieldComponentUIState.f7675a) && Intrinsics.d(this.b, searchFieldComponentUIState.b) && Intrinsics.d(this.c, searchFieldComponentUIState.c) && Intrinsics.d(this.d, searchFieldComponentUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f7675a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SearchFieldComponentUIState(spec=" + this.f7675a + ", fromSearchItemUIState=" + this.b + ", toSearchItemUIState=" + this.c + ", swapImageUIState=" + this.d + ")";
    }
}
