package defpackage;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.ui.focus.FocusRequester;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.juspay.JuspayController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19188a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r9(boolean z, Object obj, int i) {
        this.f19188a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19188a) {
            case 0:
                return BasicTextFieldKt.BasicTextField$lambda$13$0(this.b, (MutableSharedFlow) this.c);
            case 1:
                return CoreTextFieldKt.CoreTextField$lambda$23$0(this.b, (LegacyPlatformTextInputServiceAdapter) this.c);
            case 2:
                return ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$20$lambda$19(this.b, (FocusRequester) this.c);
            default:
                PaymentMainComponent paymentMainComponent = (PaymentMainComponent) this.c;
                if (this.b) {
                    JuspayController juspayController = paymentMainComponent.Z;
                    if (juspayController != null) {
                        juspayController.onBackPressed();
                    }
                } else {
                    paymentMainComponent.U0();
                }
                return Unit.f17538a;
        }
    }
}
