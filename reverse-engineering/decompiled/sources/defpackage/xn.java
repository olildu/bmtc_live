package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.checkout.ui.screen.card.compose.CheckoutCardTextFieldKt;
import app.chalo.compose.components.text.TextFieldWithErrorKt;
import app.chalo.uistate.textField.TextFieldWithErrorUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20037a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ TextFieldWithErrorUiState c;
    public final /* synthetic */ int d;

    public /* synthetic */ xn(Modifier modifier, TextFieldWithErrorUiState textFieldWithErrorUiState, int i, int i2) {
        this.f20037a = i2;
        this.b = modifier;
        this.c = textFieldWithErrorUiState;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f20037a) {
            case 0:
                num.intValue();
                CheckoutCardTextFieldKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                num.getClass();
                TextFieldWithErrorKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
