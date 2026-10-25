package app.chalo.checkout.utility;

import app.chalo.checkout.data.model.ui.PaymentLogo;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/utility/InstalledUpiApp;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstalledUpiApp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1615a;
    public final String b;
    public final PaymentLogo c;

    public InstalledUpiApp(String packageName, String appName, PaymentLogo.PlatformDrawable platformDrawable) {
        Intrinsics.i(packageName, "packageName");
        Intrinsics.i(appName, "appName");
        this.f1615a = packageName;
        this.b = appName;
        this.c = platformDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstalledUpiApp)) {
            return false;
        }
        InstalledUpiApp installedUpiApp = (InstalledUpiApp) obj;
        return Intrinsics.d(this.f1615a, installedUpiApp.f1615a) && Intrinsics.d(this.b, installedUpiApp.b) && Intrinsics.d(this.c, installedUpiApp.c);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1615a.hashCode() * 31, 31, this.b);
        PaymentLogo paymentLogo = this.c;
        return iE + (paymentLogo == null ? 0 : paymentLogo.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstalledUpiApp(packageName=", this.f1615a, ", appName=", this.b, ", logo=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
