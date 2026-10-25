package app.chalo.productbooking.pickroutelocation;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/RouteItemUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteItemUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteItemUiSpecs f8289a;
    public final ImageUIState b;
    public final TextWithSpecialFeaturesTagsUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final DividerUIState e;
    public final UiEventHandler$Companion$fromLambda$1 f;

    public RouteItemUiState(RouteItemUiSpecs routeItemUiSpecs, ImageUIState imageUIState, TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState, TextUIState.ChaloTextUIState chaloTextUIState, DividerUIState dividerUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f8289a = routeItemUiSpecs;
        this.b = imageUIState;
        this.c = textWithSpecialFeaturesTagsUIState;
        this.d = chaloTextUIState;
        this.e = dividerUIState;
        this.f = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteItemUiState)) {
            return false;
        }
        RouteItemUiState routeItemUiState = (RouteItemUiState) obj;
        return this.f8289a.equals(routeItemUiState.f8289a) && this.b.equals(routeItemUiState.b) && this.c.equals(routeItemUiState.c) && this.d.equals(routeItemUiState.d) && this.e.equals(routeItemUiState.e) && this.f.equals(routeItemUiState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + py.c(this.e, r30.f(this.d, (this.c.hashCode() + r30.e(this.b, this.f8289a.hashCode() * 31, 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "RouteItemUiState(specs=" + this.f8289a + ", icon=" + this.b + ", routeDetails=" + this.c + ", stopName=" + this.d + ", dividerUiState=" + this.e + ", eventHandler=" + this.f + ")";
    }
}
