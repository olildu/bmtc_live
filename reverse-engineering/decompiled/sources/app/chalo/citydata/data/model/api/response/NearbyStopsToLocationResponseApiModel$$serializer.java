package app.chalo.citydata.data.model.api.response;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/citydata/data/model/api/response/NearbyStopsToLocationResponseApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/citydata/data/model/api/response/NearbyStopsToLocationResponseApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class NearbyStopsToLocationResponseApiModel$$serializer implements GeneratedSerializer<NearbyStopsToLocationResponseApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NearbyStopsToLocationResponseApiModel$$serializer f1667a;
    private static final SerialDescriptor descriptor;

    static {
        NearbyStopsToLocationResponseApiModel$$serializer nearbyStopsToLocationResponseApiModel$$serializer = new NearbyStopsToLocationResponseApiModel$$serializer();
        f1667a = nearbyStopsToLocationResponseApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.citydata.data.model.api.response.NearbyStopsToLocationResponseApiModel", nearbyStopsToLocationResponseApiModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("stop_lon", true);
        pluginGeneratedSerialDescriptor.j("stop_id", true);
        pluginGeneratedSerialDescriptor.j("stop_lat", true);
        pluginGeneratedSerialDescriptor.j("stop_address", true);
        pluginGeneratedSerialDescriptor.j("station_type", true);
        pluginGeneratedSerialDescriptor.j("stop_name", true);
        pluginGeneratedSerialDescriptor.j("distance", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(doubleSerializer);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{kSerializerC, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(doubleSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(IntSerializer.f18146a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Integer num;
        Double d;
        String str;
        Double d2;
        String str2;
        String str3;
        String str4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        Double d3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
            Double d4 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, doubleSerializer, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Double d5 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            d2 = d5;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.f18146a, null);
            str4 = str8;
            str2 = str6;
            str3 = str7;
            i = 127;
            str = str5;
            d = d4;
        } else {
            boolean z = true;
            int i3 = 0;
            Integer num2 = null;
            String str9 = null;
            Double d6 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, DoubleSerializer.f18137a, d3);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str9);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        d6 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, d6);
                        i3 |= 4;
                        break;
                    case 3:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str10);
                        i3 |= 8;
                        break;
                    case 4:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str11);
                        i3 |= 16;
                        break;
                    case 5:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str12);
                        i3 |= 32;
                        break;
                    case 6:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.f18146a, num2);
                        i3 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            num = num2;
            d = d3;
            str = str9;
            d2 = d6;
            str2 = str10;
            str3 = str11;
            str4 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NearbyStopsToLocationResponseApiModel(i, d, str, d2, str2, str3, str4, num);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        NearbyStopsToLocationResponseApiModel value = (NearbyStopsToLocationResponseApiModel) obj;
        Intrinsics.i(value, "value");
        Integer num = value.g;
        String str = value.f;
        String str2 = value.e;
        String str3 = value.d;
        Double d = value.c;
        String str4 = value.b;
        Double d2 = value.f1666a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || d2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, DoubleSerializer.f18137a, d2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || d != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, d);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.f18146a, num);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
