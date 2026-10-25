package app.chalo.network.mock;

import app.chalo.network.config.ChaloJson;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/network/mock/MockApiLocalOverrideResolver;", "", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MockApiLocalOverrideResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MockApiFixtureLoader f6477a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/network/mock/MockApiLocalOverrideResolver$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public MockApiLocalOverrideResolver(MockApiFixtureLoader mockApiFixtureLoader) {
        this.f6477a = mockApiFixtureLoader;
    }

    public final MockApiRuntimeOverride a() {
        Object objA;
        String strA = this.f6477a.a("mock-api/local/override.json");
        if (strA == null) {
            MockApiRuntimeOverride mockApiRuntimeOverride = MockApiLocalOverrideResolverKt.f6478a;
            String lowerCase = mockApiRuntimeOverride.f6489a.name().toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            MockApiRuntimeLogger.b("MockApiLocalOverride", "local override file missing; using tracked clean default apiSource=" + lowerCase + " routes=" + CollectionsKt.u0(mockApiRuntimeOverride.b.keySet()));
            return mockApiRuntimeOverride;
        }
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objA = (MockApiRuntimeOverride) json.b(strA, MockApiRuntimeOverride.INSTANCE.serializer());
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (!(objA instanceof Result.Failure)) {
            MockApiRuntimeOverride mockApiRuntimeOverride2 = (MockApiRuntimeOverride) objA;
            String lowerCase2 = mockApiRuntimeOverride2.f6489a.name().toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase2, "toLowerCase(...)");
            MockApiRuntimeLogger.b("MockApiLocalOverride", "loaded local override from mock-api/local/override.json apiSource=" + lowerCase2 + " routes=" + CollectionsKt.u0(mockApiRuntimeOverride2.b.keySet()));
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            MockApiRuntimeLogger.a("MockApiLocalOverride", "failed to decode local override from mock-api/local/override.json; using tracked clean default error=" + thA.getMessage());
        }
        if (Result.a(objA) != null) {
            objA = MockApiLocalOverrideResolverKt.f6478a;
        }
        return (MockApiRuntimeOverride) objA;
    }
}
