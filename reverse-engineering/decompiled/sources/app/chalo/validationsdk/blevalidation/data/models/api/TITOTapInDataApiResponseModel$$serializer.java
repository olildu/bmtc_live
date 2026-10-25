package app.chalo.validationsdk.blevalidation.data.models.api;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/validationsdk/blevalidation/data/models/api/TITOTapInDataApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapInDataApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TITOTapInDataApiResponseModel$$serializer implements GeneratedSerializer<TITOTapInDataApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TITOTapInDataApiResponseModel$$serializer f10494a;
    private static final SerialDescriptor descriptor;

    static {
        TITOTapInDataApiResponseModel$$serializer tITOTapInDataApiResponseModel$$serializer = new TITOTapInDataApiResponseModel$$serializer();
        f10494a = tITOTapInDataApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.validationsdk.blevalidation.data.models.api.TITOTapInDataApiResponseModel", tITOTapInDataApiResponseModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.j("bookingId", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("groupNo", false);
        pluginGeneratedSerialDescriptor.j("firstTimeValidScanTS", false);
        pluginGeneratedSerialDescriptor.j("activationTsInSec", false);
        pluginGeneratedSerialDescriptor.j("tapinPunchTsInMillis", false);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("stopId", false);
        pluginGeneratedSerialDescriptor.j("tripNo", false);
        pluginGeneratedSerialDescriptor.j("waybillNo", false);
        pluginGeneratedSerialDescriptor.j("vehicleNumber", false);
        pluginGeneratedSerialDescriptor.j("walletId", false);
        pluginGeneratedSerialDescriptor.j("expiryTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(longSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        String str7;
        String str8;
        Long l6;
        String str9;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            Long l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            Long l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, longSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            Long l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, longSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            i = 16383;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, longSerializer, null);
            l2 = l11;
            str4 = str15;
            str6 = str13;
            l3 = l10;
            l = l9;
            l5 = l7;
            str5 = str14;
            l4 = l8;
            str8 = str12;
            str7 = str11;
            str3 = str16;
            str = str10;
        } else {
            Long l12 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            Long l13 = null;
            Long l14 = null;
            Long l15 = null;
            Long l16 = null;
            String str23 = null;
            boolean z = true;
            i = 0;
            String str24 = null;
            Long l17 = null;
            while (z) {
                String str25 = str17;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str25;
                        z = false;
                        str17 = str9;
                        str24 = str24;
                        l12 = l12;
                        break;
                    case 0:
                        str9 = str25;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str23);
                        i |= 1;
                        str17 = str9;
                        str24 = str24;
                        l12 = l12;
                        break;
                    case 1:
                        l12 = l12;
                        str24 = str24;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str25);
                        i |= 2;
                        str24 = str24;
                        l12 = l12;
                        break;
                    case 2:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str24);
                        i |= 4;
                        l12 = l12;
                        str17 = str25;
                        break;
                    case 3:
                        l17 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l17);
                        i |= 8;
                        str17 = str25;
                        str24 = str24;
                        break;
                    case 4:
                        l16 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l16);
                        i |= 16;
                        str17 = str25;
                        str24 = str24;
                        break;
                    case 5:
                        l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.f18151a, l13);
                        i |= 32;
                        str17 = str25;
                        str24 = str24;
                        break;
                    case 6:
                        l15 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.f18151a, l15);
                        i |= 64;
                        str17 = str25;
                        str24 = str24;
                        break;
                    case 7:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str22);
                        i |= 128;
                        str17 = str25;
                        str24 = str24;
                        break;
                    case 8:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str21);
                        i |= 256;
                        str17 = str25;
                        str24 = str24;
                        break;
                    case 9:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str20);
                        i |= 512;
                        str17 = str25;
                        str24 = str24;
                        break;
                    case 10:
                        l14 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.f18151a, l14);
                        i |= 1024;
                        str17 = str25;
                        str24 = str24;
                        break;
                    case 11:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str19);
                        i |= 2048;
                        str17 = str25;
                        str24 = str24;
                        break;
                    case 12:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str18);
                        i |= 4096;
                        str17 = str25;
                        str24 = str24;
                        break;
                    case 13:
                        l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.f18151a, l12);
                        i |= 8192;
                        str17 = str25;
                        str24 = str24;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str23;
            str2 = str18;
            str3 = str19;
            str4 = str20;
            str5 = str21;
            str6 = str22;
            l = l13;
            l2 = l14;
            l3 = l15;
            l4 = l16;
            l5 = l17;
            str7 = str17;
            str8 = str24;
            l6 = l12;
        }
        int i2 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TITOTapInDataApiResponseModel(i2, str, str7, str8, l5, l4, l, l3, str6, str5, str4, l2, str3, str2, l6);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TITOTapInDataApiResponseModel value = (TITOTapInDataApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f10493a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        LongSerializer longSerializer = LongSerializer.f18151a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, longSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, longSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, longSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, longSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, longSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, longSerializer, value.n);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
