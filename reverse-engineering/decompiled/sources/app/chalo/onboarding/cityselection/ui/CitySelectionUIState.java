package app.chalo.onboarding.cityselection.ui;

import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import defpackage.t8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionUIState;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CitySelectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CitySelectionUISpec f6635a;
    public final CircularProgressIndicatorUIState b;
    public final StandardErrorScreenUIState c;
    public final ToolbarUIState d;
    public final ImageUIState e;
    public final CitySelectionSearchPanelUIState f;
    public final List g;
    public final DividerUIState h;

    public CitySelectionUIState(CircularProgressIndicatorUIState circularProgressIndicatorUIState, StandardErrorScreenUIState standardErrorScreenUIState, ToolbarUIState toolbar, ImageUIState headerImage, CitySelectionSearchPanelUIState searchPanel, List citiesList) {
        CitySelectionUISpec citySelectionUISpec = new CitySelectionUISpec();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, null, 4);
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(headerImage, "headerImage");
        Intrinsics.i(searchPanel, "searchPanel");
        Intrinsics.i(citiesList, "citiesList");
        this.f6635a = citySelectionUISpec;
        this.b = circularProgressIndicatorUIState;
        this.c = standardErrorScreenUIState;
        this.d = toolbar;
        this.e = headerImage;
        this.f = searchPanel;
        this.g = citiesList;
        this.h = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitySelectionUIState)) {
            return false;
        }
        CitySelectionUIState citySelectionUIState = (CitySelectionUIState) obj;
        return Intrinsics.d(this.f6635a, citySelectionUIState.f6635a) && Intrinsics.d(this.b, citySelectionUIState.b) && Intrinsics.d(this.c, citySelectionUIState.c) && Intrinsics.d(this.d, citySelectionUIState.d) && Intrinsics.d(this.e, citySelectionUIState.e) && Intrinsics.d(this.f, citySelectionUIState.f) && Intrinsics.d(this.g, citySelectionUIState.g) && Intrinsics.d(this.h, citySelectionUIState.h);
    }

    public final int hashCode() {
        int iHashCode = this.f6635a.hashCode() * 31;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState = this.b;
        int iHashCode2 = (iHashCode + (circularProgressIndicatorUIState == null ? 0 : circularProgressIndicatorUIState.hashCode())) * 31;
        StandardErrorScreenUIState standardErrorScreenUIState = this.c;
        return this.h.hashCode() + r30.b((this.f.hashCode() + r30.e(this.e, t8.d(this.d, (iHashCode2 + (standardErrorScreenUIState != null ? standardErrorScreenUIState.hashCode() : 0)) * 31, 31), 31)) * 31, 31, this.g);
    }

    public final String toString() {
        return "CitySelectionUIState(specs=" + this.f6635a + ", loadingSpinner=" + this.b + ", error=" + this.c + ", toolbar=" + this.d + ", headerImage=" + this.e + ", searchPanel=" + this.f + ", citiesList=" + this.g + ", citiesListDivider=" + this.h + ")";
    }
}
