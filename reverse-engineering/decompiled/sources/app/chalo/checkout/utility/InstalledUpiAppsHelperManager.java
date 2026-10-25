package app.chalo.checkout.utility;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/utility/InstalledUpiAppsHelperManager;", "Lapp/chalo/checkout/utility/InstalledUpiAppsHelperProvider;", "Lapp/chalo/checkout/utility/InstalledUpiAppsHelperSetter;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstalledUpiAppsHelperManager implements InstalledUpiAppsHelperProvider, InstalledUpiAppsHelperSetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lazy f1625a;

    @Override // app.chalo.checkout.utility.InstalledUpiAppsHelperSetter
    public final void a(Lazy helper) {
        Intrinsics.i(helper, "helper");
        this.f1625a = helper;
    }

    @Override // app.chalo.checkout.utility.InstalledUpiAppsHelperProvider
    public final InstalledUpiAppsHelper b() {
        Lazy lazy = this.f1625a;
        if (lazy != null) {
            return (InstalledUpiAppsHelper) lazy.getValue();
        }
        return null;
    }

    @Override // app.chalo.checkout.utility.InstalledUpiAppsHelperSetter
    public final void remove() {
        this.f1625a = null;
    }
}
