package app.chalo.validationsdk.blevalidation.nfc;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.utils.PlatformFeature;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/nfc/NoOpDeviceNfcTapPaySuppressor;", "Lapp/chalo/validationsdk/blevalidation/nfc/DeviceNfcTapPaySuppressor;", "Lorg/koin/core/component/KoinComponent;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoOpDeviceNfcTapPaySuppressor implements DeviceNfcTapPaySuppressor, KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NoOpDeviceNfcTapPaySuppressor f10564a;
    public static final Object b;

    static {
        final NoOpDeviceNfcTapPaySuppressor noOpDeviceNfcTapPaySuppressor = new NoOpDeviceNfcTapPaySuppressor();
        f10564a = noOpDeviceNfcTapPaySuppressor;
        b = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<CrashlyticsLogger>() { // from class: app.chalo.validationsdk.blevalidation.nfc.NoOpDeviceNfcTapPaySuppressor$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeviceNfcTapPaySuppressor deviceNfcTapPaySuppressor = this.f10565a;
                return (deviceNfcTapPaySuppressor instanceof KoinScopeComponent ? ((KoinScopeComponent) deviceNfcTapPaySuppressor).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CrashlyticsLogger.class), null, null);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressor
    public final void disable() {
        float f = PlatformFeature.f10436a;
        ((CrashlyticsLogger) b.getValue()).i(new IllegalStateException("DeviceNfcTapPaySuppressor not specified and disable called"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressor
    public final void enable() {
        float f = PlatformFeature.f10436a;
        ((CrashlyticsLogger) b.getValue()).i(new IllegalStateException("DeviceNfcTapPaySuppressor not specified and enable called"));
    }
}
