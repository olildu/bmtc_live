package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.metro.ui.confirmbooking.compose.ConfirmBookingScreenUIKt;
import app.chalo.multimodalticket.groupticketsummary.ui.compose.GroupTicketSummaryScreenKt;
import app.chalo.onboarding.languageselection.ui.LanguageSelectionScreenKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsFooterKt;
import app.chalo.productbooking.pickroutelocation.ui.PickRouteLocationComposableKt;
import app.chalo.uistate.snackbar.SnackbarUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ms implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18425a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ SnackbarUIState c;
    public final /* synthetic */ int d;

    public /* synthetic */ ms(Modifier modifier, SnackbarUIState snackbarUIState, int i, int i2) {
        this.f18425a = i2;
        this.b = modifier;
        this.c = snackbarUIState;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18425a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ConfirmBookingScreenUIKt.b(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 1:
                GroupTicketSummaryScreenKt.e(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 2:
                LanguageSelectionScreenKt.g(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 3:
                PickRouteLocationComposableKt.d(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            default:
                PremiumBusFareDetailsFooterKt.b(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ ms(SnackbarUIState snackbarUIState, Modifier modifier, int i) {
        this.f18425a = 4;
        this.c = snackbarUIState;
        this.b = modifier;
        this.d = i;
    }
}
