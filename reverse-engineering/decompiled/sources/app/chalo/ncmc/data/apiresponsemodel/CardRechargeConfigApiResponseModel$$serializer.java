package app.chalo.ncmc.data.apiresponsemodel;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/data/apiresponsemodel/CardRechargeConfigApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardRechargeConfigApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CardRechargeConfigApiResponseModel$$serializer implements GeneratedSerializer<CardRechargeConfigApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CardRechargeConfigApiResponseModel$$serializer f6068a;
    private static final SerialDescriptor descriptor;

    static {
        CardRechargeConfigApiResponseModel$$serializer cardRechargeConfigApiResponseModel$$serializer = new CardRechargeConfigApiResponseModel$$serializer();
        f6068a = cardRechargeConfigApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.data.apiresponsemodel.CardRechargeConfigApiResponseModel", cardRechargeConfigApiResponseModel$$serializer, 15);
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
        Lazy[] lazyArr = CardRechargeConfigApiResponseModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(ChaloCardRechargeConfigBrandingApiResponseModel$$serializer.f6080a);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue());
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(ChaloCardRechargeFareInfoApiResponseModel$$serializer.f6082a);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(booleanSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        ChaloCardRechargeFareInfoApiResponseModel chaloCardRechargeFareInfoApiResponseModel;
        ChaloCardRechargeConfigBrandingApiResponseModel chaloCardRechargeConfigBrandingApiResponseModel;
        String str2;
        String str3;
        String str4;
        Integer num;
        Boolean bool;
        Boolean bool2;
        String str5;
        Integer num2;
        List list;
        String str6;
        String str7;
        int i;
        String str8;
        String str9;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CardRechargeConfigApiResponseModel.p;
        String str10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            ChaloCardRechargeConfigBrandingApiResponseModel chaloCardRechargeConfigBrandingApiResponseModel2 = (ChaloCardRechargeConfigBrandingApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ChaloCardRechargeConfigBrandingApiResponseModel$$serializer.f6080a, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            ChaloCardRechargeFareInfoApiResponseModel chaloCardRechargeFareInfoApiResponseModel2 = (ChaloCardRechargeFareInfoApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ChaloCardRechargeFareInfoApiResponseModel$$serializer.f6082a, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, intSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            i = 32767;
            str5 = str14;
            str6 = str12;
            str = str11;
            chaloCardRechargeConfigBrandingApiResponseModel = chaloCardRechargeConfigBrandingApiResponseModel2;
            num = num3;
            bool2 = bool3;
            chaloCardRechargeFareInfoApiResponseModel = chaloCardRechargeFareInfoApiResponseModel2;
            bool = bool4;
            num2 = num4;
            str4 = str15;
            str7 = str13;
            str2 = str17;
            str8 = str16;
            list = list2;
        } else {
            int i2 = 4;
            boolean z = true;
            int i3 = 0;
            String str18 = null;
            ChaloCardRechargeFareInfoApiResponseModel chaloCardRechargeFareInfoApiResponseModel3 = null;
            ChaloCardRechargeConfigBrandingApiResponseModel chaloCardRechargeConfigBrandingApiResponseModel3 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            Integer num5 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str22 = null;
            Integer num6 = null;
            List list3 = null;
            String str23 = null;
            String str24 = null;
            while (z) {
                String str25 = str19;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str18 = str18;
                        z = false;
                        str19 = str25;
                        i3 = i3;
                        str18 = str18;
                        i2 = 4;
                        break;
                    case 0:
                        str9 = str25;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str23);
                        i3 |= 1;
                        str24 = str24;
                        str19 = str9;
                        str18 = str18;
                        i2 = 4;
                        break;
                    case 1:
                        str9 = str25;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str24);
                        i3 |= 2;
                        str19 = str9;
                        str18 = str18;
                        i2 = 4;
                        break;
                    case 2:
                        str18 = str18;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str25);
                        i3 |= 4;
                        str18 = str18;
                        i2 = 4;
                        break;
                    case 3:
                        chaloCardRechargeConfigBrandingApiResponseModel3 = (ChaloCardRechargeConfigBrandingApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ChaloCardRechargeConfigBrandingApiResponseModel$$serializer.f6080a, chaloCardRechargeConfigBrandingApiResponseModel3);
                        i3 |= 8;
                        str18 = str18;
                        str19 = str25;
                        i2 = 4;
                        break;
                    case 4:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, (DeserializationStrategy) lazyArr[i2].getValue(), list3);
                        i3 |= 16;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    case 5:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str22);
                        i3 |= 32;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    case 6:
                        chaloCardRechargeFareInfoApiResponseModel3 = (ChaloCardRechargeFareInfoApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ChaloCardRechargeFareInfoApiResponseModel$$serializer.f6082a, chaloCardRechargeFareInfoApiResponseModel3);
                        i3 |= 64;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    case 7:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.f18123a, bool6);
                        i3 |= 128;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    case 8:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool5);
                        i3 |= 256;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    case 9:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.f18146a, num5);
                        i3 |= 512;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    case 10:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.f18146a, num6);
                        i3 |= 1024;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    case 11:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str21);
                        i3 |= 2048;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    case 12:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str18);
                        i3 |= 4096;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    case 13:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str10);
                        i3 |= 8192;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    case 14:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str20);
                        i3 |= 16384;
                        str19 = str25;
                        chaloCardRechargeConfigBrandingApiResponseModel3 = chaloCardRechargeConfigBrandingApiResponseModel3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str23;
            chaloCardRechargeFareInfoApiResponseModel = chaloCardRechargeFareInfoApiResponseModel3;
            chaloCardRechargeConfigBrandingApiResponseModel = chaloCardRechargeConfigBrandingApiResponseModel3;
            str2 = str10;
            str3 = str20;
            str4 = str21;
            num = num5;
            bool = bool5;
            bool2 = bool6;
            str5 = str22;
            num2 = num6;
            list = list3;
            str6 = str24;
            str7 = str19;
            i = i3;
            str8 = str18;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CardRechargeConfigApiResponseModel(i, str, str6, str7, chaloCardRechargeConfigBrandingApiResponseModel, list, str5, chaloCardRechargeFareInfoApiResponseModel, bool2, bool, num, num2, str4, str8, str2, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CardRechargeConfigApiResponseModel value = (CardRechargeConfigApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CardRechargeConfigApiResponseModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f6067a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, ChaloCardRechargeConfigBrandingApiResponseModel$$serializer.f6080a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, ChaloCardRechargeFareInfoApiResponseModel$$serializer.f6082a, value.g);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, value.i);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, intSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, intSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
