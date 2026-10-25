package app.chalo.superpass.data.models;

import app.chalo.providers.RouteNamingSchemeType;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/superpass/data/models/SuperPassTripReceiptApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/superpass/data/models/SuperPassTripReceiptApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassTripReceiptApiResponseModel$$serializer implements GeneratedSerializer<SuperPassTripReceiptApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassTripReceiptApiResponseModel$$serializer f9534a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassTripReceiptApiResponseModel$$serializer superPassTripReceiptApiResponseModel$$serializer = new SuperPassTripReceiptApiResponseModel$$serializer();
        f9534a = superPassTripReceiptApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.superpass.data.models.SuperPassTripReceiptApiResponseModel", superPassTripReceiptApiResponseModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("activationTime", false);
        pluginGeneratedSerialDescriptor.j("punchTime", true);
        pluginGeneratedSerialDescriptor.j("vehicleNo", true);
        pluginGeneratedSerialDescriptor.j("conductorId", true);
        pluginGeneratedSerialDescriptor.j("startStop", true);
        pluginGeneratedSerialDescriptor.j("endStop", true);
        pluginGeneratedSerialDescriptor.j("routeName", true);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        pluginGeneratedSerialDescriptor.j("via", true);
        pluginGeneratedSerialDescriptor.j("routeNamingSchemeType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassTripReceiptApiResponseModel.k;
        LongSerializer longSerializer = LongSerializer.f18151a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(longSerializer);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{longSerializer, kSerializerC, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[7].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[9].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        RouteNamingSchemeType routeNamingSchemeType;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        Long l;
        String str6;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassTripReceiptApiResponseModel.k;
        int i2 = 8;
        int i3 = 7;
        Long l2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            routeNamingSchemeType = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            l = l3;
            str2 = str11;
            str3 = str10;
            str5 = str8;
            str = str12;
            str4 = str9;
            str6 = str7;
            i = 1023;
            list = list2;
            j = jDecodeLongElement;
        } else {
            boolean z = true;
            int i4 = 0;
            RouteNamingSchemeType routeNamingSchemeType2 = null;
            String str13 = null;
            String str14 = null;
            List list3 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            long jDecodeLongElement2 = 0;
            String str18 = null;
            while (z) {
                int i5 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                        break;
                    case 0:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 8;
                        i3 = 7;
                        break;
                    case 1:
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l2);
                        i4 |= 2;
                        i2 = 8;
                        i3 = 7;
                        break;
                    case 2:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str18);
                        i4 |= 4;
                        i2 = 8;
                        i3 = 7;
                        break;
                    case 3:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str17);
                        i4 |= 8;
                        i2 = 8;
                        i3 = 7;
                        break;
                    case 4:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str16);
                        i4 |= 16;
                        i2 = 8;
                        i3 = 7;
                        break;
                    case 5:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str15);
                        i4 |= 32;
                        i2 = 8;
                        i3 = 7;
                        break;
                    case 6:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str14);
                        i4 |= 64;
                        i2 = 8;
                        i3 = 7;
                        break;
                    case 7:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), list3);
                        i4 |= 128;
                        i3 = i5;
                        i2 = 8;
                        break;
                    case 8:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str13);
                        i4 |= 256;
                        i3 = i5;
                        break;
                    case 9:
                        routeNamingSchemeType2 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), routeNamingSchemeType2);
                        i4 |= 512;
                        i3 = i5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            routeNamingSchemeType = routeNamingSchemeType2;
            str = str13;
            str2 = str14;
            list = list3;
            str3 = str15;
            str4 = str16;
            str5 = str17;
            l = l2;
            str6 = str18;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassTripReceiptApiResponseModel(i, j, l, str6, str5, str4, str3, str2, list, str, routeNamingSchemeType);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassTripReceiptApiResponseModel value = (SuperPassTripReceiptApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassTripReceiptApiResponseModel.k;
        long j = value.f9533a;
        RouteNamingSchemeType routeNamingSchemeType = value.j;
        String str = value.i;
        String str2 = value.g;
        String str3 = value.f;
        String str4 = value.e;
        String str5 = value.d;
        String str6 = value.c;
        Long l = value.b;
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, j);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || l == null || l.longValue() != -1) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.d(str6, "")) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.d(str5, "")) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.d(str4, "")) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(str3, "")) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(str2, "")) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str2);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), value.h);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || routeNamingSchemeType != RouteNamingSchemeType.DEFAULT) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), routeNamingSchemeType);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
