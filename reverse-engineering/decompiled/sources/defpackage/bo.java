package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.checkout.ui.payment.CheckoutItemListKt;
import app.chalo.checkout.ui.screen.payment.PaymentCardUiSpec;
import app.chalo.uistate.button.ClickableTextUiState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11216a;
    public final /* synthetic */ PaymentCardUiSpec b;
    public final /* synthetic */ List c;
    public final /* synthetic */ ClickableTextUiState d;
    public final /* synthetic */ int e;

    public /* synthetic */ bo(PaymentCardUiSpec paymentCardUiSpec, List list, ClickableTextUiState clickableTextUiState, int i, int i2) {
        this.f11216a = i2;
        this.b = paymentCardUiSpec;
        this.c = list;
        this.d = clickableTextUiState;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11216a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                CheckoutItemListKt.f(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                CheckoutItemListKt.e(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }
}
