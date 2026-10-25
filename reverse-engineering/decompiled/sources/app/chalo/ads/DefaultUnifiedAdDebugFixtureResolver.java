package app.chalo.ads;

import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.buildconfig.ChaloBuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/DefaultUnifiedAdDebugFixtureResolver;", "Lapp/chalo/ads/UnifiedAdDebugFixtureResolver;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultUnifiedAdDebugFixtureResolver implements UnifiedAdDebugFixtureResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIntegrationPolicyManager f765a;
    public final ChaloBuildConfig b;
    public final UnifiedAdDebugFixtureCatalog c;

    public DefaultUnifiedAdDebugFixtureResolver(SdkIntegrationPolicyManager sdkIntegrationPolicyManager, ChaloBuildConfig chaloBuildConfig, UnifiedAdDebugFixtureCatalog unifiedAdDebugFixtureCatalog) {
        this.f765a = sdkIntegrationPolicyManager;
        this.b = chaloBuildConfig;
        this.c = unifiedAdDebugFixtureCatalog;
    }

    @Override // app.chalo.ads.UnifiedAdDebugFixtureResolver
    public final UnifiedAdDebugFixtureSelection a(UnifiedAdRenderConfig config) {
        Intrinsics.i(config, "config");
        if (!this.f765a.f1078a.e) {
            return UnifiedAdDebugFixtureSelection.Off.f834a;
        }
        if (!this.b.n()) {
            return UnifiedAdDebugFixtureSelection.Off.f834a;
        }
        UnifiedAdDebugFixtureOverride unifiedAdDebugFixtureOverrideA = this.c.a(config);
        if (unifiedAdDebugFixtureOverrideA == null) {
            return UnifiedAdDebugFixtureSelection.Off.f834a;
        }
        Map map = UnifiedAdDebugFixturesKt.f836a;
        int i = UnifiedAdDebugFixturesKt.WhenMappings.f837a[unifiedAdDebugFixtureOverrideA.f830a.ordinal()];
        if (i == 1) {
            return UnifiedAdDebugFixtureSelection.Off.f834a;
        }
        if (i == 2) {
            return new UnifiedAdDebugFixtureSelection.ForceRendered(unifiedAdDebugFixtureOverrideA.b);
        }
        if (i == 3) {
            return new UnifiedAdDebugFixtureSelection.ForceFailure(unifiedAdDebugFixtureOverrideA.c);
        }
        throw new NoWhenBranchMatchedException();
    }
}
