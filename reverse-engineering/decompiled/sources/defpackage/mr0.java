package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenType;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenUiSpecs;
import app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18423a;
    public final /* synthetic */ PbPassPurchaseLandingScreenUiSpecs b;
    public final /* synthetic */ PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState c;
    public final /* synthetic */ int d;

    public /* synthetic */ mr0(PbPassPurchaseLandingScreenUiSpecs pbPassPurchaseLandingScreenUiSpecs, PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState pbPassPurchaseLandingScreenSuccessUIState, int i, int i2) {
        this.f18423a = i2;
        this.b = pbPassPurchaseLandingScreenUiSpecs;
        this.c = pbPassPurchaseLandingScreenSuccessUIState;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18423a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                PbPassPurchaseLandingScreenKt.f(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                PbPassPurchaseLandingScreenKt.b(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
