package app.chalo.helper;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/helper/ChaloPackageManagerHelperAndroid;", "Lapp/chalo/helper/ChaloPackageManagerHelper;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloPackageManagerHelperAndroid implements ChaloPackageManagerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2828a;

    public ChaloPackageManagerHelperAndroid(Context context) {
        this.f2828a = context;
    }

    @Override // app.chalo.helper.ChaloPackageManagerHelper
    public final boolean a(AppPackageManager feature) {
        Intrinsics.i(feature, "feature");
        PackageManager packageManager = this.f2828a.getPackageManager();
        if (ChaloPackageManagerHelper_androidKt.WhenMappings.f2829a[feature.ordinal()] == 1) {
            return packageManager.hasSystemFeature("android.hardware.bluetooth_le");
        }
        throw new NoWhenBranchMatchedException();
    }
}
