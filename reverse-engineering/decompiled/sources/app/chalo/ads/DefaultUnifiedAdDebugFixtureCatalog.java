package app.chalo.ads;

import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/DefaultUnifiedAdDebugFixtureCatalog;", "Lapp/chalo/ads/UnifiedAdDebugFixtureCatalog;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultUnifiedAdDebugFixtureCatalog implements UnifiedAdDebugFixtureCatalog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f763a;
    public final Function0 b;

    /* JADX INFO: renamed from: app.chalo.ads.DefaultUnifiedAdDebugFixtureCatalog$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<UnifiedAdDebugFixtureOverride> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f764a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, UnifiedAdDebugFixturesKt.class, "resolveLegacyHomeFixtureOverride", "resolveLegacyHomeFixtureOverride()Lapp/chalo/ads/UnifiedAdDebugFixtureOverride;", 1);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Float fValueOf = Float.valueOf(4.0f);
            switch (UnifiedAdDebugFixturesKt.WhenMappings.b[UnifiedAdDebugFixturesKt.b.ordinal()]) {
                case 1:
                    return null;
                case 2:
                    return new UnifiedAdDebugFixtureOverride(UnifiedAdDebugFixtureScenario.FORCE_FAILURE, null, 6);
                case 3:
                    return new UnifiedAdDebugFixtureOverride(UnifiedAdDebugFixtureScenario.FORCE_RENDERED, UnifiedAdDebugFixturesKt.a(1.8f, true, fValueOf, null, "Install Now"), 4);
                case 4:
                    return new UnifiedAdDebugFixtureOverride(UnifiedAdDebugFixtureScenario.FORCE_RENDERED, UnifiedAdDebugFixturesKt.a(1.8f, false, fValueOf, null, "Install Now"), 4);
                case 5:
                    return new UnifiedAdDebugFixtureOverride(UnifiedAdDebugFixtureScenario.FORCE_RENDERED, UnifiedAdDebugFixturesKt.a(1.8f, true, null, null, "Open"), 4);
                case 6:
                    return new UnifiedAdDebugFixtureOverride(UnifiedAdDebugFixtureScenario.FORCE_RENDERED, UnifiedAdDebugFixturesKt.a(1.8f, false, null, null, "Open"), 4);
                case 7:
                    return new UnifiedAdDebugFixtureOverride(UnifiedAdDebugFixtureScenario.FORCE_RENDERED, UnifiedAdDebugFixturesKt.a(0.8f, true, fValueOf, null, "Install Now"), 4);
                case 8:
                    return new UnifiedAdDebugFixtureOverride(UnifiedAdDebugFixtureScenario.FORCE_RENDERED, UnifiedAdDebugFixturesKt.a(0.8f, false, null, "Ad subtext", "Install Now"), 4);
                case 9:
                    return new UnifiedAdDebugFixtureOverride(UnifiedAdDebugFixtureScenario.FORCE_RENDERED, UnifiedAdDebugFixturesKt.a(0.8f, true, null, null, "Install Now"), 4);
                case 10:
                    return new UnifiedAdDebugFixtureOverride(UnifiedAdDebugFixtureScenario.FORCE_RENDERED, UnifiedAdDebugFixturesKt.a(0.8f, false, null, null, "Install Now"), 4);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public DefaultUnifiedAdDebugFixtureCatalog() {
        Map universalOverrides = UnifiedAdDebugFixturesKt.f836a;
        AnonymousClass1 legacyHomeOverrideProvider = AnonymousClass1.f764a;
        Intrinsics.i(universalOverrides, "universalOverrides");
        Intrinsics.i(legacyHomeOverrideProvider, "legacyHomeOverrideProvider");
        this.f763a = universalOverrides;
        this.b = legacyHomeOverrideProvider;
    }

    @Override // app.chalo.ads.UnifiedAdDebugFixtureCatalog
    public final UnifiedAdDebugFixtureOverride a(UnifiedAdRenderConfig config) {
        Intrinsics.i(config, "config");
        Map map = UnifiedAdDebugFixturesKt.f836a;
        UnifiedAdDebugFixtureTarget unifiedAdDebugFixtureTarget = new UnifiedAdDebugFixtureTarget(config.f851a.f852a, config.b);
        UnifiedAdDebugFixtureOverride unifiedAdDebugFixtureOverride = (UnifiedAdDebugFixtureOverride) this.f763a.get(unifiedAdDebugFixtureTarget);
        if (unifiedAdDebugFixtureOverride != null) {
            return unifiedAdDebugFixtureOverride;
        }
        if (Intrinsics.d(unifiedAdDebugFixtureTarget, new UnifiedAdDebugFixtureTarget(UnifiedAdSlot.HOME_TAB_UNIFIED_INLINE, UnifiedAdHostMode.INLINE))) {
            return (UnifiedAdDebugFixtureOverride) this.b.invoke();
        }
        return null;
    }
}
