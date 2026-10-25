package app.chalo.network.mock;

import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/network/mock/ApiSourceJsonSerializer;", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/network/mock/ApiSource;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApiSourceJsonSerializer implements KSerializer<ApiSource> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ApiSourceJsonSerializer f6471a = new ApiSourceJsonSerializer();
    public static final PrimitiveSerialDescriptor b = SerialDescriptorsKt.a("ApiSource", PrimitiveKind.STRING.f18109a);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        ApiSource next;
        Intrinsics.i(decoder, "decoder");
        ApiSource.Companion companion = ApiSource.INSTANCE;
        String strDecodeString = decoder.decodeString();
        companion.getClass();
        Iterator<ApiSource> it = ApiSource.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt.x(next.name(), strDecodeString, true));
        ApiSource apiSource = next;
        if (apiSource != null) {
            return apiSource;
        }
        throw new IllegalArgumentException("Unknown ApiSource value");
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ApiSource value = (ApiSource) obj;
        Intrinsics.i(value, "value");
        String lowerCase = value.name().toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        encoder.encodeString(lowerCase);
    }
}
