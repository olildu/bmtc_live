package app.chalo.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import defpackage.t;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/DefaultMobileAdsStartupClient;", "Lapp/chalo/ads/MobileAdsStartupClient;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DefaultMobileAdsStartupClient implements MobileAdsStartupClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DefaultMobileAdsStartupClient f762a = new DefaultMobileAdsStartupClient();

    @Override // app.chalo.ads.MobileAdsStartupClient
    public final void a(RequestConfiguration requestConfiguration) {
        MobileAds.setRequestConfiguration(requestConfiguration);
    }

    @Override // app.chalo.ads.MobileAdsStartupClient
    public final void b(Context context, final t tVar) {
        MobileAds.initialize(context, new OnInitializationCompleteListener() { // from class: ux
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus status) {
                Intrinsics.i(status, "status");
                tVar.invoke(CollectionsKt.O(status.getAdapterStatusMap().entrySet(), null, null, null, new nw(12), 31));
            }
        });
    }
}
