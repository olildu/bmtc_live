package app.chalo.location;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/location/LatLngSerializer;", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/location/LatLng;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LatLngSerializer implements KSerializer<LatLng> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LatLngSerializer f5136a = new LatLngSerializer();
    public static final SerialDescriptor b = LatLngSurrogate.INSTANCE.serializer().getDescriptor();

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        LatLngSurrogate latLngSurrogate = (LatLngSurrogate) decoder.decodeSerializableValue(LatLngSurrogate.INSTANCE.serializer());
        return new LatLng(latLngSurrogate.f5137a, latLngSurrogate.b);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        LatLng value = (LatLng) obj;
        Intrinsics.i(value, "value");
        encoder.encodeSerializableValue(LatLngSurrogate.INSTANCE.serializer(), new LatLngSurrogate(value.f5134a, value.b));
    }
}
