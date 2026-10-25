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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/productselection/data/models/api/UnknownProductCategoryApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductCategoryApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class UnknownProductCategoryApiResponseModel$$serializer implements GeneratedSerializer<UnknownProductCategoryApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UnknownProductCategoryApiResponseModel$$serializer f8620a;
    private static final SerialDescriptor descriptor;

    static {
        UnknownProductCategoryApiResponseModel$$serializer unknownProductCategoryApiResponseModel$$serializer = new UnknownProductCategoryApiResponseModel$$serializer();
        f8620a = unknownProductCategoryApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.productselection.data.models.api.UnknownProductCategoryApiResponseModel", unknownProductCategoryApiResponseModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("displayOrder", false);
        pluginGeneratedSerialDescriptor.k(new ProductConfigApiResponseModel$SuperPassConfigApiResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(new String[]{"displayorder"}));
        pluginGeneratedSerialDescriptor.j("proofs", false);
        pluginGeneratedSerialDescriptor.j("pos", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("isRenewable", false);
        pluginGeneratedSerialDescriptor.j("documentsDesc", false);
        pluginGeneratedSerialDescriptor.j("isVerificationRequired", false);
        pluginGeneratedSerialDescriptor.k(new ProductConfigApiResponseModel$SuperPassConfigApiResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(new String[]{"verification"}));
        pluginGeneratedSerialDescriptor.j("info", false);
        pluginGeneratedSerialDescriptor.j("maxIssueCount", false);
        pluginGeneratedSerialDescriptor.j("inactiveReason", false);
        pluginGeneratedSerialDescriptor.j("maxPricePerTrip", false);
        pluginGeneratedSerialDescriptor.j("maxTripsPerDay", false);
        pluginGeneratedSerialDescriptor.j("infoNote", false);
        pluginGeneratedSerialDescriptor.j("isVisible", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UnknownProductCategoryApiResponseModel.q;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(intSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c((KSerializer) lazyArr[3].getValue());
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(intSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(booleanSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        Boolean bool;
        Boolean bool2;
        Integer num;
        String str2;
        Integer num2;
        Integer num3;
        String str3;
        Boolean bool3;
        String str4;
        String str5;
        String str6;
        Integer num4;
        List list;
        Boolean bool4;
        Integer num5;
        List list2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UnknownProductCategoryApiResponseModel.q;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            Integer num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, intSerializer, null);
            Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, intSerializer, null);
            i = 65535;
            num5 = num10;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            num4 = num6;
            num = num7;
            str6 = str9;
            str = str8;
            bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, null);
            str3 = str11;
            str5 = str10;
            bool2 = bool6;
            bool = bool5;
            bool3 = bool7;
            num2 = num9;
            str4 = str12;
            num3 = num8;
            list = list3;
        } else {
            int i2 = 3;
            boolean z = true;
            i = 0;
            Integer num11 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Integer num12 = null;
            List list4 = null;
            Integer num13 = null;
            Integer num14 = null;
            String str13 = null;
            Boolean bool11 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            Integer num15 = null;
            while (z) {
                List list5 = list4;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list2 = list5;
                        z = false;
                        list4 = list2;
                        bool8 = bool8;
                        num11 = num11;
                        i2 = 3;
                        break;
                    case 0:
                        list2 = list5;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str16);
                        i |= 1;
                        str17 = str17;
                        list4 = list2;
                        bool8 = bool8;
                        num11 = num11;
                        i2 = 3;
                        break;
                    case 1:
                        list2 = list5;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str17);
                        i |= 2;
                        num15 = num15;
                        list4 = list2;
                        bool8 = bool8;
                        num11 = num11;
                        i2 = 3;
                        break;
                    case 2:
                        list2 = list5;
                        num15 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.f18146a, num15);
                        i |= 4;
                        list4 = list2;
                        bool8 = bool8;
                        num11 = num11;
                        i2 = 3;
                        break;
                    case 3:
                        Integer num16 = num11;
                        DeserializationStrategy deserializationStrategy = (DeserializationStrategy) lazyArr[i2].getValue();
                        int i3 = i2;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, deserializationStrategy, list5);
                        i |= 8;
                        i2 = i3;
                        bool8 = bool8;
                        num11 = num16;
                        break;
                    case 4:
                        num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.f18146a, num12);
                        i |= 16;
                        num11 = num11;
                        list4 = list5;
                        break;
                    case 5:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, bool9);
                        i |= 32;
                        list4 = list5;
                        num12 = num12;
                        break;
                    case 6:
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, bool10);
                        i |= 64;
                        list4 = list5;
                        num12 = num12;
                        break;
                    case 7:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str15);
                        i |= 128;
                        list4 = list5;
                        num12 = num12;
                        break;
                    case 8:
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool11);
                        i |= 256;
                        list4 = list5;
                        num12 = num12;
                        break;
                    case 9:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str13);
                        i |= 512;
                        list4 = list5;
                        num12 = num12;
                        break;
                    case 10:
                        num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.f18146a, num14);
                        i |= 1024;
                        list4 = list5;
                        num12 = num12;
                        break;
                    case 11:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str14);
                        i |= 2048;
                        list4 = list5;
                        num12 = num12;
                        break;
                    case 12:
                        num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.f18146a, num13);
                        i |= 4096;
                        list4 = list5;
                        num12 = num12;
                        break;
                    case 13:
                        num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.f18146a, num11);
                        i |= 8192;
                        list4 = list5;
                        num12 = num12;
                        break;
                    case 14:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str7);
                        i |= 16384;
                        list4 = list5;
                        num12 = num12;
                        break;
                    case 15:
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.f18123a, bool8);
                        i |= 32768;
                        list4 = list5;
                        num12 = num12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str16;
            bool = bool9;
            bool2 = bool10;
            num = num12;
            str2 = str7;
            num2 = num13;
            num3 = num14;
            str3 = str13;
            bool3 = bool11;
            str4 = str14;
            str5 = str15;
            str6 = str17;
            num4 = num15;
            list = list4;
            bool4 = bool8;
            num5 = num11;
        }
        int i4 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UnknownProductCategoryApiResponseModel(i4, str, str6, num4, list, num, bool, bool2, str5, bool3, str3, num3, str4, num2, num5, str2, bool4);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        UnknownProductCategoryApiResponseModel value = (UnknownProductCategoryApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UnknownProductCategoryApiResponseModel.q;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f8619a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, intSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, intSerializer, value.e);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, intSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, intSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, intSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, value.p);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
