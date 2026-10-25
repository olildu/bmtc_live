package app.chalo.productpurchase.productselection.data.models.api;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/productselection/data/models/api/UnknownProductFareMappingApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductFareMappingApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class UnknownProductFareMappingApiResponseModel$$serializer implements GeneratedSerializer<UnknownProductFareMappingApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UnknownProductFareMappingApiResponseModel$$serializer f8622a;
    private static final SerialDescriptor descriptor;

    static {
        UnknownProductFareMappingApiResponseModel$$serializer unknownProductFareMappingApiResponseModel$$serializer = new UnknownProductFareMappingApiResponseModel$$serializer();
        f8622a = unknownProductFareMappingApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.productselection.data.models.api.UnknownProductFareMappingApiResponseModel", unknownProductFareMappingApiResponseModel$$serializer, 20);
        pluginGeneratedSerialDescriptor.j("fmId", false);
        pluginGeneratedSerialDescriptor.j("subCatId", false);
        pluginGeneratedSerialDescriptor.j("proofs", false);
        pluginGeneratedSerialDescriptor.j("isRenewable", false);
        pluginGeneratedSerialDescriptor.j("verification", false);
        pluginGeneratedSerialDescriptor.j("isVisible", false);
        pluginGeneratedSerialDescriptor.j("durationId", false);
        pluginGeneratedSerialDescriptor.j("fare", false);
        pluginGeneratedSerialDescriptor.j("discountedFare", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("inactiveReason", false);
        pluginGeneratedSerialDescriptor.j("discountAdditionalInfo", false);
        pluginGeneratedSerialDescriptor.k(new ProductConfigApiResponseModel$SuperPassConfigApiResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(new String[]{"dInfo"}));
        pluginGeneratedSerialDescriptor.j("durationInfo", false);
        pluginGeneratedSerialDescriptor.k(new ProductConfigApiResponseModel$SuperPassConfigApiResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(new String[]{"info"}));
        pluginGeneratedSerialDescriptor.j("desc", false);
        pluginGeneratedSerialDescriptor.j("discountPercentage", false);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        pluginGeneratedSerialDescriptor.j("numOfTrips", false);
        pluginGeneratedSerialDescriptor.j("maxTripsPerDay", false);
        pluginGeneratedSerialDescriptor.j("maxPricePerTrip", false);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UnknownProductFareMappingApiResponseModel.u;
        IntSerializer intSerializer = IntSerializer.f18146a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(intSerializer);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c((KSerializer) lazyArr[2].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(LongSerializer.f18151a), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(DoubleSerializer.f18137a), BuiltinSerializersKt.c((KSerializer) lazyArr[19].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Integer num;
        Integer num2;
        String str;
        Integer num3;
        Long l;
        Boolean bool;
        String str2;
        List list;
        Boolean bool2;
        String str3;
        String str4;
        Boolean bool3;
        Double d;
        Integer num4;
        Integer num5;
        String str5;
        int i;
        Integer num6;
        String str6;
        Boolean bool4;
        List list2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UnknownProductFareMappingApiResponseModel.u;
        List list3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.f18151a, null);
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            Integer num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, intSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, intSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            Integer num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, intSerializer, null);
            Integer num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, intSerializer, null);
            num = num7;
            d = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, DoubleSerializer.f18137a, null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, (DeserializationStrategy) lazyArr[19].getValue(), null);
            bool2 = bool5;
            l = l2;
            bool4 = bool6;
            list = list4;
            str2 = str7;
            i = 1048575;
            num5 = num11;
            str4 = str8;
            num2 = num8;
            num3 = num9;
            bool = bool7;
            num4 = num12;
            str5 = str12;
            num6 = num10;
            str6 = str11;
            str = str10;
            str3 = str9;
            bool3 = bool8;
        } else {
            int i2 = 19;
            int i3 = 0;
            int i4 = 2;
            boolean z = true;
            Boolean bool9 = null;
            Integer num13 = null;
            String str13 = null;
            Integer num14 = null;
            Long l3 = null;
            Boolean bool10 = null;
            List list5 = null;
            Boolean bool11 = null;
            String str14 = null;
            String str15 = null;
            Boolean bool12 = null;
            String str16 = null;
            String str17 = null;
            Integer num15 = null;
            String str18 = null;
            Integer num16 = null;
            Integer num17 = null;
            Double d2 = null;
            Integer num18 = null;
            while (z) {
                int i5 = i2;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        str13 = str13;
                        i3 = i3;
                        bool9 = bool9;
                        i2 = 19;
                        i4 = 2;
                        d2 = d2;
                        break;
                    case 0:
                        num18 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.f18146a, num18);
                        i3 |= 1;
                        str13 = str13;
                        bool9 = bool9;
                        i2 = 19;
                        i4 = 2;
                        d2 = d2;
                        break;
                    case 1:
                        i3 |= 2;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str13);
                        bool9 = bool9;
                        i2 = 19;
                        i4 = 2;
                        d2 = d2;
                        break;
                    case 2:
                        d2 = d2;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), list5);
                        i3 |= 4;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 3:
                        d2 = d2;
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.f18123a, bool11);
                        i3 |= 8;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 4:
                        d2 = d2;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool9);
                        i3 |= 16;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 5:
                        d2 = d2;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, bool10);
                        i3 |= 32;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 6:
                        d2 = d2;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.f18151a, l3);
                        i3 |= 64;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 7:
                        d2 = d2;
                        num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, num13);
                        i3 |= 128;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 8:
                        d2 = d2;
                        num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.f18146a, num14);
                        i3 |= 256;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 9:
                        d2 = d2;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.f18123a, bool12);
                        i3 |= 512;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 10:
                        d2 = d2;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str15);
                        i3 |= 1024;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 11:
                        d2 = d2;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str14);
                        i3 |= 2048;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 12:
                        d2 = d2;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str16);
                        i3 |= 4096;
                        str17 = str17;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 13:
                        d2 = d2;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str17);
                        i3 |= 8192;
                        num15 = num15;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 14:
                        d2 = d2;
                        num15 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.f18146a, num15);
                        i3 |= 16384;
                        str18 = str18;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 15:
                        d2 = d2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str18);
                        i3 |= 32768;
                        num16 = num16;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 16:
                        d2 = d2;
                        num16 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.f18146a, num16);
                        i3 |= 65536;
                        num17 = num17;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 17:
                        d2 = d2;
                        num17 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.f18146a, num17);
                        i3 |= 131072;
                        str13 = str13;
                        i2 = 19;
                        d2 = d2;
                        break;
                    case 18:
                        i3 |= 262144;
                        list3 = list3;
                        i2 = 19;
                        d2 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, DoubleSerializer.f18137a, d2);
                        str13 = str13;
                        break;
                    case 19:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), list3);
                        i3 |= 524288;
                        i2 = i5;
                        str13 = str13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Double d3 = d2;
            num = num18;
            num2 = num13;
            str = str16;
            num3 = num14;
            l = l3;
            bool = bool10;
            str2 = str13;
            list = list5;
            bool2 = bool11;
            str3 = str14;
            str4 = str15;
            bool3 = bool12;
            d = d3;
            num4 = num17;
            num5 = num16;
            str5 = str18;
            i = i3;
            num6 = num15;
            str6 = str17;
            bool4 = bool9;
            list2 = list3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UnknownProductFareMappingApiResponseModel(i, num, str2, list, bool2, bool4, bool, l, num2, num3, bool3, str4, str3, str, str6, num6, str5, num5, num4, d, list2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        UnknownProductFareMappingApiResponseModel value = (UnknownProductFareMappingApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UnknownProductFareMappingApiResponseModel.u;
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, intSerializer, value.f8621a);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.c);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.f18151a, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, intSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, intSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, intSerializer, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, value.p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, intSerializer, value.q);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, intSerializer, value.r);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, DoubleSerializer.f18137a, value.s);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, (SerializationStrategy) lazyArr[19].getValue(), value.t);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
