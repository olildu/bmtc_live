package app.chalo.productpurchase.passselection.ui;

import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.plotline.PlotlineWidgetUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassCategorySelectionSectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassCategorySelectionSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlotlineWidgetUIState f8527a;
    public final TextUIState b;
    public final PassPlanAnnouncementUIState c;
    public final TextUIState d;
    public final PlotlineWidgetUIState e;
    public final ArrayList f;
    public final PassCategorySelectionSectionUISpec g;
    public final ImageUrlUIState h;

    public PassCategorySelectionSectionUIState(PlotlineWidgetUIState plotlineWidgetUIState, TextUIState.ChaloTextUIState chaloTextUIState, PassPlanAnnouncementUIState passPlanAnnouncementUIState, TextUIState.ChaloTextUIState chaloTextUIState2, PlotlineWidgetUIState plotlineWidgetUIState2, ArrayList arrayList, ImageUrlUIState imageUrlUIState) {
        PassCategorySelectionSectionUISpec passCategorySelectionSectionUISpec = new PassCategorySelectionSectionUISpec();
        this.f8527a = plotlineWidgetUIState;
        this.b = chaloTextUIState;
        this.c = passPlanAnnouncementUIState;
        this.d = chaloTextUIState2;
        this.e = plotlineWidgetUIState2;
        this.f = arrayList;
        this.g = passCategorySelectionSectionUISpec;
        this.h = imageUrlUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassCategorySelectionSectionUIState)) {
            return false;
        }
        PassCategorySelectionSectionUIState passCategorySelectionSectionUIState = (PassCategorySelectionSectionUIState) obj;
        return Intrinsics.d(this.f8527a, passCategorySelectionSectionUIState.f8527a) && Intrinsics.d(this.b, passCategorySelectionSectionUIState.b) && Intrinsics.d(this.c, passCategorySelectionSectionUIState.c) && Intrinsics.d(this.d, passCategorySelectionSectionUIState.d) && Intrinsics.d(this.e, passCategorySelectionSectionUIState.e) && Intrinsics.d(this.f, passCategorySelectionSectionUIState.f) && Intrinsics.d(this.g, passCategorySelectionSectionUIState.g) && Intrinsics.d(this.h, passCategorySelectionSectionUIState.h);
    }

    public final int hashCode() {
        PlotlineWidgetUIState plotlineWidgetUIState = this.f8527a;
        int iHashCode = (plotlineWidgetUIState == null ? 0 : plotlineWidgetUIState.f10064a.hashCode()) * 31;
        TextUIState textUIState = this.b;
        int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        PassPlanAnnouncementUIState passPlanAnnouncementUIState = this.c;
        int iHashCode3 = (iHashCode2 + (passPlanAnnouncementUIState == null ? 0 : passPlanAnnouncementUIState.hashCode())) * 31;
        TextUIState textUIState2 = this.d;
        int iHashCode4 = (iHashCode3 + (textUIState2 == null ? 0 : textUIState2.hashCode())) * 31;
        PlotlineWidgetUIState plotlineWidgetUIState2 = this.e;
        int iHashCode5 = (this.g.hashCode() + xs.e(this.f, (iHashCode4 + (plotlineWidgetUIState2 == null ? 0 : plotlineWidgetUIState2.f10064a.hashCode())) * 31, 31)) * 31;
        ImageUrlUIState imageUrlUIState = this.h;
        return iHashCode5 + (imageUrlUIState != null ? imageUrlUIState.hashCode() : 0);
    }

    public final String toString() {
        return "PassCategorySelectionSectionUIState(infoHeaderWidget=" + this.f8527a + ", header=" + this.b + ", announcement=" + this.c + ", infoNote=" + this.d + ", plansInfoWidget=" + this.e + ", items=" + this.f + ", spec=" + this.g + ", passInfoImageUrlUIState=" + this.h + ")";
    }
}
