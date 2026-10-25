package app.chalo.data;

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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/data/PremiumBusNativeCityWiseConfigAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/data/PremiumBusNativeCityWiseConfigAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusNativeCityWiseConfigAppModel$$serializer implements GeneratedSerializer<PremiumBusNativeCityWiseConfigAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusNativeCityWiseConfigAppModel$$serializer f2379a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusNativeCityWiseConfigAppModel$$serializer premiumBusNativeCityWiseConfigAppModel$$serializer = new PremiumBusNativeCityWiseConfigAppModel$$serializer();
        f2379a = premiumBusNativeCityWiseConfigAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.data.PremiumBusNativeCityWiseConfigAppModel", premiumBusNativeCityWiseConfigAppModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("isEnabled", false);
        pluginGeneratedSerialDescriptor.j("minAppVer", false);
        pluginGeneratedSerialDescriptor.j("maxAppVer", false);
        pluginGeneratedSerialDescriptor.j("pollingConstants", false);
        pluginGeneratedSerialDescriptor.j("airportExpressStops", false);
        pluginGeneratedSerialDescriptor.j("iconUrl", false);
        pluginGeneratedSerialDescriptor.j("shouldShowNewPremiumBusCard", false);
        pluginGeneratedSerialDescriptor.j("supportContactNumber", false);
        pluginGeneratedSerialDescriptor.j("landingScreenImageUrl", false);
        pluginGeneratedSerialDescriptor.j("stopCountAfterDropToConsiderForTripEnd", false);
        pluginGeneratedSerialDescriptor.j("totalRoutesToShowOnLandingScreen", false);
        pluginGeneratedSerialDescriptor.j("userCancellationAndReschedulePolicyWebUrl", false);
        pluginGeneratedSerialDescriptor.j("passSavingFaqs", false);
        pluginGeneratedSerialDescriptor.j("rideConsumptionPercentageForRenewal", true);
        pluginGeneratedSerialDescriptor.j("timeConsumptionPercentageForRenewal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PremiumBusNativeCityWiseConfigAppModel.q;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue());
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c((KSerializer) lazyArr[13].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{stringSerializer, booleanSerializer, intSerializer, intSerializer, PremiumBusCityWisePollingConfigAppModel$$serializer.f2377a, kSerializerC, stringSerializer, booleanSerializer, kSerializerC2, kSerializerC3, intSerializer, intSerializer, kSerializerC4, kSerializerC5, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        List list2;
        PremiumBusCityWisePollingConfigAppModel premiumBusCityWisePollingConfigAppModel;
        boolean z;
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        String str4;
        String str5;
        int iDecodeIntElement;
        int i4;
        boolean z2;
        int i5;
        int iDecodeIntElement2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PremiumBusNativeCityWiseConfigAppModel.q;
        int i6 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            PremiumBusCityWisePollingConfigAppModel premiumBusCityWisePollingConfigAppModel2 = (PremiumBusCityWisePollingConfigAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, PremiumBusCityWisePollingConfigAppModel$$serializer.f2377a, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            str4 = strDecodeStringElement;
            z = zDecodeBooleanElement;
            list = list3;
            i3 = iDecodeIntElement3;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
            i4 = iDecodeIntElement5;
            str = str7;
            z2 = zDecodeBooleanElement2;
            str5 = strDecodeStringElement2;
            i5 = iDecodeIntElement4;
            str3 = str6;
            premiumBusCityWisePollingConfigAppModel = premiumBusCityWisePollingConfigAppModel2;
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
            i2 = 65535;
            str2 = str8;
            i = iDecodeIntElement6;
        } else {
            int i7 = 15;
            boolean z3 = true;
            int i8 = 5;
            int iDecodeIntElement7 = 0;
            int i9 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement11 = 0;
            int iDecodeIntElement12 = 0;
            List list4 = null;
            List list5 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement4 = false;
            PremiumBusCityWisePollingConfigAppModel premiumBusCityWisePollingConfigAppModel3 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i7 = 15;
                        i8 = 5;
                        break;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i9 |= 1;
                        i7 = 15;
                        i6 = 10;
                        i8 = 5;
                        break;
                    case 1:
                        i9 |= 2;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i7 = 15;
                        i6 = 10;
                        i8 = 5;
                        break;
                    case 2:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i9 |= 4;
                        i7 = 15;
                        i6 = 10;
                        i8 = 5;
                        break;
                    case 3:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i9 |= 8;
                        i7 = 15;
                        i6 = 10;
                        i8 = 5;
                        break;
                    case 4:
                        premiumBusCityWisePollingConfigAppModel3 = (PremiumBusCityWisePollingConfigAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, PremiumBusCityWisePollingConfigAppModel$$serializer.f2377a, premiumBusCityWisePollingConfigAppModel3);
                        i9 |= 16;
                        i7 = 15;
                        i6 = 10;
                        i8 = 5;
                        break;
                    case 5:
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, (DeserializationStrategy) lazyArr[i8].getValue(), list4);
                        i9 |= 32;
                        i7 = 15;
                        i6 = 10;
                        break;
                    case 6:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i9 |= 64;
                        i7 = 15;
                        break;
                    case 7:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i9 |= 128;
                        i7 = 15;
                        break;
                    case 8:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str11);
                        i9 |= 256;
                        i7 = 15;
                        break;
                    case 9:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str9);
                        i9 |= 512;
                        i7 = 15;
                        break;
                    case 10:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i6);
                        i9 |= 1024;
                        i7 = 15;
                        break;
                    case 11:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
                        i9 |= 2048;
                        i7 = 15;
                        break;
                    case 12:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str10);
                        i9 |= 4096;
                        i7 = 15;
                        break;
                    case 13:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), list5);
                        i9 |= 8192;
                        i7 = 15;
                        break;
                    case 14:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
                        i9 |= 16384;
                        break;
                    case 15:
                        iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i7);
                        i9 |= 32768;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement7;
            list = list4;
            list2 = list5;
            premiumBusCityWisePollingConfigAppModel = premiumBusCityWisePollingConfigAppModel3;
            z = zDecodeBooleanElement4;
            i2 = i9;
            str = str9;
            str2 = str10;
            str3 = str11;
            i3 = iDecodeIntElement8;
            str4 = strDecodeStringElement3;
            str5 = strDecodeStringElement4;
            iDecodeIntElement = iDecodeIntElement9;
            i4 = iDecodeIntElement10;
            z2 = zDecodeBooleanElement3;
            i5 = iDecodeIntElement11;
            iDecodeIntElement2 = iDecodeIntElement12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusNativeCityWiseConfigAppModel(i2, str4, z, i3, i5, premiumBusCityWisePollingConfigAppModel, list, str5, z2, str3, str, i4, i, str2, list2, iDecodeIntElement, iDecodeIntElement2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusNativeCityWiseConfigAppModel value = (PremiumBusNativeCityWiseConfigAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PremiumBusNativeCityWiseConfigAppModel.q;
        String str = value.f2378a;
        int i = value.p;
        int i2 = value.o;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, PremiumBusCityWisePollingConfigAppModel$$serializer.f2377a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, value.h);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 11, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), value.n);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || i2 != 80) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 14, i2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || i != 80) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 15, i);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
