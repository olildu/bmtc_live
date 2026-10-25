package app.chalo.checkout.ui.screen.card;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardSideEffect;", "", "HandleKeyboardVisibility", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardSideEffect$HandleKeyboardVisibility;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CheckoutCardSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardSideEffect$HandleKeyboardVisibility;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HandleKeyboardVisibility extends CheckoutCardSideEffect {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HandleKeyboardVisibility);
        }

        public final int hashCode() {
            return 1237;
        }

        public final String toString() {
            return "HandleKeyboardVisibility(show=false)";
        }
    }
}
