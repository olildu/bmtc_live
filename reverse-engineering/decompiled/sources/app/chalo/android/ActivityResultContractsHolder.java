package app.chalo.android;

import androidx.activity.result.contract.ActivityResultContracts;
import app.chalo.crashlytics.CrashlyticsLogger;
import com.canhub.cropper.CropImageContract;
import defpackage.bh0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/android/ActivityResultContractsHolder;", "", "androidApp_bmtcPrimaryRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivityResultContractsHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsLogger f883a;
    public final SafeActivityResultLauncher b;
    public final SafeActivityResultLauncher c;
    public final SafeActivityResultLauncher d;
    public final SafeActivityResultLauncher e;
    public final SafeActivityResultLauncher f;
    public final SafeActivityResultLauncher g;
    public final SafeActivityResultLauncher h;
    public final SafeActivityResultLauncher i;
    public final SafeActivityResultLauncher j;

    public ActivityResultContractsHolder(MainActivity mainActivity, CrashlyticsLogger crashlyticsLogger, bh0 bh0Var, bh0 bh0Var2, bh0 bh0Var3, bh0 bh0Var4, bh0 bh0Var5, bh0 bh0Var6, bh0 bh0Var7, bh0 bh0Var8, bh0 bh0Var9) {
        Intrinsics.i(crashlyticsLogger, "crashlyticsLogger");
        this.f883a = crashlyticsLogger;
        this.b = new SafeActivityResultLauncher(mainActivity, crashlyticsLogger, mainActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), bh0Var));
        this.c = new SafeActivityResultLauncher(mainActivity, crashlyticsLogger, mainActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), bh0Var2));
        this.d = new SafeActivityResultLauncher(mainActivity, crashlyticsLogger, mainActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), bh0Var3));
        this.e = new SafeActivityResultLauncher(mainActivity, crashlyticsLogger, mainActivity.registerForActivityResult(new CropImageContract(), bh0Var4));
        this.f = new SafeActivityResultLauncher(mainActivity, crashlyticsLogger, mainActivity.registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), bh0Var5));
        this.g = new SafeActivityResultLauncher(mainActivity, crashlyticsLogger, mainActivity.registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), bh0Var6));
        this.h = new SafeActivityResultLauncher(mainActivity, crashlyticsLogger, mainActivity.registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), bh0Var7));
        this.i = new SafeActivityResultLauncher(mainActivity, crashlyticsLogger, mainActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), bh0Var8));
        this.j = new SafeActivityResultLauncher(mainActivity, crashlyticsLogger, mainActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), bh0Var9));
    }
}
