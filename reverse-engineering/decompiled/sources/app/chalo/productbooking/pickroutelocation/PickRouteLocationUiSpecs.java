package app.chalo.productbooking.pickroutelocation;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationUiSpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PickRouteLocationUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f8286a = ChaloColorToken.NewActivityColor.f9827a;
    public final UiAlignment.Horizontal b = UiAlignment.Horizontal.Center.f9884a;
    public final UiAlignment.BiasAlignment c = UiAlignment.BiasAlignment.BottomCenter.f9875a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickRouteLocationUiSpecs)) {
            return false;
        }
        PickRouteLocationUiSpecs pickRouteLocationUiSpecs = (PickRouteLocationUiSpecs) obj;
        return Intrinsics.d(this.f8286a, pickRouteLocationUiSpecs.f8286a) && Intrinsics.d(this.b, pickRouteLocationUiSpecs.b) && Intrinsics.d(this.c, pickRouteLocationUiSpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.d(this.b, this.f8286a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PickRouteLocationUiSpecs(backgroundColor=" + this.f8286a + ", horizontalAlignment=" + this.b + ", snackbarAlignment=" + this.c + ")";
    }
}
