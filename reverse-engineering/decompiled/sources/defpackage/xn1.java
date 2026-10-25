package defpackage;

import androidx.media3.common.util.Util;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xn1 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20038a;
    public final /* synthetic */ String b;

    public /* synthetic */ xn1(String str, int i) {
        this.f20038a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f20038a) {
            case 0:
                return Util.lambda$newSingleThreadExecutor$3(this.b, runnable);
            default:
                return Util.lambda$newSingleThreadScheduledExecutor$4(this.b, runnable);
        }
    }
}
