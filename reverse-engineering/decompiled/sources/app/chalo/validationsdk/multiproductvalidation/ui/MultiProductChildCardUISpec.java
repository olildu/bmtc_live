package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.card.CardUISpec;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductChildCardUISpec;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiProductChildCardUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f10686a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final BorderUISpec d;
    public final ChaloColorToken.OrangeBackground e;
    public final ChaloPadding f;
    public final ChaloPadding g;
    public final BorderUISpec h;

    public MultiProductChildCardUISpec(BorderUISpec borderUISpec, ChaloColorToken.OrangeBackground orangeBackground) {
        CardUISpec cardUISpec = new CardUISpec(UIShape.e, ChaloThemeHelper.a().b, 0.0f, 4);
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, ChaloThemeHelper.a().h, 6);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding4 = new ChaloPadding(f3, f2, f2, f3);
        BorderUISpec borderUISpec2 = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.c);
        this.f10686a = cardUISpec;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = borderUISpec;
        this.e = orangeBackground;
        this.f = chaloPadding3;
        this.g = chaloPadding4;
        this.h = borderUISpec2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiProductChildCardUISpec)) {
            return false;
        }
        MultiProductChildCardUISpec multiProductChildCardUISpec = (MultiProductChildCardUISpec) obj;
        return Intrinsics.d(this.f10686a, multiProductChildCardUISpec.f10686a) && Intrinsics.d(this.b, multiProductChildCardUISpec.b) && Intrinsics.d(this.c, multiProductChildCardUISpec.c) && Intrinsics.d(this.d, multiProductChildCardUISpec.d) && Intrinsics.d(this.e, multiProductChildCardUISpec.e) && Intrinsics.d(this.f, multiProductChildCardUISpec.f) && Intrinsics.d(this.g, multiProductChildCardUISpec.g) && Intrinsics.d(this.h, multiProductChildCardUISpec.h);
    }

    public final int hashCode() {
        int iC = r30.c(this.c, r30.c(this.b, this.f10686a.hashCode() * 31, 31), 31);
        BorderUISpec borderUISpec = this.d;
        return this.h.hashCode() + r30.c(this.g, r30.c(this.f, (((iC + (borderUISpec == null ? 0 : borderUISpec.hashCode())) * 31) + (this.e != null ? 828859173 : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "MultiProductChildCardUISpec(cardSpec=" + this.f10686a + ", innerPadding=" + this.b + ", paddingAroundQRCard=" + this.c + ", border=" + this.d + ", background=" + this.e + ", paddingAroundStopDetails=" + this.f + ", viewReceiptInternalPadding=" + this.g + ", borderAroundViewTicket=" + this.h + ")";
    }
}
