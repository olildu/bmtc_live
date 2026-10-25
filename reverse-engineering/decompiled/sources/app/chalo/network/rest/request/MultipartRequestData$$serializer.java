package app.chalo.network.rest.request;

import java.util.HashMap;
import java.util.Map;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/network/rest/request/MultipartRequestData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/network/rest/request/MultipartRequestData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MultipartRequestData$$serializer implements GeneratedSerializer<MultipartRequestData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MultipartRequestData$$serializer f6517a;
    private static final SerialDescriptor descriptor;

    static {
        MultipartRequestData$$serializer multipartRequestData$$serializer = new MultipartRequestData$$serializer();
        f6517a = multipartRequestData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.network.rest.request.MultipartRequestData", multipartRequestData$$serializer, 19);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("baseUrl", true);
        pluginGeneratedSerialDescriptor.j("subUrl", true);
        pluginGeneratedSerialDescriptor.j("httpMethod", true);
        pluginGeneratedSerialDescriptor.j("headers", true);
        pluginGeneratedSerialDescriptor.j("queryParams", true);
        pluginGeneratedSerialDescriptor.j("pathParams", true);
        pluginGeneratedSerialDescriptor.j("singleBodyMediaType", true);
        pluginGeneratedSerialDescriptor.j("bodyJSON", true);
        pluginGeneratedSerialDescriptor.j("extraInfo", true);
        pluginGeneratedSerialDescriptor.j("priority", true);
        pluginGeneratedSerialDescriptor.j("content-type", true);
        pluginGeneratedSerialDescriptor.j("connect-timeout", true);
        pluginGeneratedSerialDescriptor.j("read-timeout", true);
        pluginGeneratedSerialDescriptor.j("write-timeout", true);
        pluginGeneratedSerialDescriptor.j("retry-count", true);
        pluginGeneratedSerialDescriptor.j("retry-strategy", true);
        pluginGeneratedSerialDescriptor.j("file-part", true);
        pluginGeneratedSerialDescriptor.j("additional-info-part", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MultipartRequestData.u;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), intSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), intSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[17].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[18].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i;
        Integer num;
        MultipartRequestFormDataType multipartRequestFormDataType;
        String str4;
        Integer num2;
        HashMap map;
        Map map2;
        Integer num3;
        String str5;
        String str6;
        String str7;
        String str8;
        HashMap map3;
        String str9;
        int i2;
        MultipartRequestFormDataType multipartRequestFormDataType2;
        int i3;
        MultipartRequestFormDataType multipartRequestFormDataType3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MultipartRequestData.u;
        int i4 = 9;
        int i5 = 8;
        String str10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            HashMap map4 = (HashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            Map map5 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            HashMap map6 = (HashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, intSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, intSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, intSerializer, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            multipartRequestFormDataType2 = (MultipartRequestFormDataType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (DeserializationStrategy) lazyArr[17].getValue(), null);
            multipartRequestFormDataType = (MultipartRequestFormDataType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, (DeserializationStrategy) lazyArr[18].getValue(), null);
            i2 = iDecodeIntElement2;
            str7 = str13;
            map2 = map5;
            map3 = map4;
            str6 = str12;
            i = 524287;
            map = map6;
            str5 = str17;
            str2 = str15;
            str8 = str14;
            i3 = iDecodeIntElement;
            str4 = str19;
            str = str11;
            num2 = num6;
            num = num5;
            num3 = num4;
            str9 = str18;
            str3 = str16;
        } else {
            int i6 = 18;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            int i7 = 5;
            int i8 = 4;
            boolean z = true;
            String str20 = null;
            String str21 = null;
            Integer num7 = null;
            MultipartRequestFormDataType multipartRequestFormDataType4 = null;
            Integer num8 = null;
            Integer num9 = null;
            String str22 = null;
            Map map7 = null;
            HashMap map8 = null;
            String str23 = null;
            String str24 = null;
            HashMap map9 = null;
            String str25 = null;
            String str26 = null;
            int i9 = 6;
            int i10 = 0;
            MultipartRequestFormDataType multipartRequestFormDataType5 = null;
            String str27 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        map7 = map7;
                        z = false;
                        str20 = str20;
                        multipartRequestFormDataType5 = multipartRequestFormDataType5;
                        i5 = 8;
                        i4 = 9;
                        i8 = 4;
                        i7 = 5;
                        i9 = 6;
                        map7 = map7;
                        break;
                    case 0:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str24);
                        i10 |= 1;
                        str23 = str23;
                        str20 = str20;
                        multipartRequestFormDataType5 = multipartRequestFormDataType5;
                        i5 = 8;
                        i6 = 18;
                        i4 = 9;
                        i8 = 4;
                        i7 = 5;
                        i9 = 6;
                        map7 = map7;
                        break;
                    case 1:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str23);
                        i10 |= 2;
                        str22 = str22;
                        str20 = str20;
                        multipartRequestFormDataType5 = multipartRequestFormDataType5;
                        i5 = 8;
                        i6 = 18;
                        i4 = 9;
                        i8 = 4;
                        i7 = 5;
                        i9 = 6;
                        map7 = map7;
                        break;
                    case 2:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str22);
                        i10 |= 4;
                        str26 = str26;
                        str20 = str20;
                        multipartRequestFormDataType5 = multipartRequestFormDataType5;
                        i5 = 8;
                        i6 = 18;
                        i4 = 9;
                        i8 = 4;
                        i7 = 5;
                        i9 = 6;
                        map7 = map7;
                        break;
                    case 3:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str26);
                        i10 |= 8;
                        map8 = map8;
                        str20 = str20;
                        multipartRequestFormDataType5 = multipartRequestFormDataType5;
                        i5 = 8;
                        i6 = 18;
                        i4 = 9;
                        i8 = 4;
                        i7 = 5;
                        i9 = 6;
                        map7 = map7;
                        break;
                    case 4:
                        map7 = map7;
                        MultipartRequestFormDataType multipartRequestFormDataType6 = multipartRequestFormDataType5;
                        DeserializationStrategy deserializationStrategy = (DeserializationStrategy) lazyArr[i8].getValue();
                        int i11 = i8;
                        map8 = (HashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i11, deserializationStrategy, map8);
                        i10 |= 16;
                        i8 = i11;
                        str20 = str20;
                        multipartRequestFormDataType5 = multipartRequestFormDataType6;
                        i5 = 8;
                        i6 = 18;
                        i4 = 9;
                        i7 = 5;
                        i9 = 6;
                        map7 = map7;
                        break;
                    case 5:
                        Map map10 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, (DeserializationStrategy) lazyArr[i7].getValue(), map7);
                        i10 |= 32;
                        multipartRequestFormDataType5 = multipartRequestFormDataType5;
                        i5 = 8;
                        i4 = 9;
                        i9 = 6;
                        map7 = map10;
                        i6 = 18;
                        break;
                    case 6:
                        i10 |= 64;
                        map9 = (HashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i9, (DeserializationStrategy) lazyArr[i9].getValue(), map9);
                        i5 = 8;
                        i6 = 18;
                        i4 = 9;
                        break;
                    case 7:
                        i10 |= 128;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str25);
                        i5 = 8;
                        i6 = 18;
                        i4 = 9;
                        break;
                    case 8:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.f18170a, str21);
                        i10 |= 256;
                        i6 = 18;
                        break;
                    case 9:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.f18170a, str27);
                        i10 |= 512;
                        i6 = 18;
                        break;
                    case 10:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i10 |= 1024;
                        i6 = 18;
                        break;
                    case 11:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str20);
                        i10 |= 2048;
                        i6 = 18;
                        break;
                    case 12:
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.f18146a, num9);
                        i10 |= 4096;
                        i6 = 18;
                        break;
                    case 13:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.f18146a, num7);
                        i10 |= 8192;
                        i6 = 18;
                        break;
                    case 14:
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.f18146a, num8);
                        i10 |= 16384;
                        i6 = 18;
                        break;
                    case 15:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
                        i10 |= 32768;
                        i6 = 18;
                        break;
                    case 16:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str10);
                        i10 |= 65536;
                        i6 = 18;
                        break;
                    case 17:
                        multipartRequestFormDataType5 = (MultipartRequestFormDataType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (DeserializationStrategy) lazyArr[17].getValue(), multipartRequestFormDataType5);
                        i10 |= 131072;
                        i6 = 18;
                        break;
                    case 18:
                        multipartRequestFormDataType4 = (MultipartRequestFormDataType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), multipartRequestFormDataType4);
                        i10 |= 262144;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str28 = str20;
            str = str24;
            str2 = str25;
            str3 = str21;
            i = i10;
            num = num7;
            multipartRequestFormDataType = multipartRequestFormDataType4;
            str4 = str10;
            num2 = num8;
            map = map9;
            map2 = map7;
            num3 = num9;
            str5 = str27;
            str6 = str23;
            str7 = str22;
            str8 = str26;
            map3 = map8;
            str9 = str28;
            i2 = iDecodeIntElement3;
            multipartRequestFormDataType2 = multipartRequestFormDataType5;
            i3 = iDecodeIntElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        MultipartRequestData multipartRequestData = new MultipartRequestData(i, str, str6, str7, str8, map3, map2, map, str2, str3, str5, i3, str9, num3, num, num2, i2, str4);
        if ((i & 131072) == 0) {
            multipartRequestFormDataType3 = null;
            multipartRequestData.s = null;
        } else {
            multipartRequestFormDataType3 = null;
            multipartRequestData.s = multipartRequestFormDataType2;
        }
        if ((i & 262144) == 0) {
            multipartRequestData.t = multipartRequestFormDataType3;
            return multipartRequestData;
        }
        multipartRequestData.t = multipartRequestFormDataType;
        return multipartRequestData;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MultipartRequestData value = (MultipartRequestData) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MultipartRequestData.Companion companion = MultipartRequestData.INSTANCE;
        GenericRequestData.b(value, compositeEncoderBeginStructure, serialDescriptor);
        Lazy[] lazyArr = MultipartRequestData.u;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || value.s != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, (SerializationStrategy) lazyArr[17].getValue(), value.s);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18) || value.t != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, (SerializationStrategy) lazyArr[18].getValue(), value.t);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
