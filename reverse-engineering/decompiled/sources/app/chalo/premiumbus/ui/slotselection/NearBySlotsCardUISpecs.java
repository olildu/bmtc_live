package app.chalo.premiumbus.ui.slotselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NearBySlotsCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearBySlotsCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7808a;
    public final UIShape b;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public NearBySlotsCardUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape cardShape = ChaloThemeHelper.d.g;
        Intrinsics.i(cardShape, "cardShape");
        this.f7808a = chaloPadding;
        this.b = cardShape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearBySlotsCardUISpecs)) {
            return false;
        }
        NearBySlotsCardUISpecs nearBySlotsCardUISpecs = (NearBySlotsCardUISpecs) obj;
        return Intrinsics.d(this.f7808a, nearBySlotsCardUISpecs.f7808a) && Intrinsics.d(this.b, nearBySlotsCardUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7808a.hashCode() * 31);
    }

    public final String toString() {
        return "NearBySlotsCardUISpecs(contentPadding=" + this.f7808a + ", cardShape=" + this.b + ")";
    }
}
