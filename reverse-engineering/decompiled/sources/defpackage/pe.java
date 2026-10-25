package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.media3.datasource.DataSourceBitmapLoader;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieCompositionFactory;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.remoteconfig.CustomSignals;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import in.juspay.airborne.ota.ReleaseConfig;
import in.juspay.airborne.ota.UpdateTask;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pe implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19027a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pe(int i, Object obj, Object obj2) {
        this.f19027a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f19027a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                throw null;
            case 1:
                return ((ConfigCacheClient) obj2).lambda$put$0((ConfigContainer) obj);
            case 2:
                return ((DataSourceBitmapLoader) obj2).lambda$decodeBitmap$1((byte[]) obj);
            case 3:
                return ((DataSourceBitmapLoader) obj2).lambda$loadBitmap$2((Uri) obj);
            case 4:
                return FcmBroadcastProcessor.lambda$startMessagingService$0((Context) obj2, (Intent) obj);
            case 5:
                return ((FirebaseRemoteConfig) obj2).lambda$setCustomSignals$8((CustomSignals) obj);
            case 6:
                return ((FirebaseRemoteConfig) obj2).lambda$setConfigSettingsAsync$5((FirebaseRemoteConfigSettings) obj);
            case 7:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj2;
                String str = (String) obj;
                if (!lottieAnimationView.j) {
                    return LottieCompositionFactory.b(lottieAnimationView.getContext(), str, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = LottieCompositionFactory.f12125a;
                return LottieCompositionFactory.b(context, str, "asset_" + str);
            default:
                return UpdateTask.runInternal$lambda$2((UpdateTask) obj2, (ReleaseConfig) obj);
        }
    }
}
