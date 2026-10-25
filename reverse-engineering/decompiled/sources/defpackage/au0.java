package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsScreenKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusThroughPassFareDetailsScreenKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class au0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11144a;
    public final /* synthetic */ PremiumBusFareDetailsUiState b;
    public final /* synthetic */ PremiumBusFareDetailsContent c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ int e;

    public /* synthetic */ au0(PremiumBusFareDetailsUiState premiumBusFareDetailsUiState, PremiumBusFareDetailsContent premiumBusFareDetailsContent, Modifier modifier, int i, int i2) {
        this.f11144a = i2;
        this.b = premiumBusFareDetailsUiState;
        this.c = premiumBusFareDetailsContent;
        this.d = modifier;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11144a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PremiumBusFreshPurchaseFareDetailsScreenKt.f(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                PremiumBusThroughPassFareDetailsScreenKt.b(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }
}
