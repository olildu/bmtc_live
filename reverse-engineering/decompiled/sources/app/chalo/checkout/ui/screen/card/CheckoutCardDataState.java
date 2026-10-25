package app.chalo.checkout.ui.screen.card;

import app.chalo.checkout.domain.CardFieldType;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardDataState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckoutCardDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1439a;
    public final CheckoutCardDetails b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final CardFieldType g;

    public CheckoutCardDataState(String str, CheckoutCardDetails checkoutCardDetails, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, CardFieldType cardFieldType) {
        this.f1439a = str;
        this.b = checkoutCardDetails;
        this.c = bool;
        this.d = bool2;
        this.e = bool3;
        this.f = bool4;
        this.g = cardFieldType;
    }

    public static CheckoutCardDataState a(CheckoutCardDataState checkoutCardDataState, String str, CheckoutCardDetails checkoutCardDetails, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, CardFieldType cardFieldType, int i) {
        if ((i & 1) != 0) {
            str = checkoutCardDataState.f1439a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            checkoutCardDetails = checkoutCardDataState.b;
        }
        CheckoutCardDetails checkoutCardDetails2 = checkoutCardDetails;
        if ((i & 4) != 0) {
            bool = checkoutCardDataState.c;
        }
        Boolean bool5 = bool;
        if ((i & 8) != 0) {
            bool2 = checkoutCardDataState.d;
        }
        Boolean bool6 = bool2;
        if ((i & 16) != 0) {
            bool3 = checkoutCardDataState.e;
        }
        Boolean bool7 = bool3;
        if ((i & 32) != 0) {
            bool4 = checkoutCardDataState.f;
        }
        Boolean bool8 = bool4;
        if ((i & 64) != 0) {
            cardFieldType = checkoutCardDataState.g;
        }
        checkoutCardDataState.getClass();
        return new CheckoutCardDataState(str2, checkoutCardDetails2, bool5, bool6, bool7, bool8, cardFieldType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutCardDataState)) {
            return false;
        }
        CheckoutCardDataState checkoutCardDataState = (CheckoutCardDataState) obj;
        return Intrinsics.d(this.f1439a, checkoutCardDataState.f1439a) && Intrinsics.d(this.b, checkoutCardDataState.b) && Intrinsics.d(this.c, checkoutCardDataState.c) && Intrinsics.d(this.d, checkoutCardDataState.d) && Intrinsics.d(this.e, checkoutCardDataState.e) && Intrinsics.d(this.f, checkoutCardDataState.f) && this.g == checkoutCardDataState.g;
    }

    public final int hashCode() {
        String str = this.f1439a;
        int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Boolean bool = this.c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.e;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        CardFieldType cardFieldType = this.g;
        return iHashCode5 + (cardFieldType != null ? cardFieldType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutCardDataState(proceedBtnText=");
        sb.append(this.f1439a);
        sb.append(", checkoutCardDetails=");
        sb.append(this.b);
        sb.append(", isCardNumberValidationError=");
        hq0.u(sb, this.c, ", isExpiryValidationError=", this.d, ", isNewCardCvvValidationError=");
        hq0.u(sb, this.e, ", isCardNameValidationError=", this.f, ", fieldInFocus=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
