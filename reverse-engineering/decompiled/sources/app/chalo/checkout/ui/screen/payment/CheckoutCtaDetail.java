package app.chalo.checkout.ui.screen.payment;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CheckoutCtaDetail;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckoutCtaDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringEnum f1509a;
    public final IconType b;
    public final Function0 c;

    public CheckoutCtaDetail(StringEnum ctaText, IconType iconType, Function0 function0) {
        Intrinsics.i(ctaText, "ctaText");
        this.f1509a = ctaText;
        this.b = iconType;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutCtaDetail)) {
            return false;
        }
        CheckoutCtaDetail checkoutCtaDetail = (CheckoutCtaDetail) obj;
        return this.f1509a == checkoutCtaDetail.f1509a && this.b == checkoutCtaDetail.b && Intrinsics.d(this.c, checkoutCtaDetail.c);
    }

    public final int hashCode() {
        int iHashCode = this.f1509a.hashCode() * 31;
        IconType iconType = this.b;
        return this.c.hashCode() + ((iHashCode + (iconType == null ? 0 : iconType.hashCode())) * 31);
    }

    public final String toString() {
        return "CheckoutCtaDetail(ctaText=" + this.f1509a + ", ctaIcon=" + this.b + ", ctaAction=" + this.c + ")";
    }
}
