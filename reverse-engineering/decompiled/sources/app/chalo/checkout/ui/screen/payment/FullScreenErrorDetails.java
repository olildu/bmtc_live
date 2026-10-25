package app.chalo.checkout.ui.screen.payment;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/FullScreenErrorDetails;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FullScreenErrorDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1513a;
    public final String b;
    public final IconType c;
    public final String d;

    public FullScreenErrorDetails(IconType placeholderImage, String message, String description, String actionBtnCopy) {
        Intrinsics.i(message, "message");
        Intrinsics.i(description, "description");
        Intrinsics.i(placeholderImage, "placeholderImage");
        Intrinsics.i(actionBtnCopy, "actionBtnCopy");
        this.f1513a = message;
        this.b = description;
        this.c = placeholderImage;
        this.d = actionBtnCopy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullScreenErrorDetails)) {
            return false;
        }
        FullScreenErrorDetails fullScreenErrorDetails = (FullScreenErrorDetails) obj;
        return Intrinsics.d(this.f1513a, fullScreenErrorDetails.f1513a) && Intrinsics.d(this.b, fullScreenErrorDetails.b) && this.c == fullScreenErrorDetails.c && Intrinsics.d(this.d, fullScreenErrorDetails.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f1513a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("FullScreenErrorDetails(message=", this.f1513a, ", description=", this.b, ", placeholderImage=");
        sbE.append(this.c);
        sbE.append(", actionBtnCopy=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
