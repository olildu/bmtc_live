package app.chalo.sos.feature;

import app.chalo.crashlytics.CrashlyticsLogger;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/sos/feature/DefaultSosDelegate;", "Lapp/chalo/sos/feature/SosFeaturePlatformDelegate;", "Lorg/koin/core/component/KoinComponent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DefaultSosDelegate implements SosFeaturePlatformDelegate, KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DefaultSosDelegate f9429a;
    public static final Object b;

    static {
        final DefaultSosDelegate defaultSosDelegate = new DefaultSosDelegate();
        f9429a = defaultSosDelegate;
        b = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<CrashlyticsLogger>() { // from class: app.chalo.sos.feature.DefaultSosDelegate$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KoinComponent koinComponent = defaultSosDelegate;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CrashlyticsLogger.class), null, null);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.sos.feature.SosFeaturePlatformDelegate
    public final Object a(Continuation continuation) {
        ((CrashlyticsLogger) b.getValue()).i(new IllegalStateException("SosFeaturePlatformDelegate not set"));
        return new SosPickContactResult.Error("Invalid delegate assigned");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.sos.feature.SosFeaturePlatformDelegate
    public final boolean b(String msg, List contacts) {
        Intrinsics.i(contacts, "contacts");
        Intrinsics.i(msg, "msg");
        ((CrashlyticsLogger) b.getValue()).i(new IllegalStateException("SosFeaturePlatformDelegate not set"));
        return false;
    }
}
