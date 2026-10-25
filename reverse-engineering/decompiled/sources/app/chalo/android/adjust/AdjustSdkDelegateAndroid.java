package app.chalo.android.adjust;

import android.content.Context;
import app.chalo.features.adjust.AdjustConstants;
import app.chalo.features.adjust.AdjustSdkDelegate;
import app.chalo.features.adjust.CommonAdjustConfig;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.LogLevel;
import defpackage.iz0;
import defpackage.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/android/adjust/AdjustSdkDelegateAndroid;", "Lapp/chalo/features/adjust/AdjustSdkDelegate;", "androidApp_bmtcPrimaryRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdjustSdkDelegateAndroid implements AdjustSdkDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f944a;

    public AdjustSdkDelegateAndroid(Context context) {
        this.f944a = context;
    }

    @Override // app.chalo.features.adjust.AdjustSdkDelegate
    public final void a(CommonAdjustConfig commonAdjustConfig) {
        LogLevel logLevel;
        AdjustConfig adjustConfig = new AdjustConfig(this.f944a, commonAdjustConfig.f2626a, AdjustConfig.ENVIRONMENT_PRODUCTION, true);
        int i = AdjustSdkDelegate_androidKt.WhenMappings.f945a[commonAdjustConfig.b.ordinal()];
        if (i == 1) {
            logLevel = LogLevel.SUPPRESS;
        } else if (i == 2) {
            logLevel = LogLevel.VERBOSE;
        } else if (i == 3) {
            logLevel = LogLevel.DEBUG;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            logLevel = LogLevel.INFO;
        }
        adjustConfig.setLogLevel(logLevel);
        if (AdjustSdkDelegate_androidKt.WhenMappings.b[commonAdjustConfig.c.f2624a.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        adjustConfig.setUrlStrategy(AdjustConstants.f2622a, true, false);
        adjustConfig.setOnDeferredDeeplinkResponseListener(new p(commonAdjustConfig));
        adjustConfig.setOnAttributionChangedListener(new iz0(commonAdjustConfig, 5));
        Adjust.initSdk(adjustConfig);
    }

    @Override // app.chalo.features.adjust.AdjustSdkDelegate
    public final void b(String str) {
        Adjust.trackEvent(new AdjustEvent(str));
    }

    @Override // app.chalo.features.adjust.AdjustSdkDelegate
    public final void c(double d, String eventToken) {
        Intrinsics.i(eventToken, "eventToken");
        AdjustEvent adjustEvent = new AdjustEvent(eventToken);
        adjustEvent.setRevenue(d, "INR");
        Adjust.trackEvent(adjustEvent);
    }
}
