package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20230a;
    public final /* synthetic */ CrashlyticsCore b;
    public final /* synthetic */ SettingsProvider c;

    public /* synthetic */ zt(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider, int i) {
        this.f20230a = i;
        this.b = crashlyticsCore;
        this.c = settingsProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20230a) {
            case 0:
                this.b.lambda$doBackgroundInitializationAsync$0(this.c);
                break;
            default:
                this.b.lambda$finishInitSynchronously$9(this.c);
                break;
        }
    }
}
