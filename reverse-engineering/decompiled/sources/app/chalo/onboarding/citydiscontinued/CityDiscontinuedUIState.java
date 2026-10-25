package app.chalo.onboarding.citydiscontinued;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedUIState;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CityDiscontinuedUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityDiscontinuedUISpecs f6558a;
    public final ToolbarUIState b;
    public final ImageUIState c;
    public final DiscontinuedTextViewsUIState d;
    public final SupportedCitiesButtonUIState e;

    public CityDiscontinuedUIState(ToolbarUIState toolBarUIState, ImageUIState imageUIState, DiscontinuedTextViewsUIState discontinuedTextViewsUIState, SupportedCitiesButtonUIState supportedCitiesButtonUIState) {
        CityDiscontinuedUISpecs cityDiscontinuedUISpecs = new CityDiscontinuedUISpecs();
        Intrinsics.i(toolBarUIState, "toolBarUIState");
        Intrinsics.i(imageUIState, "imageUIState");
        Intrinsics.i(discontinuedTextViewsUIState, "discontinuedTextViewsUIState");
        this.f6558a = cityDiscontinuedUISpecs;
        this.b = toolBarUIState;
        this.c = imageUIState;
        this.d = discontinuedTextViewsUIState;
        this.e = supportedCitiesButtonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityDiscontinuedUIState)) {
            return false;
        }
        CityDiscontinuedUIState cityDiscontinuedUIState = (CityDiscontinuedUIState) obj;
        return Intrinsics.d(this.f6558a, cityDiscontinuedUIState.f6558a) && Intrinsics.d(this.b, cityDiscontinuedUIState.b) && Intrinsics.d(this.c, cityDiscontinuedUIState.c) && Intrinsics.d(this.d, cityDiscontinuedUIState.d) && Intrinsics.d(this.e, cityDiscontinuedUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + r30.e(this.c, t8.d(this.b, this.f6558a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "CityDiscontinuedUIState(specs=" + this.f6558a + ", toolBarUIState=" + this.b + ", imageUIState=" + this.c + ", discontinuedTextViewsUIState=" + this.d + ", supportedCitiesButtonUIState=" + this.e + ")";
    }
}
