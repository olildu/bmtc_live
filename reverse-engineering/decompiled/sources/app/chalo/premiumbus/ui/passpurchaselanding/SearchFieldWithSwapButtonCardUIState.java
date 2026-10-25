package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.button.ButtonUIState;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/SearchFieldWithSwapButtonCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchFieldWithSwapButtonCardUIState {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FromAndToStopCardUISpecs f7677a;
    public final SearchFieldComponentUIState b;
    public final ButtonUIState c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public SearchFieldWithSwapButtonCardUIState(SearchFieldComponentUIState searchFieldComponentUIState, ButtonUIState buttonUIState) {
        FromAndToStopCardUISpecs fromAndToStopCardUISpecs = new FromAndToStopCardUISpecs();
        Intrinsics.i(searchFieldComponentUIState, "searchFieldComponentUIState");
        this.f7677a = fromAndToStopCardUISpecs;
        this.b = searchFieldComponentUIState;
        this.c = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFieldWithSwapButtonCardUIState)) {
            return false;
        }
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) obj;
        return Intrinsics.d(this.f7677a, searchFieldWithSwapButtonCardUIState.f7677a) && Intrinsics.d(this.b, searchFieldWithSwapButtonCardUIState.b) && Intrinsics.d(this.c, searchFieldWithSwapButtonCardUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f7677a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFieldWithSwapButtonCardUIState(spec=");
        sb.append(this.f7677a);
        sb.append(", searchFieldComponentUIState=");
        sb.append(this.b);
        sb.append(", proceedBtnUIState=");
        return hq0.j(sb, this.c, ")");
    }
}
