package app.chalo.productbooking.pickstop;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopUiSpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PickStopUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f8309a;
    public final UiAlignment.Horizontal b;
    public final UiAlignment.BiasAlignment c;
    public final ChaloPadding d;

    public PickStopUiSpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        this.f8309a = ChaloColorToken.White.f9870a;
        this.b = UiAlignment.Horizontal.Center.f9884a;
        this.c = UiAlignment.BiasAlignment.BottomCenter.f9875a;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickStopUiSpecs)) {
            return false;
        }
        PickStopUiSpecs pickStopUiSpecs = (PickStopUiSpecs) obj;
        return Intrinsics.d(this.f8309a, pickStopUiSpecs.f8309a) && Intrinsics.d(this.b, pickStopUiSpecs.b) && Intrinsics.d(this.c, pickStopUiSpecs.c) && Intrinsics.d(this.d, pickStopUiSpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + uf0.d(this.b, this.f8309a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "PickStopUiSpecs(backgroundColor=" + this.f8309a + ", horizontalAlignment=" + this.b + ", snackbarAlignment=" + this.c + ", titlePadding=" + this.d + ")";
    }
}
