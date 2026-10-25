package app.chalo.productbooking.common.data.models.api.response;

import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel;
import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel$$serializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/data/models/api/response/ProductConfigForUiApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigForUiApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductConfigForUiApiResponseModel$$serializer implements GeneratedSerializer<ProductConfigForUiApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductConfigForUiApiResponseModel$$serializer f8168a;
    private static final SerialDescriptor descriptor;

    static {
        ProductConfigForUiApiResponseModel$$serializer productConfigForUiApiResponseModel$$serializer = new ProductConfigForUiApiResponseModel$$serializer();
        f8168a = productConfigForUiApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.data.models.api.response.ProductConfigForUiApiResponseModel", productConfigForUiApiResponseModel$$serializer, 21);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("desc", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("label", false);
        pluginGeneratedSerialDescriptor.j("priority", false);
        pluginGeneratedSerialDescriptor.j("terms", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("productValidationType", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("isVisible", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("serviceType", false);
        pluginGeneratedSerialDescriptor.j("ctaTitle", false);
        pluginGeneratedSerialDescriptor.j("planHighlightTitle", false);
        pluginGeneratedSerialDescriptor.j("planHighlightCopy", false);
        pluginGeneratedSerialDescriptor.j("imageUrls", false);
        pluginGeneratedSerialDescriptor.j("strikeThroughHighlight", true);
        pluginGeneratedSerialDescriptor.j("appliedRules", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ProductConfigForUiApiResponseModel.v;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(IntSerializer.f18146a);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c((KSerializer) lazyArr[6].getValue());
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC10 = BuiltinSerializersKt.c(BrandingApiModel$$serializer.f7145a);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, kSerializerC10, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[14].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[18].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[20].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        Boolean bool;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool2;
        BrandingApiModel brandingApiModel;
        String str6;
        Integer num;
        String str7;
        List list2;
        String str8;
        String str9;
        int i;
        String str10;
        String str11;
        List list3;
        String str12;
        String str13;
        List list4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductConfigForUiApiResponseModel.v;
        List list5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.f18146a, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            BrandingApiModel brandingApiModel2 = (BrandingApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BrandingApiModel$$serializer.f7145a, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            str = str14;
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, (DeserializationStrategy) lazyArr[18].getValue(), null);
            str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), null);
            str7 = str18;
            list = list6;
            str5 = str15;
            i = 2097151;
            num = num2;
            brandingApiModel = brandingApiModel2;
            str6 = str19;
            str4 = str21;
            str3 = str17;
            str13 = str16;
            str11 = str23;
            str9 = str24;
            list3 = list7;
            str8 = str25;
            str2 = str20;
            bool2 = bool4;
            str12 = str22;
            bool = bool3;
        } else {
            int i2 = 20;
            int i3 = 0;
            int i4 = 6;
            boolean z = true;
            String str26 = null;
            Boolean bool5 = null;
            List list8 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            Boolean bool6 = null;
            BrandingApiModel brandingApiModel3 = null;
            String str30 = null;
            Integer num3 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            List list9 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            List list10 = null;
            String str37 = null;
            String str38 = null;
            while (z) {
                int i5 = i2;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = i3;
                        str26 = str26;
                        i2 = 20;
                        i4 = 6;
                        str37 = str37;
                        break;
                    case 0:
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str38);
                        i3 |= 1;
                        str29 = str29;
                        str26 = str26;
                        i2 = 20;
                        i4 = 6;
                        str37 = str37;
                        break;
                    case 1:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str29);
                        i3 |= 2;
                        str26 = str26;
                        i2 = 20;
                        i4 = 6;
                        str37 = str37;
                        break;
                    case 2:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str26);
                        i3 |= 4;
                        str29 = str29;
                        i2 = 20;
                        i4 = 6;
                        str37 = str37;
                        break;
                    case 3:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str28);
                        i3 |= 8;
                        str29 = str29;
                        i2 = 20;
                        i4 = 6;
                        str37 = str37;
                        break;
                    case 4:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str31);
                        i3 |= 16;
                        str29 = str29;
                        i2 = 20;
                        i4 = 6;
                        str37 = str37;
                        break;
                    case 5:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.f18146a, num3);
                        i3 |= 32;
                        str29 = str29;
                        i2 = 20;
                        i4 = 6;
                        str37 = str37;
                        break;
                    case 6:
                        str37 = str37;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), list8);
                        i3 |= 64;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 7:
                        str37 = str37;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str30);
                        i3 |= 128;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 8:
                        str37 = str37;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str27);
                        i3 |= 256;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 9:
                        str37 = str37;
                        brandingApiModel3 = (BrandingApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BrandingApiModel$$serializer.f7145a, brandingApiModel3);
                        i3 |= 512;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 10:
                        str37 = str37;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.f18123a, bool5);
                        i3 |= 1024;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 11:
                        str37 = str37;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.f18123a, bool6);
                        i3 |= 2048;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 12:
                        str37 = str37;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str32);
                        i3 |= 4096;
                        str33 = str33;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 13:
                        str37 = str37;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str33);
                        i3 |= 8192;
                        list9 = list9;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 14:
                        str37 = str37;
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), list9);
                        i3 |= 16384;
                        str34 = str34;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 15:
                        str37 = str37;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str34);
                        i3 |= 32768;
                        str35 = str35;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 16:
                        str37 = str37;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str35);
                        i3 |= 65536;
                        str36 = str36;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 17:
                        str37 = str37;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str36);
                        i3 |= 131072;
                        list10 = list10;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 18:
                        str37 = str37;
                        list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, (DeserializationStrategy) lazyArr[18].getValue(), list10);
                        i3 |= 262144;
                        list5 = list5;
                        str29 = str29;
                        i2 = 20;
                        str37 = str37;
                        break;
                    case 19:
                        i3 |= 524288;
                        list5 = list5;
                        str29 = str29;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.f18170a, str37);
                        i2 = 20;
                        break;
                    case 20:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), list5);
                        i3 |= 1048576;
                        i2 = i5;
                        str29 = str29;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str38;
            bool = bool5;
            list = list8;
            str2 = str27;
            str3 = str28;
            str4 = str32;
            str5 = str29;
            bool2 = bool6;
            brandingApiModel = brandingApiModel3;
            str6 = str30;
            num = num3;
            str7 = str31;
            list2 = list10;
            str8 = str36;
            str9 = str35;
            i = i3;
            str10 = str37;
            str11 = str34;
            list3 = list9;
            str12 = str33;
            str13 = str26;
            list4 = list5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductConfigForUiApiResponseModel(i, str, str5, str13, str3, str7, num, list, str6, str2, brandingApiModel, bool, bool2, str4, str12, list3, str11, str9, str8, list2, str10, list4);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductConfigForUiApiResponseModel value = (ProductConfigForUiApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductConfigForUiApiResponseModel.v;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        String str = value.f8167a;
        String str2 = value.t;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, str);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.f18146a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, BrandingApiModel$$serializer.f7145a, value.j);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, value.p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, value.q);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, value.r);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, (SerializationStrategy) lazyArr[18].getValue(), value.s);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, str2);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), value.u);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
