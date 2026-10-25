package app.chalo.ncmc.data.appmodel;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/data/appmodel/ChaloCardRechargeConfigAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardRechargeConfigAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ChaloCardRechargeConfigAppModel$$serializer implements GeneratedSerializer<ChaloCardRechargeConfigAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloCardRechargeConfigAppModel$$serializer f6127a;
    private static final SerialDescriptor descriptor;

    static {
        ChaloCardRechargeConfigAppModel$$serializer chaloCardRechargeConfigAppModel$$serializer = new ChaloCardRechargeConfigAppModel$$serializer();
        f6127a = chaloCardRechargeConfigAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel", chaloCardRechargeConfigAppModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("configId", false);
        pluginGeneratedSerialDescriptor.j("fareInfo", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("minAppVer", false);
        pluginGeneratedSerialDescriptor.j("maxAppVer", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("terms", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("rechargeDelayCopy", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ChaloCardRechargeConfigAppModel.n;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(BooleanSerializer.f18123a);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{stringSerializer, ChaloCardRechargeFareInfoAppModel$$serializer.f6133a, kSerializerC, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(ChaloCardRechargeConfigBrandingAppModel$$serializer.f6129a), BuiltinSerializersKt.c((KSerializer) lazyArr[8].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Boolean bool;
        ChaloCardRechargeFareInfoAppModel chaloCardRechargeFareInfoAppModel;
        String str;
        String str2;
        List list;
        ChaloCardRechargeConfigBrandingAppModel chaloCardRechargeConfigBrandingAppModel;
        String str3;
        String str4;
        Integer num;
        String str5;
        Integer num2;
        String str6;
        String str7;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ChaloCardRechargeConfigAppModel.n;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            ChaloCardRechargeFareInfoAppModel chaloCardRechargeFareInfoAppModel2 = (ChaloCardRechargeFareInfoAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChaloCardRechargeFareInfoAppModel$$serializer.f6133a, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.f18123a, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            ChaloCardRechargeConfigBrandingAppModel chaloCardRechargeConfigBrandingAppModel2 = (ChaloCardRechargeConfigBrandingAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ChaloCardRechargeConfigBrandingAppModel$$serializer.f6129a, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            i = 8191;
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str7 = strDecodeStringElement;
            chaloCardRechargeFareInfoAppModel = chaloCardRechargeFareInfoAppModel2;
            chaloCardRechargeConfigBrandingAppModel = chaloCardRechargeConfigBrandingAppModel2;
            str2 = str10;
            str5 = str11;
            str4 = str9;
            str3 = str8;
            num2 = num3;
            num = num4;
            bool = bool2;
            str = str12;
            list = list2;
        } else {
            String str13 = null;
            String strDecodeStringElement2 = null;
            ChaloCardRechargeFareInfoAppModel chaloCardRechargeFareInfoAppModel3 = null;
            String str14 = null;
            String str15 = null;
            List list3 = null;
            ChaloCardRechargeConfigBrandingAppModel chaloCardRechargeConfigBrandingAppModel3 = null;
            String str16 = null;
            String str17 = null;
            Integer num5 = null;
            int i2 = 8;
            boolean z = true;
            i = 0;
            Boolean bool3 = null;
            String str18 = null;
            Integer num6 = null;
            while (z) {
                String str19 = strDecodeStringElement2;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        str13 = str13;
                        strDecodeStringElement2 = str19;
                        i2 = 8;
                        break;
                    case 0:
                        i |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        str13 = str13;
                        i2 = 8;
                        break;
                    case 1:
                        chaloCardRechargeFareInfoAppModel3 = (ChaloCardRechargeFareInfoAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChaloCardRechargeFareInfoAppModel$$serializer.f6133a, chaloCardRechargeFareInfoAppModel3);
                        i |= 2;
                        str13 = str13;
                        strDecodeStringElement2 = str19;
                        i2 = 8;
                        break;
                    case 2:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.f18123a, bool3);
                        i |= 4;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        i2 = 8;
                        break;
                    case 3:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.f18146a, num6);
                        i |= 8;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        i2 = 8;
                        break;
                    case 4:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.f18146a, num5);
                        i |= 16;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        i2 = 8;
                        break;
                    case 5:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str16);
                        i |= 32;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        i2 = 8;
                        break;
                    case 6:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str17);
                        i |= 64;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        i2 = 8;
                        break;
                    case 7:
                        chaloCardRechargeConfigBrandingAppModel3 = (ChaloCardRechargeConfigBrandingAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ChaloCardRechargeConfigBrandingAppModel$$serializer.f6129a, chaloCardRechargeConfigBrandingAppModel3);
                        i |= 128;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        i2 = 8;
                        break;
                    case 8:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, (DeserializationStrategy) lazyArr[i2].getValue(), list3);
                        i |= 256;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        break;
                    case 9:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str15);
                        i |= 512;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        break;
                    case 10:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str18);
                        i |= 1024;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        break;
                    case 11:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str14);
                        i |= 2048;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        break;
                    case 12:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str13);
                        i |= 4096;
                        strDecodeStringElement2 = str19;
                        chaloCardRechargeFareInfoAppModel3 = chaloCardRechargeFareInfoAppModel3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bool = bool3;
            chaloCardRechargeFareInfoAppModel = chaloCardRechargeFareInfoAppModel3;
            str = str14;
            str2 = str15;
            list = list3;
            chaloCardRechargeConfigBrandingAppModel = chaloCardRechargeConfigBrandingAppModel3;
            str3 = str16;
            str4 = str17;
            num = num5;
            str5 = str18;
            num2 = num6;
            str6 = str13;
            str7 = strDecodeStringElement2;
        }
        int i3 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChaloCardRechargeConfigAppModel(i3, str7, chaloCardRechargeFareInfoAppModel, bool, num2, num, str3, str4, chaloCardRechargeConfigBrandingAppModel, list, str2, str5, str, str6);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ChaloCardRechargeConfigAppModel value = (ChaloCardRechargeConfigAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ChaloCardRechargeConfigAppModel.n;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f6126a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, ChaloCardRechargeFareInfoAppModel$$serializer.f6133a, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.f18123a, value.c);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, intSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, intSerializer, value.e);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, ChaloCardRechargeConfigBrandingAppModel$$serializer.f6129a, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (SerializationStrategy) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
