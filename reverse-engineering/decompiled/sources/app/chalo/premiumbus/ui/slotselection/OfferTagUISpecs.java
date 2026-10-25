package app.chalo.premiumbus.ui.slotselection;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/OfferTagUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OfferTagUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f7817a;
    public final UIShape b;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public OfferTagUISpecs() {
        UIShape shape = ChaloThemeHelper.d.b;
        Intrinsics.i(shape, "shape");
        this.f7817a = ChaloColorToken.GreenBase.f9800a;
        this.b = shape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferTagUISpecs)) {
            return false;
        }
        OfferTagUISpecs offerTagUISpecs = (OfferTagUISpecs) obj;
        return Intrinsics.d(this.f7817a, offerTagUISpecs.f7817a) && Intrinsics.d(this.b, offerTagUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7817a.hashCode() * 31);
    }

    public final String toString() {
        return "OfferTagUISpecs(backgroundColorToken=" + this.f7817a + ", shape=" + this.b + ")";
    }
}
