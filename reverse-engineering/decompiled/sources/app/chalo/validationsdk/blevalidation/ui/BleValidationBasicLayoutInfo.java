package app.chalo.validationsdk.blevalidation.ui;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationBasicLayoutInfo;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BleValidationBasicLayoutInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10566a;
    public final String b;
    public final ProductDetailsDisplayData c;
    public final String d;
    public final String e;
    public final boolean f;

    public BleValidationBasicLayoutInfo(String bleValidationGifUrl, String hashCode, ProductDetailsDisplayData productData, String referenceCodeTitle, String referenceCode, boolean z) {
        Intrinsics.i(bleValidationGifUrl, "bleValidationGifUrl");
        Intrinsics.i(hashCode, "hashCode");
        Intrinsics.i(productData, "productData");
        Intrinsics.i(referenceCodeTitle, "referenceCodeTitle");
        Intrinsics.i(referenceCode, "referenceCode");
        this.f10566a = bleValidationGifUrl;
        this.b = hashCode;
        this.c = productData;
        this.d = referenceCodeTitle;
        this.e = referenceCode;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleValidationBasicLayoutInfo)) {
            return false;
        }
        BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo = (BleValidationBasicLayoutInfo) obj;
        return Intrinsics.d(this.f10566a, bleValidationBasicLayoutInfo.f10566a) && Intrinsics.d(this.b, bleValidationBasicLayoutInfo.b) && Intrinsics.d(this.c, bleValidationBasicLayoutInfo.c) && Intrinsics.d(this.d, bleValidationBasicLayoutInfo.d) && Intrinsics.d(this.e, bleValidationBasicLayoutInfo.e) && this.f == bleValidationBasicLayoutInfo.f;
    }

    public final int hashCode() {
        return ((((this.e.hashCode() + nf1.e((this.c.hashCode() + nf1.e(this.f10566a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31) + 1231) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("BleValidationBasicLayoutInfo(bleValidationGifUrl=", this.f10566a, ", hashCode=", this.b, ", productData=");
        sbE.append(this.c);
        sbE.append(", referenceCodeTitle=");
        sbE.append(this.d);
        sbE.append(", referenceCode=");
        sbE.append(this.e);
        sbE.append(", shouldShowTicketDetails=true, shouldShowUnableToVerifyTapHereSection=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
