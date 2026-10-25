package app.chalo.productpurchase.passpurchase.ui.passengerselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassPassengerSelectionUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8451a;
    public final ChaloPadding b;
    public final float c;

    public SuperPassPassengerSelectionUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().g, ChaloThemeHelper.a().g, ChaloThemeHelper.a().h);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, Dp.m7278constructorimpl(ChaloThemeHelper.a().f - ChaloThemeHelper.a().c), 0.0f, ChaloThemeHelper.a().f, 5);
        float f = ChaloThemeHelper.a().d;
        this.f8451a = chaloPadding;
        this.b = chaloPadding2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassPassengerSelectionUISpec)) {
            return false;
        }
        SuperPassPassengerSelectionUISpec superPassPassengerSelectionUISpec = (SuperPassPassengerSelectionUISpec) obj;
        return Intrinsics.d(this.f8451a, superPassPassengerSelectionUISpec.f8451a) && Intrinsics.d(this.b, superPassPassengerSelectionUISpec.b) && Dp.m7283equalsimpl0(this.c, superPassPassengerSelectionUISpec.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + r30.c(this.b, this.f8451a.hashCode() * 31, 31);
    }

    public final String toString() {
        return vo1.p(pk0.m("SuperPassPassengerSelectionUISpec(paddingAround=", this.f8451a, ", paddingAroundTitle=", this.b, ", verticalSpaceAroundList="), Dp.m7289toStringimpl(this.c), ")");
    }
}
