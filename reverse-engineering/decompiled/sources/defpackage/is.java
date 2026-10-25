package defpackage;

import android.content.res.AssetFileDescriptor;
import androidx.work.impl.utils.IdGenerator;
import com.airbnb.lottie.LottieCompositionFactory;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import in.juspay.airborne.ota.UpdateTask;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class is implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17087a;
    public final /* synthetic */ Object b;

    public /* synthetic */ is(Object obj, int i) {
        this.f17087a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17087a) {
            case 0:
                return ((ConfigStorageClient) this.b).read();
            case 1:
                return ((CrashlyticsCore) this.b).lambda$checkForPreviousCrash$10();
            case 2:
                return ((FirebaseInstallations) this.b).deleteFirebaseInstallationId();
            case 3:
                return IdGenerator.nextAlarmManagerId$lambda$1((IdGenerator) this.b);
            case 4:
                return LottieCompositionFactory.d((ByteArrayInputStream) this.b, null);
            case 5:
                return ((RemoteConfigComponent) this.b).getDefault();
            case 6:
                return (AssetFileDescriptor) this.b;
            default:
                return UpdateTask.run$lambda$1((UpdateTask) this.b);
        }
    }
}
