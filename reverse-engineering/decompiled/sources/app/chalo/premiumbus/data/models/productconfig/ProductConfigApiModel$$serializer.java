package app.chalo.premiumbus.data.models.productconfig;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/productconfig/ProductConfigApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/productconfig/ProductConfigApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductConfigApiModel$$serializer implements GeneratedSerializer<ProductConfigApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductConfigApiModel$$serializer f7151a;
    private static final SerialDescriptor descriptor;

    static {
        ProductConfigApiModel$$serializer productConfigApiModel$$serializer = new ProductConfigApiModel$$serializer();
        f7151a = productConfigApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.productconfig.ProductConfigApiModel", productConfigApiModel$$serializer, 19);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("categories", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("desc", false);
        pluginGeneratedSerialDescriptor.j("finalBeneficiary", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("intermediateBeneficiary", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("isVisible", false);
        pluginGeneratedSerialDescriptor.j("maxAppVer", false);
        pluginGeneratedSerialDescriptor.j("minAppVer", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("revenueRecognitionLogic", false);
        pluginGeneratedSerialDescriptor.j("settlementType", false);
        pluginGeneratedSerialDescriptor.j("terms", false);
        pluginGeneratedSerialDescriptor.j("label", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ProductConfigApiModel.t;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(BrandingApiModel$$serializer.f7145a);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c((KSerializer) lazyArr[2].getValue());
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC10 = BuiltinSerializersKt.c(booleanSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, kSerializerC10, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[17].getValue()), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        Integer num;
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num2;
        Boolean bool;
        Boolean bool2;
        String str7;
        BrandingApiModel brandingApiModel;
        List list2;
        String str8;
        String str9;
        String str10;
        String str11;
        int i;
        String str12;
        int i2;
        String str13;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductConfigApiModel.t;
        String str14 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            BrandingApiModel brandingApiModel2 = (BrandingApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BrandingApiModel$$serializer.f7145a, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (DeserializationStrategy) lazyArr[17].getValue(), null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            i = 524287;
            str9 = str17;
            list2 = list3;
            brandingApiModel = brandingApiModel2;
            str = str15;
            str8 = str16;
            bool = bool4;
            str7 = str20;
            str11 = str19;
            str10 = str18;
            str6 = str21;
            bool2 = bool3;
            str5 = str24;
            str12 = str23;
            str4 = str22;
            num = num4;
            str3 = str25;
            num2 = num3;
        } else {
            int i3 = 2;
            boolean z = true;
            int i4 = 0;
            String str26 = null;
            Integer num5 = null;
            String str27 = null;
            String str28 = null;
            List list4 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            Integer num6 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str32 = null;
            String str33 = null;
            BrandingApiModel brandingApiModel3 = null;
            List list5 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            while (z) {
                String str37 = str32;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str26 = str26;
                        z = false;
                        str32 = str37;
                        i4 = i4;
                        str26 = str26;
                        i3 = 2;
                        break;
                    case 0:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str33);
                        i4 |= 1;
                        str27 = str27;
                        brandingApiModel3 = brandingApiModel3;
                        str32 = str37;
                        str26 = str26;
                        i3 = 2;
                        break;
                    case 1:
                        brandingApiModel3 = (BrandingApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BrandingApiModel$$serializer.f7145a, brandingApiModel3);
                        i4 |= 2;
                        str27 = str27;
                        list5 = list5;
                        str32 = str37;
                        str26 = str26;
                        i3 = 2;
                        break;
                    case 2:
                        str26 = str26;
                        int i5 = i3;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i3].getValue(), list5);
                        str27 = str27;
                        str34 = str34;
                        str32 = str37;
                        i3 = i5;
                        i4 |= 4;
                        str26 = str26;
                        break;
                    case 3:
                        str13 = str37;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str34);
                        i4 |= 8;
                        str27 = str27;
                        str35 = str35;
                        str32 = str13;
                        str26 = str26;
                        break;
                    case 4:
                        str13 = str37;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str35);
                        i4 |= 16;
                        str27 = str27;
                        str36 = str36;
                        str32 = str13;
                        str26 = str26;
                        break;
                    case 5:
                        str13 = str37;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str36);
                        i4 |= 32;
                        str27 = str27;
                        str32 = str13;
                        str26 = str26;
                        break;
                    case 6:
                        str26 = str26;
                        i4 |= 64;
                        str27 = str27;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str37);
                        str26 = str26;
                        break;
                    case 7:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str27);
                        i4 |= 128;
                        str26 = str26;
                        str32 = str37;
                        break;
                    case 8:
                        str27 = str27;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool6);
                        i4 |= 256;
                        str32 = str37;
                        str27 = str27;
                        break;
                    case 9:
                        str27 = str27;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.f18123a, bool5);
                        i4 |= 512;
                        str32 = str37;
                        str27 = str27;
                        break;
                    case 10:
                        str27 = str27;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.f18146a, num6);
                        i4 |= 1024;
                        str32 = str37;
                        str27 = str27;
                        break;
                    case 11:
                        str27 = str27;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.f18146a, num5);
                        i4 |= 2048;
                        str32 = str37;
                        str27 = str27;
                        break;
                    case 12:
                        str27 = str27;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str31);
                        i4 |= 4096;
                        str32 = str37;
                        str27 = str27;
                        break;
                    case 13:
                        str27 = str27;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str14);
                        i4 |= 8192;
                        str32 = str37;
                        str27 = str27;
                        break;
                    case 14:
                        str27 = str27;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str26);
                        i4 |= 16384;
                        str32 = str37;
                        str27 = str27;
                        break;
                    case 15:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str30);
                        i2 = 32768;
                        i4 |= i2;
                        str32 = str37;
                        str27 = str27;
                        break;
                    case 16:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str29);
                        i2 = 65536;
                        i4 |= i2;
                        str32 = str37;
                        str27 = str27;
                        break;
                    case 17:
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (DeserializationStrategy) lazyArr[17].getValue(), list4);
                        i2 = 131072;
                        i4 |= i2;
                        str32 = str37;
                        str27 = str27;
                        break;
                    case 18:
                        str27 = str27;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str28);
                        i4 |= 262144;
                        str32 = str37;
                        str27 = str27;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str33;
            num = num5;
            str2 = str28;
            list = list4;
            str3 = str29;
            str4 = str14;
            str5 = str30;
            str6 = str31;
            num2 = num6;
            bool = bool5;
            bool2 = bool6;
            str7 = str27;
            brandingApiModel = brandingApiModel3;
            list2 = list5;
            str8 = str34;
            str9 = str35;
            str10 = str36;
            str11 = str32;
            i = i4;
            str12 = str26;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductConfigApiModel(i, str, brandingApiModel, list2, str8, str9, str10, str11, str7, bool2, bool, num2, num, str6, str4, str12, str5, str3, list, str2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductConfigApiModel value = (ProductConfigApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductConfigApiModel.t;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f7150a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, BrandingApiModel$$serializer.f7145a, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, value.j);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, intSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, intSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, value.p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, value.q);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, (SerializationStrategy) lazyArr[17].getValue(), value.r);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, value.s);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
