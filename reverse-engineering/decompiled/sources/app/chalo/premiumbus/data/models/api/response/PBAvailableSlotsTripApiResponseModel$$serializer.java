package app.chalo.premiumbus.data.models.api.response;

import java.util.List;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/api/response/PBAvailableSlotsTripApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PBAvailableSlotsTripApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PBAvailableSlotsTripApiResponseModel$$serializer implements GeneratedSerializer<PBAvailableSlotsTripApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PBAvailableSlotsTripApiResponseModel$$serializer f7027a;
    private static final SerialDescriptor descriptor;

    static {
        PBAvailableSlotsTripApiResponseModel$$serializer pBAvailableSlotsTripApiResponseModel$$serializer = new PBAvailableSlotsTripApiResponseModel$$serializer();
        f7027a = pBAvailableSlotsTripApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsTripApiResponseModel", pBAvailableSlotsTripApiResponseModel$$serializer, 17);
        pluginGeneratedSerialDescriptor.j("fromStopId", false);
        pluginGeneratedSerialDescriptor.j("toStopId", false);
        pluginGeneratedSerialDescriptor.j("tripId", false);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("fromStopTime", false);
        pluginGeneratedSerialDescriptor.j("toStopTime", false);
        pluginGeneratedSerialDescriptor.j("vehicleCapacity", false);
        pluginGeneratedSerialDescriptor.j("availableSeats", false);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        pluginGeneratedSerialDescriptor.j("originalFromStopTime", false);
        pluginGeneratedSerialDescriptor.j("tripStatus", false);
        pluginGeneratedSerialDescriptor.j("slotStatus", false);
        pluginGeneratedSerialDescriptor.j("vehicleNumber", false);
        pluginGeneratedSerialDescriptor.j("seatAssignmentType", false);
        pluginGeneratedSerialDescriptor.j("applicableRules", false);
        pluginGeneratedSerialDescriptor.j("multiSeatAllowed", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PBAvailableSlotsTripApiResponseModel.r;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(longSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[9].getValue()), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[15].getValue()), BuiltinSerializersKt.c(BooleanSerializer.f18123a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        Long l;
        String str3;
        Boolean bool;
        String str4;
        Long l2;
        List list;
        Integer num;
        Long l3;
        String str5;
        Integer num2;
        String str6;
        String str7;
        String str8;
        List list2;
        Integer num3;
        String str9;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBAvailableSlotsTripApiResponseModel.r;
        String str10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, longSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, intSerializer, null);
            str = str12;
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, longSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, intSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), null);
            i = 131071;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.f18123a, null);
            num3 = num6;
            l2 = l6;
            str2 = str11;
            str4 = str16;
            num = num4;
            l3 = l5;
            l = l4;
            str7 = str14;
            str6 = str13;
            num2 = num5;
            str8 = str15;
            str3 = str18;
            list2 = list4;
            str5 = str17;
            list = list3;
        } else {
            boolean z = true;
            i = 0;
            Integer num7 = null;
            List list5 = null;
            Long l7 = null;
            String str19 = null;
            Boolean bool2 = null;
            String str20 = null;
            Long l8 = null;
            List list6 = null;
            Integer num8 = null;
            Long l9 = null;
            String str21 = null;
            Integer num9 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            while (z) {
                String str26 = str19;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str26;
                        z = false;
                        str19 = str9;
                        list5 = list5;
                        num7 = num7;
                        break;
                    case 0:
                        str9 = str26;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str22);
                        i |= 1;
                        str23 = str23;
                        str19 = str9;
                        list5 = list5;
                        num7 = num7;
                        break;
                    case 1:
                        str9 = str26;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str23);
                        i |= 2;
                        str24 = str24;
                        str19 = str9;
                        list5 = list5;
                        num7 = num7;
                        break;
                    case 2:
                        str9 = str26;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str24);
                        i |= 4;
                        str25 = str25;
                        str19 = str9;
                        list5 = list5;
                        num7 = num7;
                        break;
                    case 3:
                        str9 = str26;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str25);
                        i |= 8;
                        str19 = str9;
                        list5 = list5;
                        num7 = num7;
                        break;
                    case 4:
                        num7 = num7;
                        list5 = list5;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str26);
                        i |= 16;
                        list5 = list5;
                        num7 = num7;
                        break;
                    case 5:
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.f18151a, l7);
                        i |= 32;
                        num7 = num7;
                        str19 = str26;
                        break;
                    case 6:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.f18151a, l9);
                        i |= 64;
                        str19 = str26;
                        l7 = l7;
                        break;
                    case 7:
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, num8);
                        i |= 128;
                        str19 = str26;
                        l7 = l7;
                        break;
                    case 8:
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.f18146a, num9);
                        i |= 256;
                        str19 = str26;
                        l7 = l7;
                        break;
                    case 9:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), list6);
                        i |= 512;
                        str19 = str26;
                        l7 = l7;
                        break;
                    case 10:
                        l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.f18151a, l8);
                        i |= 1024;
                        str19 = str26;
                        l7 = l7;
                        break;
                    case 11:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str20);
                        i |= 2048;
                        str19 = str26;
                        l7 = l7;
                        break;
                    case 12:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str21);
                        i |= 4096;
                        str19 = str26;
                        l7 = l7;
                        break;
                    case 13:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str10);
                        i |= 8192;
                        str19 = str26;
                        l7 = l7;
                        break;
                    case 14:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.f18146a, num7);
                        i |= 16384;
                        str19 = str26;
                        l7 = l7;
                        break;
                    case 15:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), list5);
                        i |= 32768;
                        str19 = str26;
                        l7 = l7;
                        break;
                    case 16:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.f18123a, bool2);
                        i |= 65536;
                        str19 = str26;
                        l7 = l7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str23;
            str2 = str22;
            l = l7;
            str3 = str10;
            bool = bool2;
            str4 = str20;
            l2 = l8;
            list = list6;
            num = num8;
            l3 = l9;
            str5 = str21;
            num2 = num9;
            str6 = str24;
            str7 = str25;
            str8 = str19;
            list2 = list5;
            num3 = num7;
        }
        int i2 = i;
        String str27 = str;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PBAvailableSlotsTripApiResponseModel(i2, str2, str27, str6, str7, str8, l, l3, num, num2, list, l2, str4, str5, str3, num3, list2, bool);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PBAvailableSlotsTripApiResponseModel value = (PBAvailableSlotsTripApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBAvailableSlotsTripApiResponseModel.r;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f7026a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.e);
        LongSerializer longSerializer = LongSerializer.f18151a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, longSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, longSerializer, value.g);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, intSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, intSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, longSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, intSerializer, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), value.p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.f18123a, value.q);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
