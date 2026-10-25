package app.chalo.models.mticketing;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/mticketing/MTicketPassengerInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/mticketing/MTicketPassengerInfo;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MTicketPassengerInfo$$serializer implements GeneratedSerializer<MTicketPassengerInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MTicketPassengerInfo$$serializer f5622a;
    private static final SerialDescriptor descriptor;

    static {
        MTicketPassengerInfo$$serializer mTicketPassengerInfo$$serializer = new MTicketPassengerInfo$$serializer();
        f5622a = mTicketPassengerInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.mticketing.MTicketPassengerInfo", mTicketPassengerInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("_fare", false);
        pluginGeneratedSerialDescriptor.j("_totalFare", true);
        pluginGeneratedSerialDescriptor.j("_discountPercentage", false);
        pluginGeneratedSerialDescriptor.j("_passengerCount", false);
        pluginGeneratedSerialDescriptor.j("_addMap", true);
        pluginGeneratedSerialDescriptor.j("_subMap", true);
        pluginGeneratedSerialDescriptor.j("_roundingLogic", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MTicketPassengerInfo.h;
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(doubleSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue());
        KSerializer kSerializerC3 = BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue());
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{doubleSerializer, kSerializerC, doubleSerializer, intSerializer, kSerializerC2, kSerializerC3, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        Map map;
        Map map2;
        int i;
        int i2;
        double d;
        Double d2;
        double d3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicketPassengerInfo.h;
        int i3 = 6;
        int i4 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 0);
            Double d4 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DoubleSerializer.f18137a, null);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            Map map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            d2 = d4;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            i = iDecodeIntElement2;
            map2 = map3;
            i2 = 127;
            d = dDecodeDoubleElement2;
            d3 = dDecodeDoubleElement;
        } else {
            boolean z = true;
            int iDecodeIntElement3 = 0;
            Map map4 = null;
            Double d5 = null;
            double dDecodeDoubleElement3 = 0.0d;
            int iDecodeIntElement4 = 0;
            int i5 = 0;
            Map map5 = null;
            double dDecodeDoubleElement4 = 0.0d;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 6;
                        break;
                    case 0:
                        dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                        i5 |= 1;
                        i3 = 6;
                        i4 = 3;
                        break;
                    case 1:
                        d5 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DoubleSerializer.f18137a, d5);
                        i5 |= 2;
                        i3 = 6;
                        i4 = 3;
                        break;
                    case 2:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i5 |= 8;
                        break;
                    case 4:
                        map5 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), map5);
                        i5 |= 16;
                        break;
                    case 5:
                        map4 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), map4);
                        i5 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i3);
                        i5 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement3;
            map = map4;
            map2 = map5;
            i = iDecodeIntElement4;
            i2 = i5;
            d = dDecodeDoubleElement4;
            d2 = d5;
            d3 = dDecodeDoubleElement3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MTicketPassengerInfo(i2, d3, d2, d, i, map2, map, iDecodeIntElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MTicketPassengerInfo value = (MTicketPassengerInfo) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicketPassengerInfo.h;
        double d = value.f5621a;
        int i = value.g;
        Map map = value.f;
        Map map2 = value.e;
        Double d2 = value.b;
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 0, d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || d2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, DoubleSerializer.f18137a, d2);
        }
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || map2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), map2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || map != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), map);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 6, i);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
