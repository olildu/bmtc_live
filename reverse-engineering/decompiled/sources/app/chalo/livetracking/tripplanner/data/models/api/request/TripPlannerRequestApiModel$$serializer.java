package app.chalo.livetracking.tripplanner.data.models.api.request;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/tripplanner/data/models/api/request/TripPlannerRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/api/request/TripPlannerRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TripPlannerRequestApiModel$$serializer implements GeneratedSerializer<TripPlannerRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TripPlannerRequestApiModel$$serializer f4650a;
    private static final SerialDescriptor descriptor;

    static {
        TripPlannerRequestApiModel$$serializer tripPlannerRequestApiModel$$serializer = new TripPlannerRequestApiModel$$serializer();
        f4650a = tripPlannerRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.tripplanner.data.models.api.request.TripPlannerRequestApiModel", tripPlannerRequestApiModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("fromLat", false);
        pluginGeneratedSerialDescriptor.j("fromLon", false);
        pluginGeneratedSerialDescriptor.j("toLat", false);
        pluginGeneratedSerialDescriptor.j("toLon", false);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("startTimeMillis", false);
        pluginGeneratedSerialDescriptor.j("fromStopId", false);
        pluginGeneratedSerialDescriptor.j("toStopId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(doubleSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(doubleSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(doubleSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(doubleSerializer);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, stringSerializer, LongSerializer.f18151a, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        Double d;
        Double d2;
        Double d3;
        Double d4;
        String str3;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        Double d5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
            Double d6 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, doubleSerializer, null);
            Double d7 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, doubleSerializer, null);
            Double d8 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, null);
            Double d9 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, doubleSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            d4 = d9;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str2 = str4;
            i = 255;
            str3 = strDecodeStringElement;
            d3 = d8;
            d2 = d7;
            d = d6;
            j = jDecodeLongElement;
        } else {
            boolean z = true;
            int i3 = 0;
            String str5 = null;
            String str6 = null;
            Double d10 = null;
            String strDecodeStringElement2 = null;
            long jDecodeLongElement2 = 0;
            Double d11 = null;
            Double d12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        break;
                    case 0:
                        d5 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, DoubleSerializer.f18137a, d5);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        d11 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DoubleSerializer.f18137a, d11);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        d12 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, d12);
                        i3 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        d10 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, DoubleSerializer.f18137a, d10);
                        i3 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str6);
                        i3 |= 64;
                        break;
                    case 7:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str5);
                        i3 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str5;
            str2 = str6;
            d = d5;
            d2 = d11;
            d3 = d12;
            d4 = d10;
            str3 = strDecodeStringElement2;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TripPlannerRequestApiModel(i, d, d2, d3, d4, str3, j, str2, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TripPlannerRequestApiModel value = (TripPlannerRequestApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, doubleSerializer, value.f4649a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, doubleSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, doubleSerializer, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, value.f);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
