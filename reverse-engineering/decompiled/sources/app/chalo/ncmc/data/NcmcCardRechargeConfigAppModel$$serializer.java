package app.chalo.ncmc.data;

import app.chalo.models.CardRechargeFareInfo;
import app.chalo.models.CardRechargeFareInfo$$serializer;
import app.chalo.models.ProductBranding;
import app.chalo.models.ProductBranding$$serializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/data/NcmcCardRechargeConfigAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/data/NcmcCardRechargeConfigAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class NcmcCardRechargeConfigAppModel$$serializer implements GeneratedSerializer<NcmcCardRechargeConfigAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NcmcCardRechargeConfigAppModel$$serializer f6034a;
    private static final SerialDescriptor descriptor;

    static {
        NcmcCardRechargeConfigAppModel$$serializer ncmcCardRechargeConfigAppModel$$serializer = new NcmcCardRechargeConfigAppModel$$serializer();
        f6034a = ncmcCardRechargeConfigAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel", ncmcCardRechargeConfigAppModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("terms", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("fareInfo", false);
        pluginGeneratedSerialDescriptor.j("isOfflineRechargeActive", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("minAppVer", false);
        pluginGeneratedSerialDescriptor.j("maxAppVer", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("intermediateBeneficiary", false);
        pluginGeneratedSerialDescriptor.j("rechargeDelayCopy", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = NcmcCardRechargeConfigAppModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(ProductBranding$$serializer.f5593a);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(booleanSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{stringSerializer, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, stringSerializer, CardRechargeFareInfo$$serializer.f5578a, kSerializerC5, kSerializerC6, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.c(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        CardRechargeFareInfo cardRechargeFareInfo;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        Boolean bool;
        Boolean bool2;
        List list;
        Integer num2;
        ProductBranding productBranding;
        String str5;
        String str6;
        String str7;
        String strDecodeStringElement;
        Lazy[] lazyArr;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = NcmcCardRechargeConfigAppModel.p;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            ProductBranding productBranding2 = (ProductBranding) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ProductBranding$$serializer.f5593a, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr2[4].getValue(), null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            CardRechargeFareInfo cardRechargeFareInfo2 = (CardRechargeFareInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, CardRechargeFareInfo$$serializer.f5578a, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, intSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            i = 32767;
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            str3 = strDecodeStringElement2;
            str5 = strDecodeStringElement3;
            str2 = str8;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            productBranding = productBranding2;
            num = num3;
            bool2 = bool3;
            cardRechargeFareInfo = cardRechargeFareInfo2;
            bool = bool4;
            num2 = num4;
            str6 = strDecodeStringElement4;
            str = str9;
            str7 = strDecodeStringElement5;
            list = list2;
        } else {
            int i2 = 4;
            boolean z = true;
            CardRechargeFareInfo cardRechargeFareInfo3 = null;
            String str10 = null;
            String strDecodeStringElement6 = null;
            String str11 = null;
            Integer num5 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            List list3 = null;
            Integer num6 = null;
            ProductBranding productBranding3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            i = 0;
            String str12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        lazyArr2 = lazyArr2;
                        i2 = 4;
                        break;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        lazyArr2 = lazyArr2;
                        i2 = 4;
                        break;
                    case 1:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str12);
                        i |= 2;
                        lazyArr2 = lazyArr2;
                        i2 = 4;
                        break;
                    case 2:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str10);
                        i |= 4;
                        lazyArr2 = lazyArr2;
                        i2 = 4;
                        break;
                    case 3:
                        productBranding3 = (ProductBranding) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ProductBranding$$serializer.f5593a, productBranding3);
                        i |= 8;
                        lazyArr2 = lazyArr2;
                        i2 = 4;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, (DeserializationStrategy) lazyArr[i2].getValue(), list3);
                        i |= 16;
                        lazyArr2 = lazyArr;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        lazyArr2 = lazyArr;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        cardRechargeFareInfo3 = (CardRechargeFareInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, CardRechargeFareInfo$$serializer.f5578a, cardRechargeFareInfo3);
                        i |= 64;
                        lazyArr2 = lazyArr;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.f18123a, bool6);
                        i |= 128;
                        lazyArr2 = lazyArr;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool5);
                        i |= 256;
                        lazyArr2 = lazyArr;
                        break;
                    case 9:
                        lazyArr = lazyArr2;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.f18146a, num5);
                        i |= 512;
                        lazyArr2 = lazyArr;
                        break;
                    case 10:
                        lazyArr = lazyArr2;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.f18146a, num6);
                        i |= 1024;
                        lazyArr2 = lazyArr;
                        break;
                    case 11:
                        lazyArr = lazyArr2;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i |= 2048;
                        lazyArr2 = lazyArr;
                        break;
                    case 12:
                        lazyArr = lazyArr2;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i |= 4096;
                        lazyArr2 = lazyArr;
                        break;
                    case 13:
                        lazyArr = lazyArr2;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str11);
                        i |= 8192;
                        lazyArr2 = lazyArr;
                        break;
                    case 14:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i |= 16384;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            cardRechargeFareInfo = cardRechargeFareInfo3;
            str = str10;
            str2 = str12;
            str3 = strDecodeStringElement6;
            str4 = str11;
            num = num5;
            bool = bool5;
            bool2 = bool6;
            list = list3;
            num2 = num6;
            productBranding = productBranding3;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            strDecodeStringElement = strDecodeStringElement10;
        }
        int i3 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NcmcCardRechargeConfigAppModel(i3, str3, str2, str, productBranding, list, str5, cardRechargeFareInfo, bool2, bool, num, num2, str6, str7, str4, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        NcmcCardRechargeConfigAppModel value = (NcmcCardRechargeConfigAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = NcmcCardRechargeConfigAppModel.p;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f6033a);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, ProductBranding$$serializer.f5593a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, CardRechargeFareInfo$$serializer.f5578a, value.g);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, value.i);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, intSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, intSerializer, value.k);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 11, value.l);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 12, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 14, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
