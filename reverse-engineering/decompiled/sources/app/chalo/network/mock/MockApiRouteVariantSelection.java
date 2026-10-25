package app.chalo.network.mock;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteVariantSelection;", "", "Companion", "$serializer", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MockApiRouteVariantSelection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MockApiVariant f6487a;
    public final MockApiCustomResponse b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/network/mock/MockApiRouteVariantSelection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/network/mock/MockApiRouteVariantSelection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MockApiRouteVariantSelection> serializer() {
            return MockApiRouteVariantSelection$$serializer.f6488a;
        }
    }

    public /* synthetic */ MockApiRouteVariantSelection(int i, MockApiVariant mockApiVariant, MockApiCustomResponse mockApiCustomResponse) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(MockApiRouteVariantSelection$$serializer.f6488a.getDescriptor(), i, 1);
            throw null;
        }
        this.f6487a = mockApiVariant;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = mockApiCustomResponse;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MockApiRouteVariantSelection)) {
            return false;
        }
        MockApiRouteVariantSelection mockApiRouteVariantSelection = (MockApiRouteVariantSelection) obj;
        return this.f6487a == mockApiRouteVariantSelection.f6487a && Intrinsics.d(this.b, mockApiRouteVariantSelection.b);
    }

    public final int hashCode() {
        int iHashCode = this.f6487a.hashCode() * 31;
        MockApiCustomResponse mockApiCustomResponse = this.b;
        return iHashCode + (mockApiCustomResponse == null ? 0 : mockApiCustomResponse.hashCode());
    }

    public final String toString() {
        return "MockApiRouteVariantSelection(variant=" + this.f6487a + ", customResponse=" + this.b + ")";
    }
}
