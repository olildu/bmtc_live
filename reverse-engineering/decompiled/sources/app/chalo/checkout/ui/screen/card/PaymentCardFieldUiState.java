package app.chalo.checkout.ui.screen.card;

import app.chalo.checkout.domain.CardFieldType;
import app.chalo.uistate.textField.TextFieldWithErrorUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/PaymentCardFieldUiState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentCardFieldUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardFieldType f1447a;
    public final TextFieldWithErrorUiState b;

    public PaymentCardFieldUiState(CardFieldType fieldType, TextFieldWithErrorUiState textField) {
        Intrinsics.i(fieldType, "fieldType");
        Intrinsics.i(textField, "textField");
        this.f1447a = fieldType;
        this.b = textField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCardFieldUiState)) {
            return false;
        }
        PaymentCardFieldUiState paymentCardFieldUiState = (PaymentCardFieldUiState) obj;
        return this.f1447a == paymentCardFieldUiState.f1447a && Intrinsics.d(this.b, paymentCardFieldUiState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1447a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentCardFieldUiState(fieldType=" + this.f1447a + ", textField=" + this.b + ")";
    }
}
