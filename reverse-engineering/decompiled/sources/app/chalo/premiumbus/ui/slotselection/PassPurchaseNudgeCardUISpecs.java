package app.chalo.premiumbus.ui.slotselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloUIShape;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PassPurchaseNudgeCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassPurchaseNudgeCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7830a;
    public final UIShape b;
    public final ChaloPadding c;
    public final BorderUIState d;
    public final ChaloColorToken e;
    public final ChaloColorToken f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PassPurchaseNudgeCardUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 9);
        ChaloUIShape chaloUIShape = ChaloThemeHelper.d;
        UIShape cardShape = chaloUIShape.g;
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().d, 3);
        BorderUIState borderUIState = new BorderUIState(ChaloThemeHelper.a().b, ChaloColorToken.LightOrange.f9816a, chaloUIShape.g);
        Intrinsics.i(cardShape, "cardShape");
        this.f7830a = chaloPadding;
        this.b = cardShape;
        this.c = chaloPadding2;
        this.d = borderUIState;
        this.e = ChaloColorToken.White.f9870a;
        this.f = ChaloColorToken.OrangeBackground.f9832a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassPurchaseNudgeCardUISpecs)) {
            return false;
        }
        PassPurchaseNudgeCardUISpecs passPurchaseNudgeCardUISpecs = (PassPurchaseNudgeCardUISpecs) obj;
        return Intrinsics.d(this.f7830a, passPurchaseNudgeCardUISpecs.f7830a) && Intrinsics.d(this.b, passPurchaseNudgeCardUISpecs.b) && Intrinsics.d(this.c, passPurchaseNudgeCardUISpecs.c) && Intrinsics.d(this.d, passPurchaseNudgeCardUISpecs.d) && Intrinsics.d(this.e, passPurchaseNudgeCardUISpecs.e) && Intrinsics.d(this.f, passPurchaseNudgeCardUISpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + z40.b(this.e, (this.d.hashCode() + r30.c(this.c, pk0.b(this.b, this.f7830a.hashCode() * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "PassPurchaseNudgeCardUISpecs(contentPadding=" + this.f7830a + ", cardShape=" + this.b + ", iconPadding=" + this.c + ", borderUIState=" + this.d + ", backgroundGradientStartColor=" + this.e + ", backgroundGradientEndColor=" + this.f + ")";
    }
}
