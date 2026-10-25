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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigFareMappingApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigFareMappingApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassProductConfigFareMappingApiResponseModel$$serializer implements GeneratedSerializer<SuperPassProductConfigFareMappingApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassProductConfigFareMappingApiResponseModel$$serializer f8614a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassProductConfigFareMappingApiResponseModel$$serializer superPassProductConfigFareMappingApiResponseModel$$serializer = new SuperPassProductConfigFareMappingApiResponseModel$$serializer();
        f8614a = superPassProductConfigFareMappingApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.productselection.data.models.api.SuperPassProductConfigFareMappingApiResponseModel", superPassProductConfigFareMappingApiResponseModel$$serializer, 21);
        pluginGeneratedSerialDescriptor.j("desc", false);
        pluginGeneratedSerialDescriptor.j("fmId", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("subCatId", false);
        pluginGeneratedSerialDescriptor.j("isVisible", false);
        pluginGeneratedSerialDescriptor.j("durationId", false);
        pluginGeneratedSerialDescriptor.j("numOfTrips", false);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        pluginGeneratedSerialDescriptor.j("isRenewable", false);
        pluginGeneratedSerialDescriptor.j("verification", false);
        pluginGeneratedSerialDescriptor.j("maxTripsPerDay", false);
        pluginGeneratedSerialDescriptor.j("maxPricePerTrip", false);
        pluginGeneratedSerialDescriptor.j("isProofRequired", false);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        pluginGeneratedSerialDescriptor.j("fareInfo", false);
        pluginGeneratedSerialDescriptor.j("dInfo", false);
        pluginGeneratedSerialDescriptor.j("proofs", false);
        pluginGeneratedSerialDescriptor.j("inactiveReason", false);
        pluginGeneratedSerialDescriptor.j("durationInfo", false);
        pluginGeneratedSerialDescriptor.k(new ProductConfigApiResponseModel$SuperPassConfigApiResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(new String[]{"info"}));
        pluginGeneratedSerialDescriptor.j("tags", false);
        pluginGeneratedSerialDescriptor.j("appliedRules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassProductConfigFareMappingApiResponseModel.v;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(intSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, kSerializerC2, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(LongSerializer.f18151a), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(DoubleSerializer.f18137a), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[13].getValue()), BuiltinSerializersKt.c(SuperPassProductFareInfoApiResponseModel$$serializer.f8618a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[16].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[19].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[20].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        Boolean bool;
        Integer num;
        Long l;
        Boolean bool2;
        Integer num2;
        Boolean bool3;
        String str2;
        Double d;
        Integer num3;
        Boolean bool4;
        String str3;
        String str4;
        List list;
        String str5;
        int i;
        List list2;
        SuperPassProductFareInfoApiResponseModel superPassProductFareInfoApiResponseModel;
        String str6;
        List list3;
        Boolean bool5;
        List list4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassProductConfigFareMappingApiResponseModel.v;
        List list5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, intSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.f18151a, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            Double d2 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, DoubleSerializer.f18137a, null);
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            SuperPassProductFareInfoApiResponseModel superPassProductFareInfoApiResponseModel2 = (SuperPassProductFareInfoApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, SuperPassProductFareInfoApiResponseModel$$serializer.f8618a, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (DeserializationStrategy) lazyArr[16].getValue(), null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, (DeserializationStrategy) lazyArr[19].getValue(), null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), null);
            str6 = str11;
            bool5 = bool7;
            bool3 = bool6;
            num2 = num4;
            i = 2097151;
            bool2 = bool10;
            str5 = str10;
            str3 = str9;
            num = num5;
            bool = bool8;
            str2 = str8;
            list = list7;
            l = l2;
            superPassProductFareInfoApiResponseModel = superPassProductFareInfoApiResponseModel2;
            str = str7;
            list3 = list6;
            d = d2;
            num3 = num6;
            bool4 = bool9;
        } else {
            int i2 = 20;
            int i3 = 0;
            boolean z = true;
            Boolean bool11 = null;
            Integer num7 = null;
            Boolean bool12 = null;
            Integer num8 = null;
            Long l3 = null;
            Boolean bool13 = null;
            String str12 = null;
            Double d3 = null;
            Integer num9 = null;
            Boolean bool14 = null;
            String str13 = null;
            Boolean bool15 = null;
            List list8 = null;
            SuperPassProductFareInfoApiResponseModel superPassProductFareInfoApiResponseModel3 = null;
            String str14 = null;
            List list9 = null;
            String str15 = null;
            String str16 = null;
            List list10 = null;
            String str17 = null;
            while (z) {
                int i4 = i2;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = i3;
                        list5 = list5;
                        bool11 = bool11;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 0:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str17);
                        i3 |= 1;
                        num7 = num7;
                        list5 = list5;
                        bool11 = bool11;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 1:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.f18146a, num7);
                        i3 |= 2;
                        list5 = list5;
                        bool11 = bool11;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 2:
                        str16 = str16;
                        bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.f18123a, bool13);
                        i3 |= 4;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 3:
                        str16 = str16;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str12);
                        i3 |= 8;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 4:
                        str16 = str16;
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool11);
                        i3 |= 16;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 5:
                        str16 = str16;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.f18151a, l3);
                        i3 |= 32;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 6:
                        str16 = str16;
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.f18146a, num8);
                        i3 |= 64;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 7:
                        str16 = str16;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str13);
                        i3 |= 128;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 8:
                        str16 = str16;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool12);
                        i3 |= 256;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 9:
                        str16 = str16;
                        bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.f18123a, bool14);
                        i3 |= 512;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 10:
                        str16 = str16;
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.f18146a, num9);
                        i3 |= 1024;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 11:
                        str16 = str16;
                        d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, DoubleSerializer.f18137a, d3);
                        i3 |= 2048;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 12:
                        num7 = num7;
                        str16 = str16;
                        bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.f18123a, bool15);
                        i3 |= 4096;
                        list5 = list5;
                        list8 = list8;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 13:
                        num7 = num7;
                        str16 = str16;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), list8);
                        i3 |= 8192;
                        list5 = list5;
                        superPassProductFareInfoApiResponseModel3 = superPassProductFareInfoApiResponseModel3;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 14:
                        str16 = str16;
                        superPassProductFareInfoApiResponseModel3 = (SuperPassProductFareInfoApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, SuperPassProductFareInfoApiResponseModel$$serializer.f8618a, superPassProductFareInfoApiResponseModel3);
                        i3 |= 16384;
                        str14 = str14;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 15:
                        str16 = str16;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str14);
                        i3 |= 32768;
                        list9 = list9;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 16:
                        num7 = num7;
                        str16 = str16;
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (DeserializationStrategy) lazyArr[16].getValue(), list9);
                        i3 |= 65536;
                        list5 = list5;
                        str15 = str15;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 17:
                        str16 = str16;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str15);
                        i3 |= 131072;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        str16 = str16;
                        break;
                    case 18:
                        i3 |= 262144;
                        list5 = list5;
                        list10 = list10;
                        i2 = 20;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str16);
                        num7 = num7;
                        break;
                    case 19:
                        list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, (DeserializationStrategy) lazyArr[19].getValue(), list10);
                        i3 |= 524288;
                        list5 = list5;
                        num7 = num7;
                        i2 = 20;
                        break;
                    case 20:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), list5);
                        i3 |= 1048576;
                        i2 = i4;
                        num7 = num7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str17;
            bool = bool12;
            num = num8;
            l = l3;
            bool2 = bool15;
            num2 = num7;
            bool3 = bool13;
            str2 = str12;
            d = d3;
            num3 = num9;
            bool4 = bool14;
            str3 = str13;
            str4 = str16;
            list = list9;
            str5 = str14;
            i = i3;
            list2 = list5;
            superPassProductFareInfoApiResponseModel = superPassProductFareInfoApiResponseModel3;
            str6 = str15;
            list3 = list8;
            bool5 = bool11;
            list4 = list10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassProductConfigFareMappingApiResponseModel(i, str, num2, bool3, str2, bool5, l, num, str3, bool, bool4, num3, d, bool2, list3, superPassProductFareInfoApiResponseModel, str5, list, str6, str4, list4, list2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassProductConfigFareMappingApiResponseModel value = (SuperPassProductConfigFareMappingApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassProductConfigFareMappingApiResponseModel.v;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        String str = value.f8613a;
        List list = value.u;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, str);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, intSerializer, value.b);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.f18151a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, intSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, intSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, DoubleSerializer.f18137a, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, SuperPassProductFareInfoApiResponseModel$$serializer.f8618a, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, value.p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, (SerializationStrategy) lazyArr[16].getValue(), value.q);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, value.r);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, value.s);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, (SerializationStrategy) lazyArr[19].getValue(), value.t);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
