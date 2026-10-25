package defpackage;

import android.content.Context;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ya0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20092a;
    public final /* synthetic */ AdManagerAdView b;

    public /* synthetic */ ya0(AdManagerAdView adManagerAdView, int i) {
        this.f20092a = i;
        this.b = adManagerAdView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20092a) {
            case 0:
                final LifecycleResumePauseEffectScope LifecycleResumeEffect = (LifecycleResumePauseEffectScope) obj;
                Intrinsics.i(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
                final AdManagerAdView adManagerAdView = this.b;
                adManagerAdView.resume();
                return new LifecyclePauseOrDisposeEffectResult(LifecycleResumeEffect, adManagerAdView) { // from class: app.chalo.ads.InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$lambda$14$0$$inlined$onPauseOrDispose$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ AdManagerAdView f791a;

                    {
                        this.f791a = adManagerAdView;
                    }

                    @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
                    public final void runPauseOrOnDisposeEffect() {
                        this.f791a.pause();
                    }
                };
            default:
                Context it = (Context) obj;
                Intrinsics.i(it, "it");
                return this.b;
        }
    }
}
