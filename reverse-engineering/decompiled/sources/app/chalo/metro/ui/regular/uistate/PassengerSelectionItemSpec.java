package app.chalo.metro.ui.regular.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/uistate/PassengerSelectionItemSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerSelectionItemSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5548a;
    public final UIShape b;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PassengerSelectionItemSpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle backgroundShape = UIShape.f;
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f5548a = chaloPadding;
        this.b = backgroundShape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerSelectionItemSpec)) {
            return false;
        }
        PassengerSelectionItemSpec passengerSelectionItemSpec = (PassengerSelectionItemSpec) obj;
        return Intrinsics.d(this.f5548a, passengerSelectionItemSpec.f5548a) && Intrinsics.d(this.b, passengerSelectionItemSpec.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5548a.hashCode() * 31);
    }

    public final String toString() {
        return "PassengerSelectionItemSpec(contentPadding=" + this.f5548a + ", backgroundShape=" + this.b + ")";
    }
}
