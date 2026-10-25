package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.card.CardUISpec;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassBookingSuccessDetailsUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassBookingSuccessDetailsUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f8342a;
    public final ChaloColorToken b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;

    public SuperPassBookingSuccessDetailsUISpec() {
        CardUISpec cardUISpec = new CardUISpec(UIShape.f1926a, ChaloThemeHelper.a().d, 0.0f, 4);
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        this.f8342a = cardUISpec;
        this.b = ChaloColorToken.White.f9870a;
        this.c = chaloPadding;
        this.d = chaloPadding2;
        this.e = chaloPadding3;
        this.f = chaloPadding4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassBookingSuccessDetailsUISpec)) {
            return false;
        }
        SuperPassBookingSuccessDetailsUISpec superPassBookingSuccessDetailsUISpec = (SuperPassBookingSuccessDetailsUISpec) obj;
        return Intrinsics.d(this.f8342a, superPassBookingSuccessDetailsUISpec.f8342a) && Intrinsics.d(this.b, superPassBookingSuccessDetailsUISpec.b) && Intrinsics.d(this.c, superPassBookingSuccessDetailsUISpec.c) && Intrinsics.d(this.d, superPassBookingSuccessDetailsUISpec.d) && Intrinsics.d(this.e, superPassBookingSuccessDetailsUISpec.e) && Intrinsics.d(this.f, superPassBookingSuccessDetailsUISpec.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.c(this.e, r30.c(this.d, r30.c(this.c, z40.b(this.b, this.f8342a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassBookingSuccessDetailsUISpec(cardUISpec=");
        sb.append(this.f8342a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", internalPadding=");
        r30.o(sb, this.c, ", paddingAroundPositiveBtn=", this.d, ", paddingAroundNegativeBtn=");
        sb.append(this.e);
        sb.append(", paddingAroundNextStepItems=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
