package app.chalo.productpurchase.passselection.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/ToolbarUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ToolbarUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8555a;
    public final BorderUISpec b;

    public ToolbarUISpecs() {
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().d;
        float f3 = ChaloThemeHelper.a().f1916a;
        BorderUISpec borderUISpec = new BorderUISpec(f2, ChaloColorToken.LightGray.f9814a, new UIShape.Rectangle(f3, f3, f3, f3));
        this.f8555a = chaloPadding;
        this.b = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarUISpecs)) {
            return false;
        }
        ToolbarUISpecs toolbarUISpecs = (ToolbarUISpecs) obj;
        return Intrinsics.d(this.f8555a, toolbarUISpecs.f8555a) && Intrinsics.d(this.b, toolbarUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8555a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolbarUISpecs(internalPadding=" + this.f8555a + ", borderUISpec=" + this.b + ")";
    }
}
