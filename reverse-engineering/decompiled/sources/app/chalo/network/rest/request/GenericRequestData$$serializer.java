package app.chalo.network.rest.request;

import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/network/rest/request/GenericRequestData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/network/rest/request/GenericRequestData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GenericRequestData$$serializer implements GeneratedSerializer<GenericRequestData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GenericRequestData$$serializer f6516a;
    private static final SerialDescriptor descriptor;

    static {
        GenericRequestData$$serializer genericRequestData$$serializer = new GenericRequestData$$serializer();
        f6516a = genericRequestData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.network.rest.request.GenericRequestData", genericRequestData$$serializer, 17);
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
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = GenericRequestData.r;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), intSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), intSerializer, BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        HashMap map;
        Map map2;
        String str3;
        Integer num;
        Integer num2;
        String str4;
        HashMap map3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        Integer num3;
        int i2;
        int i3;
        String str10;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = GenericRequestData.r;
        Integer num4 = null;
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
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, intSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, intSerializer, null);
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, intSerializer, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            i = 131071;
            i2 = iDecodeIntElement2;
            map3 = map4;
            str8 = str12;
            str2 = str11;
            str5 = str15;
            str6 = str16;
            str7 = str14;
            i3 = iDecodeIntElement;
            str4 = str17;
            str9 = str13;
            num2 = num7;
            num = num6;
            num3 = num5;
            map = map6;
            map2 = map5;
        } else {
            int i4 = 5;
            int i5 = 4;
            boolean z = true;
            int i6 = 0;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            Integer num8 = null;
            HashMap map7 = null;
            Map map8 = null;
            String str18 = null;
            String str19 = null;
            Integer num9 = null;
            String str20 = null;
            str = null;
            HashMap map9 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            int i7 = 6;
            String str25 = null;
            while (z) {
                String str26 = str18;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num8 = num8;
                        z = false;
                        str18 = str26;
                        i6 = i6;
                        num8 = num8;
                        i5 = 4;
                        i4 = 5;
                        i7 = 6;
                        break;
                    case 0:
                        str10 = str26;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str23);
                        i6 |= 1;
                        str24 = str24;
                        str18 = str10;
                        num8 = num8;
                        i5 = 4;
                        i4 = 5;
                        i7 = 6;
                        break;
                    case 1:
                        str10 = str26;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str24);
                        i6 |= 2;
                        str18 = str10;
                        num8 = num8;
                        i5 = 4;
                        i4 = 5;
                        i7 = 6;
                        break;
                    case 2:
                        num8 = num8;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str26);
                        i6 |= 4;
                        num8 = num8;
                        i5 = 4;
                        i4 = 5;
                        i7 = 6;
                        break;
                    case 3:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str22);
                        i6 |= 8;
                        num8 = num8;
                        str18 = str26;
                        i5 = 4;
                        i4 = 5;
                        i7 = 6;
                        break;
                    case 4:
                        map9 = (HashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), map9);
                        i6 |= 16;
                        str18 = str26;
                        str22 = str22;
                        i4 = 5;
                        i7 = 6;
                        break;
                    case 5:
                        map8 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), map8);
                        i6 |= 32;
                        str18 = str26;
                        str22 = str22;
                        i7 = 6;
                        break;
                    case 6:
                        map7 = (HashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, (DeserializationStrategy) lazyArr[i7].getValue(), map7);
                        i6 |= 64;
                        str18 = str26;
                        str22 = str22;
                        break;
                    case 7:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str25);
                        i6 |= 128;
                        str18 = str26;
                        str22 = str22;
                        break;
                    case 8:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str);
                        i6 |= 256;
                        str18 = str26;
                        str22 = str22;
                        break;
                    case 9:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str21);
                        i6 |= 512;
                        str18 = str26;
                        str22 = str22;
                        break;
                    case 10:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i6 |= 1024;
                        str18 = str26;
                        str22 = str22;
                        break;
                    case 11:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str20);
                        i6 |= 2048;
                        str18 = str26;
                        str22 = str22;
                        break;
                    case 12:
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.f18146a, num8);
                        i6 |= 4096;
                        str18 = str26;
                        str22 = str22;
                        break;
                    case 13:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.f18146a, num4);
                        i6 |= 8192;
                        str18 = str26;
                        str22 = str22;
                        break;
                    case 14:
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.f18146a, num9);
                        i6 |= 16384;
                        str18 = str26;
                        str22 = str22;
                        break;
                    case 15:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
                        i6 |= 32768;
                        str18 = str26;
                        str22 = str22;
                        break;
                    case 16:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str19);
                        i6 |= 65536;
                        str18 = str26;
                        str22 = str22;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str2 = str23;
            map = map7;
            map2 = map8;
            str3 = str19;
            num = num4;
            num2 = num9;
            str4 = str20;
            map3 = map9;
            str5 = str25;
            str6 = str21;
            str7 = str22;
            str8 = str24;
            str9 = str18;
            i = i6;
            num3 = num8;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement4;
        }
        String str27 = str;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GenericRequestData(i, str2, str8, str9, str7, map3, map2, map, str5, str27, str6, i3, str4, num3, num, num2, i2, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GenericRequestData value = (GenericRequestData) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GenericRequestData.b(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
