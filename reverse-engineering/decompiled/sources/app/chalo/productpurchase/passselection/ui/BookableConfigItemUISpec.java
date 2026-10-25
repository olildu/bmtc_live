package app.chalo.productpurchase.passselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.card.CardUISpec;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/BookableConfigItemUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookableConfigItemUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f8522a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final float g;
    public final float h;

    public BookableConfigItemUISpec() {
        float f = ChaloThemeHelper.a().d;
        CardUISpec cardUISpec = new CardUISpec(new UIShape.Rectangle(f, f, f, f), ChaloThemeHelper.a().d, 0.0f, 4);
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().f, 0.0f, 11);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding5 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        float f3 = ChaloThemeHelper.a().e;
        float f4 = ChaloThemeHelper.a().c;
        this.f8522a = cardUISpec;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = chaloPadding3;
        this.e = chaloPadding4;
        this.f = chaloPadding5;
        this.g = f3;
        this.h = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookableConfigItemUISpec)) {
            return false;
        }
        BookableConfigItemUISpec bookableConfigItemUISpec = (BookableConfigItemUISpec) obj;
        return Intrinsics.d(this.f8522a, bookableConfigItemUISpec.f8522a) && Intrinsics.d(this.b, bookableConfigItemUISpec.b) && Intrinsics.d(this.c, bookableConfigItemUISpec.c) && Intrinsics.d(this.d, bookableConfigItemUISpec.d) && Intrinsics.d(this.e, bookableConfigItemUISpec.e) && Intrinsics.d(this.f, bookableConfigItemUISpec.f) && Dp.m7283equalsimpl0(this.g, bookableConfigItemUISpec.g) && Dp.m7283equalsimpl0(this.h, bookableConfigItemUISpec.h);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.h) + uf0.a(this.g, r30.c(this.f, r30.c(this.e, r30.c(this.d, r30.c(this.c, r30.c(this.b, this.f8522a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.h);
        StringBuilder sb = new StringBuilder("BookableConfigItemUISpec(card=");
        sb.append(this.f8522a);
        sb.append(", internalPadding=");
        sb.append(this.b);
        sb.append(", discountedFarePadding=");
        r30.o(sb, this.c, ", additionalInfoPadding=", this.d, ", durationInfoPadding=");
        r30.o(sb, this.e, ", offerCopyPadding=", this.f, ", spaceAfterDurationName=");
        return r30.i(sb, strM7289toStringimpl, ", spaceBetweenSpfTags=", strM7289toStringimpl2, ")");
    }
}
