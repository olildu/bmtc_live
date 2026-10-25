package app.chalo.network.mock;

import defpackage.d;
import defpackage.ti0;
import defpackage.vo1;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/network/mock/MockApiCustomResponse;", "", "Companion", "$serializer", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MockApiCustomResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ti0(18)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6475a;
    public final Map b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/network/mock/MockApiCustomResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/network/mock/MockApiCustomResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MockApiCustomResponse> serializer() {
            return MockApiCustomResponse$$serializer.f6476a;
        }
    }

    public /* synthetic */ MockApiCustomResponse(String str, int i, int i2, Map map) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(MockApiCustomResponse$$serializer.f6476a.getDescriptor(), i, 1);
            throw null;
        }
        this.f6475a = i2;
        if ((i & 2) == 0) {
            this.b = MapsKt.d();
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MockApiCustomResponse)) {
            return false;
        }
        MockApiCustomResponse mockApiCustomResponse = (MockApiCustomResponse) obj;
        return this.f6475a == mockApiCustomResponse.f6475a && Intrinsics.d(this.b, mockApiCustomResponse.b) && Intrinsics.d(this.c, mockApiCustomResponse.c);
    }

    public final int hashCode() {
        int iF = d.f(this.b, this.f6475a * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MockApiCustomResponse(httpStatusCode=");
        sb.append(this.f6475a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", body=");
        return vo1.p(sb, this.c, ")");
    }
}
