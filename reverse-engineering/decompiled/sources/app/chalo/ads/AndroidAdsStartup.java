package app.chalo.ads;

import android.content.Context;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.buildconfig.ChaloBuildConfig;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/AndroidAdsStartup;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidAdsStartup {
    public static final List f = CollectionsKt.R("1576AEEFA7D3835C2BD78A332B4877AC");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIntegrationPolicyManager f744a;
    public final Context b;
    public final ChaloBuildConfig c;
    public final Lazy d;
    public final MobileAdsStartupClient e = DefaultMobileAdsStartupClient.f762a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ads/AndroidAdsStartup$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "TEST_DEVICE_IDS", "Ljava/util/List;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AndroidAdsStartup(SdkIntegrationPolicyManager sdkIntegrationPolicyManager, Context context, ChaloBuildConfig chaloBuildConfig, Lazy lazy) {
        this.f744a = sdkIntegrationPolicyManager;
        this.b = context;
        this.c = chaloBuildConfig;
        this.d = lazy;
    }

    public final void a(CoroutineScope scope) {
        Intrinsics.i(scope, "scope");
        if (this.f744a.f1078a.e) {
            BuildersKt.d(scope, null, null, new AndroidAdsStartup$startIfPermitted$1(this, null), 3);
        }
    }
}
