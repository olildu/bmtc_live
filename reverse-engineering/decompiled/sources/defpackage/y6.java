package defpackage;

import android.content.Context;
import androidx.work.impl.Processor;
import com.airbnb.lottie.LottieCompositionFactory;
import com.inmobi.media.N4;
import com.inmobi.media.kd;
import in.juspay.airborne.LazyDownloadCallback;
import in.juspay.airborne.ota.ApplicationManager;
import in.juspay.airborne.ota.ReleaseConfig;
import in.juspay.airborne.ota.UpdateTask;
import in.juspay.airborne.services.TempWriter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y6 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20079a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y6(int i, Object obj, Object obj2, Object obj3) {
        this.f20079a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f20079a) {
            case 0:
                return ApplicationManager.loadApplication$lambda$1((ApplicationManager) this.c, (String) this.b, (LazyDownloadCallback) this.d);
            case 1:
                return LottieCompositionFactory.c((Context) this.c, (InputStream) this.d, (String) this.b);
            case 2:
                return ((Processor) this.c).lambda$startWork$0((ArrayList) this.d, (String) this.b);
            case 3:
                return UpdateTask.downloadPackageUpdate$lambda$14$lambda$13((ReleaseConfig.Split) this.c, (UpdateTask) this.b, (TempWriter) this.d);
            case 4:
                return UpdateTask.copyFilesAsync$lambda$28$lambda$25$lambda$24((TempWriter) this.c, (String) this.b, (String) this.d);
            default:
                return kd.a((kd) this.c, (String) this.b, (N4) this.d);
        }
    }

    public /* synthetic */ y6(int i, String str, Object obj, Object obj2) {
        this.f20079a = i;
        this.c = obj;
        this.d = obj2;
        this.b = str;
    }
}
