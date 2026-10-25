package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.profileinstaller.ProfileInstaller;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.adjust.sdk.AdjustInstance;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.inmobi.media.C2740yc;
import com.inmobi.media.K9;
import so.plotline.insights.FlowViews.WebView.a;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Models.c0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19977a;
    public final /* synthetic */ Context b;

    public /* synthetic */ x1(Context context, int i) {
        this.f19977a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19977a) {
            case 0:
                AdjustInstance.lambda$setSendingReferrersAsNotSent$2(this.b);
                break;
            case 1:
                AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(this.b);
                break;
            case 2:
                AppCompatDelegate.syncRequestedAndStoredLocales(this.b);
                break;
            case 3:
                DtbOmSdkSessionManager.lambda$activateOMSDK$1(this.b);
                break;
            case 4:
                K9.a(this.b);
                break;
            case 5:
                ProfileInstallerInitializer.writeInBackground(this.b);
                break;
            case 6:
                ProfileInstaller.writeProfile(this.b);
                break;
            case 7:
                Context context = this.b;
                try {
                    DebugHelper.b();
                    c0 c0Var = new c0();
                    c0Var.l = "<html><body></body></html>";
                    new a(context, c0Var);
                } catch (Exception e) {
                    DebugHelper.a(e);
                    return;
                }
                break;
            case 8:
                C2740yc.b(this.b);
                break;
            default:
                C2740yc.d(this.b);
                break;
        }
    }
}
