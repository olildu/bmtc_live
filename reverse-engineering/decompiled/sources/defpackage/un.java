package defpackage;

import app.chalo.checkout.domain.CardFieldType;
import app.chalo.checkout.ui.screen.card.CheckoutCardComponent;
import app.chalo.checkout.ui.screen.card.CheckoutCardViewIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class un implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19762a;
    public final /* synthetic */ CheckoutCardComponent b;

    public /* synthetic */ un(CheckoutCardComponent checkoutCardComponent, int i) {
        this.f19762a = i;
        this.b = checkoutCardComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19762a) {
            case 0:
                String number = (String) obj;
                Intrinsics.i(number, "number");
                this.b.N0(new CheckoutCardViewIntent.CardFieldUpdated(CardFieldType.CARD_NUMBER, number));
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    this.b.N0(new CheckoutCardViewIntent.SetFieldInFocus(CardFieldType.CARD_NUMBER));
                }
                return Unit.f17538a;
            case 2:
                String name = (String) obj;
                Intrinsics.i(name, "name");
                this.b.N0(new CheckoutCardViewIntent.CardFieldUpdated(CardFieldType.CARD_NAME, name));
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    this.b.N0(new CheckoutCardViewIntent.SetFieldInFocus(CardFieldType.CARD_NAME));
                }
                return Unit.f17538a;
            case 4:
                String newCvv = (String) obj;
                Intrinsics.i(newCvv, "newCvv");
                this.b.N0(new CheckoutCardViewIntent.CardFieldUpdated(CardFieldType.NEW_CARD_CVV, newCvv));
                break;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    this.b.N0(new CheckoutCardViewIntent.SetFieldInFocus(CardFieldType.NEW_CARD_CVV));
                }
                return Unit.f17538a;
            case 6:
                String date = (String) obj;
                Intrinsics.i(date, "date");
                this.b.N0(new CheckoutCardViewIntent.CardFieldUpdated(CardFieldType.CARD_EXPIRY_DATE, date));
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    this.b.N0(new CheckoutCardViewIntent.SetFieldInFocus(CardFieldType.CARD_EXPIRY_DATE));
                }
                return Unit.f17538a;
        }
        return Unit.f17538a;
    }
}
