package app.chalo.checkout.ui.screen.card;

import app.chalo.checkout.domain.CardFieldType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent;", "", "ViewCreatedIntent", "ProceedButtonClicked", "CardFieldUpdated", "SetFieldInFocus", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent$CardFieldUpdated;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent$ProceedButtonClicked;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent$SetFieldInFocus;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent$ViewCreatedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CheckoutCardViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent$CardFieldUpdated;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardFieldUpdated extends CheckoutCardViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardFieldType f1442a;
        public final String b;

        public CardFieldUpdated(CardFieldType fieldType, String value) {
            Intrinsics.i(fieldType, "fieldType");
            Intrinsics.i(value, "value");
            this.f1442a = fieldType;
            this.b = value;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardFieldUpdated)) {
                return false;
            }
            CardFieldUpdated cardFieldUpdated = (CardFieldUpdated) obj;
            return this.f1442a == cardFieldUpdated.f1442a && Intrinsics.d(this.b, cardFieldUpdated.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f1442a.hashCode() * 31);
        }

        public final String toString() {
            return "CardFieldUpdated(fieldType=" + this.f1442a + ", value=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent$ProceedButtonClicked;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedButtonClicked extends CheckoutCardViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutCardDetails f1443a;

        public ProceedButtonClicked(CheckoutCardDetails checkoutCardDetails) {
            this.f1443a = checkoutCardDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProceedButtonClicked) && Intrinsics.d(this.f1443a, ((ProceedButtonClicked) obj).f1443a);
        }

        public final int hashCode() {
            return this.f1443a.hashCode();
        }

        public final String toString() {
            return "ProceedButtonClicked(cardData=" + this.f1443a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent$SetFieldInFocus;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SetFieldInFocus extends CheckoutCardViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardFieldType f1444a;

        public SetFieldInFocus(CardFieldType fieldType) {
            Intrinsics.i(fieldType, "fieldType");
            this.f1444a = fieldType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetFieldInFocus) && this.f1444a == ((SetFieldInFocus) obj).f1444a;
        }

        public final int hashCode() {
            return this.f1444a.hashCode();
        }

        public final String toString() {
            return "SetFieldInFocus(fieldType=" + this.f1444a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent$ViewCreatedIntent;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewCreatedIntent extends CheckoutCardViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewCreatedIntent f1445a = new ViewCreatedIntent();
    }
}
