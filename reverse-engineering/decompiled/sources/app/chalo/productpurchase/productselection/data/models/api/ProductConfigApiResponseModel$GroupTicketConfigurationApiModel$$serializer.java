package app.chalo.productpurchase.productselection.data.models.api;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$GroupTicketConfigurationApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductConfigApiResponseModel$GroupTicketConfigurationApiModel$$serializer implements GeneratedSerializer<ProductConfigApiResponseModel.GroupTicketConfigurationApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductConfigApiResponseModel$GroupTicketConfigurationApiModel$$serializer f8600a;
    private static final SerialDescriptor descriptor;

    static {
        ProductConfigApiResponseModel$GroupTicketConfigurationApiModel$$serializer productConfigApiResponseModel$GroupTicketConfigurationApiModel$$serializer = new ProductConfigApiResponseModel$GroupTicketConfigurationApiModel$$serializer();
        f8600a = productConfigApiResponseModel$GroupTicketConfigurationApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.productselection.data.models.api.ProductConfigApiResponseModel.GroupTicketConfigurationApiModel", productConfigApiResponseModel$GroupTicketConfigurationApiModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("isVisible", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("activeDuration", false);
        pluginGeneratedSerialDescriptor.j("minAppVer", false);
        pluginGeneratedSerialDescriptor.j("maxAppVer", false);
        pluginGeneratedSerialDescriptor.j("imageUrls", false);
        pluginGeneratedSerialDescriptor.j("terms", false);
        pluginGeneratedSerialDescriptor.j("eligibleSubProducts", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(BrandingApiModel$$serializer.f7145a);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC10 = BuiltinSerializersKt.c(LongSerializer.f18151a);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, kSerializerC10, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[12].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[13].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[14].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        List list;
        List list2;
        Integer num;
        Long l;
        String str2;
        BrandingApiModel brandingApiModel;
        Integer num2;
        String str3;
        Boolean bool;
        int i;
        Boolean bool2;
        String str4;
        String str5;
        String str6;
        List list3;
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.p;
        List list4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            BrandingApiModel brandingApiModel2 = (BrandingApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BrandingApiModel$$serializer.f7145a, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.f18151a, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            str2 = str12;
            list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), null);
            bool = bool4;
            l = l2;
            str3 = str11;
            brandingApiModel = brandingApiModel2;
            i = 32767;
            str4 = str10;
            num = num3;
            bool2 = bool3;
            str5 = str9;
            str6 = str8;
            str = str7;
            list2 = list5;
            num2 = num4;
        } else {
            int i3 = 14;
            int i4 = 0;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            List list6 = null;
            Integer num5 = null;
            Long l3 = null;
            String str16 = null;
            BrandingApiModel brandingApiModel3 = null;
            Integer num6 = null;
            String str17 = null;
            Boolean bool5 = null;
            List list7 = null;
            String str18 = null;
            boolean z = true;
            Boolean bool6 = null;
            while (z) {
                int i5 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        str13 = str13;
                        str15 = str15;
                        str18 = str18;
                        list4 = list4;
                        i4 = i4;
                        i3 = 14;
                        break;
                    case 0:
                        String str19 = str13;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str18);
                        str14 = str14;
                        i4 |= 1;
                        list4 = list4;
                        str13 = str19;
                        str15 = str15;
                        i3 = 14;
                        break;
                    case 1:
                        String str20 = str13;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str14);
                        int i6 = i4 | 2;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i6;
                        str13 = str20;
                        break;
                    case 2:
                        str14 = str14;
                        i4 |= 4;
                        list4 = list4;
                        str13 = str13;
                        i3 = 14;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str15);
                        str14 = str14;
                        break;
                    case 3:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str13);
                        i2 = i4 | 8;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i2;
                        str14 = str14;
                        break;
                    case 4:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool6);
                        i2 = i4 | 16;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i2;
                        str14 = str14;
                        break;
                    case 5:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, bool5);
                        i2 = i4 | 32;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i2;
                        str14 = str14;
                        break;
                    case 6:
                        brandingApiModel3 = (BrandingApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BrandingApiModel$$serializer.f7145a, brandingApiModel3);
                        i2 = i4 | 64;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i2;
                        str14 = str14;
                        break;
                    case 7:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str17);
                        i2 = i4 | 128;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i2;
                        str14 = str14;
                        break;
                    case 8:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str16);
                        i2 = i4 | 256;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i2;
                        str14 = str14;
                        break;
                    case 9:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.f18151a, l3);
                        i2 = i4 | 512;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i2;
                        str14 = str14;
                        break;
                    case 10:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.f18146a, num5);
                        i2 = i4 | 1024;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i2;
                        str14 = str14;
                        break;
                    case 11:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.f18146a, num6);
                        i2 = i4 | 2048;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i2;
                        str14 = str14;
                        break;
                    case 12:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), list6);
                        i2 = i4 | 4096;
                        str15 = str15;
                        list4 = list4;
                        i3 = 14;
                        i4 = i2;
                        str14 = str14;
                        break;
                    case 13:
                        int i7 = i4;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), list7);
                        i4 = i7 | 8192;
                        list4 = list4;
                        str15 = str15;
                        str14 = str14;
                        i3 = 14;
                        break;
                    case 14:
                        str14 = str14;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), list4);
                        i4 |= 16384;
                        i3 = i5;
                        str14 = str14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            int i8 = i4;
            str = str18;
            list = list7;
            list2 = list6;
            num = num5;
            l = l3;
            str2 = str16;
            brandingApiModel = brandingApiModel3;
            num2 = num6;
            str3 = str17;
            bool = bool5;
            i = i8;
            bool2 = bool6;
            str4 = str13;
            str5 = str15;
            str6 = str14;
            list3 = list4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductConfigApiResponseModel.GroupTicketConfigurationApiModel(i, str, str6, str5, str4, bool2, bool, brandingApiModel, str3, str2, l, num, num2, list2, list, list3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductConfigApiResponseModel.GroupTicketConfigurationApiModel value = (ProductConfigApiResponseModel.GroupTicketConfigurationApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        String str = value.f8599a;
        List list = value.o;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, str);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, BrandingApiModel$$serializer.f7145a, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.f18151a, value.j);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, intSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, intSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), value.n);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
