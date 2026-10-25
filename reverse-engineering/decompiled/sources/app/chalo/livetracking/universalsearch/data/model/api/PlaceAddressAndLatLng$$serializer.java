package app.chalo.livetracking.universalsearch.data.model.api;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/universalsearch/data/model/api/PlaceAddressAndLatLng.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/universalsearch/data/model/api/PlaceAddressAndLatLng;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PlaceAddressAndLatLng$$serializer implements GeneratedSerializer<PlaceAddressAndLatLng> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PlaceAddressAndLatLng$$serializer f4974a;
    private static final SerialDescriptor descriptor;

    static {
        PlaceAddressAndLatLng$$serializer placeAddressAndLatLng$$serializer = new PlaceAddressAndLatLng$$serializer();
        f4974a = placeAddressAndLatLng$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.universalsearch.data.model.api.PlaceAddressAndLatLng", placeAddressAndLatLng$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("formatted_address", true);
        pluginGeneratedSerialDescriptor.j("geometry", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(StringSerializer.f18170a), BuiltinSerializersKt.c(PlaceGeometry$$serializer.f4978a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        PlaceGeometry placeGeometry;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            placeGeometry = (PlaceGeometry) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PlaceGeometry$$serializer.f4978a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            PlaceGeometry placeGeometry2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    placeGeometry2 = (PlaceGeometry) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PlaceGeometry$$serializer.f4978a, placeGeometry2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            placeGeometry = placeGeometry2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PlaceAddressAndLatLng(i, str, placeGeometry);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PlaceAddressAndLatLng value = (PlaceAddressAndLatLng) obj;
        Intrinsics.i(value, "value");
        PlaceGeometry placeGeometry = value.b;
        String str = value.f4973a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || placeGeometry != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, PlaceGeometry$$serializer.f4978a, placeGeometry);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
