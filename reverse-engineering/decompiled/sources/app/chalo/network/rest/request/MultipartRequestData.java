package app.chalo.network.rest.request;

import defpackage.ti0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/network/rest/request/MultipartRequestData;", "Lapp/chalo/network/rest/request/GenericRequestData;", "Companion", "$serializer", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class MultipartRequestData extends GenericRequestData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] u;
    public MultipartRequestFormDataType s;
    public MultipartRequestFormDataType t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/network/rest/request/MultipartRequestData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/network/rest/request/MultipartRequestData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MultipartRequestData> serializer() {
            return MultipartRequestData$$serializer.f6517a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ti0(25)), LazyKt.a(lazyThreadSafetyMode, new ti0(26)), LazyKt.a(lazyThreadSafetyMode, new ti0(27)), null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ti0(28)), LazyKt.a(lazyThreadSafetyMode, new ti0(29))};
    }
}
