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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel$$serializer implements GeneratedSerializer<ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel$$serializer f8598a;
    private static final SerialDescriptor descriptor;

    static {
        ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel$$serializer productConfigApiResponseModel$CardRechargeConfigApiResponseModel$$serializer = new ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel$$serializer();
        f8598a = productConfigApiResponseModel$CardRechargeConfigApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.productselection.data.models.api.ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel", productConfigApiResponseModel$CardRechargeConfigApiResponseModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("fareInfo", false);
        pluginGeneratedSerialDescriptor.j("rechargeDelayCopy", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("isVisible", false);
        pluginGeneratedSerialDescriptor.j("minAppVer", false);
        pluginGeneratedSerialDescriptor.j("maxAppVer", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("terms", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel.o;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(CardRechargeFareInfoApiResponseModel$$serializer.f8560a);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC10 = BuiltinSerializersKt.c(booleanSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, kSerializerC10, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(BrandingApiModel$$serializer.f7145a), BuiltinSerializersKt.c((KSerializer) lazyArr[13].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Boolean bool;
        Integer num;
        int i;
        String str;
        BrandingApiModel brandingApiModel;
        Integer num2;
        Boolean bool2;
        String str2;
        String str3;
        CardRechargeFareInfoApiResponseModel cardRechargeFareInfoApiResponseModel;
        String str4;
        String str5;
        List list;
        String str6;
        String str7;
        String str8;
        String str9;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel.o;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            CardRechargeFareInfoApiResponseModel cardRechargeFareInfoApiResponseModel2 = (CardRechargeFareInfoApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CardRechargeFareInfoApiResponseModel$$serializer.f8560a, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            i = 16383;
            brandingApiModel = (BrandingApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BrandingApiModel$$serializer.f7145a, null);
            str2 = str16;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            cardRechargeFareInfoApiResponseModel = cardRechargeFareInfoApiResponseModel2;
            bool2 = bool3;
            str3 = str15;
            str5 = str13;
            str4 = str14;
            str6 = str12;
            str7 = str11;
            str = str10;
            num2 = num3;
        } else {
            int i2 = 13;
            List list2 = null;
            String str17 = null;
            Integer num4 = null;
            Boolean bool4 = null;
            bool = null;
            String str18 = null;
            String str19 = null;
            num = null;
            CardRechargeFareInfoApiResponseModel cardRechargeFareInfoApiResponseModel3 = null;
            String str20 = null;
            BrandingApiModel brandingApiModel2 = null;
            String str21 = null;
            boolean z = true;
            i = 0;
            String str22 = null;
            String str23 = null;
            while (z) {
                int i3 = i2;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str21;
                        str9 = str17;
                        z = false;
                        list2 = list2;
                        str17 = str9;
                        i2 = 13;
                        str21 = str8;
                        str22 = str22;
                        break;
                    case 0:
                        String str24 = str21;
                        str9 = str17;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str24);
                        i |= 1;
                        list2 = list2;
                        str17 = str9;
                        i2 = 13;
                        str21 = str8;
                        str22 = str22;
                        break;
                    case 1:
                        List list3 = list2;
                        i |= 2;
                        str22 = str22;
                        i2 = 13;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str17);
                        list2 = list3;
                        break;
                    case 2:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str22);
                        i |= 4;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 3:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str23);
                        i |= 8;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 4:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str20);
                        i |= 16;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 5:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str19);
                        i |= 32;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 6:
                        cardRechargeFareInfoApiResponseModel3 = (CardRechargeFareInfoApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CardRechargeFareInfoApiResponseModel$$serializer.f8560a, cardRechargeFareInfoApiResponseModel3);
                        i |= 64;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 7:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str18);
                        i |= 128;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 8:
                        bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool);
                        i |= 256;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 9:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.f18123a, bool4);
                        i |= 512;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 10:
                        num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.f18146a, num);
                        i |= 1024;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 11:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.f18146a, num4);
                        i |= 2048;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 12:
                        brandingApiModel2 = (BrandingApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BrandingApiModel$$serializer.f7145a, brandingApiModel2);
                        i |= 4096;
                        list2 = list2;
                        str17 = str17;
                        i2 = 13;
                        break;
                    case 13:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), list2);
                        i |= 8192;
                        i2 = i3;
                        str17 = str17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str25 = str22;
            str = str21;
            brandingApiModel = brandingApiModel2;
            num2 = num4;
            bool2 = bool4;
            str2 = str18;
            str3 = str19;
            cardRechargeFareInfoApiResponseModel = cardRechargeFareInfoApiResponseModel3;
            str4 = str20;
            str5 = str23;
            list = list2;
            str6 = str25;
            str7 = str17;
        }
        int i4 = i;
        Boolean bool5 = bool;
        Integer num5 = num;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel(i4, str, str7, str6, str5, str4, str3, cardRechargeFareInfoApiResponseModel, str2, bool5, bool2, num5, num2, brandingApiModel, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel value = (ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel.o;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f8597a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, CardRechargeFareInfoApiResponseModel$$serializer.f8560a, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, value.j);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, intSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, intSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, BrandingApiModel$$serializer.f7145a, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), value.n);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
