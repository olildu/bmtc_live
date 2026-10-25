package app.chalo.network.mock;

import defpackage.ti0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/network/mock/MockApiRuntimeOverride;", "", "Companion", "$serializer", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MockApiRuntimeOverride {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ti0(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApiSource f6489a;
    public final Map b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/network/mock/MockApiRuntimeOverride$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/network/mock/MockApiRuntimeOverride;", "serializer", "()Lkotlinx/serialization/KSerializer;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MockApiRuntimeOverride> serializer() {
            return MockApiRuntimeOverride$$serializer.f6490a;
        }
    }

    public /* synthetic */ MockApiRuntimeOverride(int i, ApiSource apiSource, Map map) {
        this.f6489a = (i & 1) == 0 ? ApiSource.REAL : apiSource;
        if ((i & 2) == 0) {
            this.b = MapsKt.d();
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MockApiRuntimeOverride)) {
            return false;
        }
        MockApiRuntimeOverride mockApiRuntimeOverride = (MockApiRuntimeOverride) obj;
        return this.f6489a == mockApiRuntimeOverride.f6489a && Intrinsics.d(this.b, mockApiRuntimeOverride.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6489a.hashCode() * 31);
    }

    public final String toString() {
        return "MockApiRuntimeOverride(apiSource=" + this.f6489a + ", routeVariants=" + this.b + ")";
    }

    public MockApiRuntimeOverride() {
        ApiSource apiSource = ApiSource.REAL;
        Map mapD = MapsKt.d();
        Intrinsics.i(apiSource, "apiSource");
        this.f6489a = apiSource;
        this.b = mapD;
    }
}
