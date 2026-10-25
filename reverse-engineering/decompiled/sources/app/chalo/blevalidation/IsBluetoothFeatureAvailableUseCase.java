package app.chalo.blevalidation;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.helper.AppPackageManager;
import app.chalo.helper.ChaloPackageManagerHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/blevalidation/IsBluetoothFeatureAvailableUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IsBluetoothFeatureAvailableUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f1146a;
    public final ChaloPackageManagerHelper b;

    public IsBluetoothFeatureAvailableUseCase(AnalyticsContract analyticsContract, ChaloPackageManagerHelper chaloPackageManagerHelper) {
        this.f1146a = analyticsContract;
        this.b = chaloPackageManagerHelper;
    }

    public final boolean a() {
        boolean zA = this.b.a(AppPackageManager.FEATURE_BLUETOOTH_LE);
        if (!zA) {
            AnalyticsContract.DefaultImpls.a(this.f1146a, "ble hardware not available on device", "", null, null, false, 28);
        }
        return zA;
    }
}
