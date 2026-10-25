package app.chalo.crashlytics;

import app.chalo.Device;
import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import co.touchlab.crashkios.crashlytics.CrashlyticsKotlin;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/crashlytics/CrashlyticsLoggerImpl;", "Lapp/chalo/crashlytics/CrashlyticsLogger;", "Lapp/chalo/network/NetworkCrashlyticsLogger;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CrashlyticsLoggerImpl implements CrashlyticsLogger, NetworkCrashlyticsLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Device f2308a;
    public final CityProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/crashlytics/CrashlyticsLoggerImpl$Companion;", "", "", "USER_ID", "Ljava/lang/String;", "USER_CITY", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CrashlyticsLoggerImpl(Device device, CityProvider cityProvider) {
        this.f2308a = device;
        this.b = cityProvider;
        c();
    }

    @Override // app.chalo.crashlytics.CrashlyticsLogger, app.chalo.network.NetworkCrashlyticsLogger
    public final void a(String str, String str2) {
        g(new CrashlyticsLog(str, str2));
    }

    @Override // app.chalo.crashlytics.CrashlyticsLogger, app.chalo.network.NetworkCrashlyticsLogger
    public final void b(Throwable th) {
        i(th);
    }

    @Override // app.chalo.crashlytics.CrashlyticsLogger
    public final void c() {
        String deviceId = this.f2308a.getDeviceId();
        if (StringsKt.F(deviceId)) {
            deviceId = null;
        }
        if (deviceId != null) {
            CrashlyticsKotlin.f11351a.getClass();
            CrashlyticsKotlin.a().a(deviceId);
            e("USER_ID", deviceId);
        }
        CityAppModel cityAppModel = (CityAppModel) this.b.getE().getValue();
        if (cityAppModel != null) {
            e("USER_CITY", cityAppModel.f8854a);
        }
    }

    @Override // app.chalo.crashlytics.CrashlyticsLogger
    public final void d(CrashlyticsLoggingException crashlyticsLoggingException) {
        CrashlyticsKotlin.f11351a.getClass();
        CrashlyticsKotlin.a().c(crashlyticsLoggingException);
    }

    @Override // app.chalo.crashlytics.CrashlyticsLogger
    public final void e(String str, String keyValue) {
        Intrinsics.i(keyValue, "keyValue");
        if (str.length() <= 0 || keyValue.length() <= 0) {
            return;
        }
        CrashlyticsKotlin.f11351a.getClass();
        CrashlyticsKotlin.a().b(str, keyValue);
    }

    @Override // app.chalo.crashlytics.CrashlyticsLogger
    public final void f(CrashlyticsLoggingException crashlyticsLoggingException, CrashlyticsLog crashlyticsLog) {
        g(crashlyticsLog);
        i(crashlyticsLoggingException);
    }

    @Override // app.chalo.crashlytics.CrashlyticsLogger
    public final void g(CrashlyticsLog crashlyticsLog) {
        Intrinsics.i(crashlyticsLog, "crashlyticsLog");
        CrashlyticsKotlin crashlyticsKotlin = CrashlyticsKotlin.f11351a;
        String message = crashlyticsLog.f2307a + ":" + crashlyticsLog.b;
        crashlyticsKotlin.getClass();
        Intrinsics.i(message, "message");
        CrashlyticsKotlin.a().d(message);
    }

    @Override // app.chalo.crashlytics.CrashlyticsLogger
    public final void h(Exception exc, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g((CrashlyticsLog) it.next());
        }
        i(exc);
    }

    @Override // app.chalo.crashlytics.CrashlyticsLogger
    public final void i(Throwable th) {
        if (th != null) {
            CrashlyticsKotlin.f11351a.getClass();
            CrashlyticsKotlin.a().c(th);
        }
    }
}
