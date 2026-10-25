package app.chalo.validationsdk.blevalidation.data.models.api;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/validationsdk/blevalidation/data/models/api/TITOTapOutDataOverBleApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapOutDataOverBleApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TITOTapOutDataOverBleApiModel$$serializer implements GeneratedSerializer<TITOTapOutDataOverBleApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TITOTapOutDataOverBleApiModel$$serializer f10496a;
    private static final SerialDescriptor descriptor;

    static {
        TITOTapOutDataOverBleApiModel$$serializer tITOTapOutDataOverBleApiModel$$serializer = new TITOTapOutDataOverBleApiModel$$serializer();
        f10496a = tITOTapOutDataOverBleApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.validationsdk.blevalidation.data.models.api.TITOTapOutDataOverBleApiModel", tITOTapOutDataOverBleApiModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.j(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, false);
        pluginGeneratedSerialDescriptor.j("b", false);
        pluginGeneratedSerialDescriptor.j(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, false);
        pluginGeneratedSerialDescriptor.j("d", true);
        pluginGeneratedSerialDescriptor.j("e", true);
        pluginGeneratedSerialDescriptor.j("f", false);
        pluginGeneratedSerialDescriptor.j("g", false);
        pluginGeneratedSerialDescriptor.j("h", false);
        pluginGeneratedSerialDescriptor.j(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, false);
        pluginGeneratedSerialDescriptor.j("j", false);
        pluginGeneratedSerialDescriptor.j("k", false);
        pluginGeneratedSerialDescriptor.j(CmcdData.Factory.STREAM_TYPE_LIVE, true);
        pluginGeneratedSerialDescriptor.j(ApsMetricsDataMap.APSMETRICS_FIELD_METRICS, false);
        pluginGeneratedSerialDescriptor.j(ApsMetricsDataMap.APSMETRICS_FIELD_NAME, true);
        pluginGeneratedSerialDescriptor.j("o", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f18151a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(longSerializer);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC10 = BuiltinSerializersKt.c(longSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, kSerializerC10, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Long l;
        String str;
        Integer num;
        String str2;
        Integer num2;
        Long l2;
        Long l3;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l4;
        String str7;
        Long l5;
        int i;
        String str8;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Long l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            Long l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, intSerializer, null);
            str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            num = num4;
            l4 = l7;
            l = l6;
            i = 32767;
            num2 = num3;
            str5 = str14;
            str3 = str13;
            str6 = str12;
            str = str11;
            l3 = l9;
            l5 = l8;
            str7 = str10;
            str2 = str16;
            str4 = str15;
            l2 = l10;
        } else {
            boolean z = true;
            int i2 = 0;
            Long l11 = null;
            String str17 = null;
            String str18 = null;
            Integer num5 = null;
            String str19 = null;
            Integer num6 = null;
            Long l12 = null;
            Long l13 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            Long l14 = null;
            Long l15 = null;
            while (z) {
                String str24 = str18;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        str18 = str24;
                        l11 = l11;
                        i2 = i2;
                        break;
                    case 0:
                        str8 = str24;
                        l14 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.f18151a, l14);
                        i2 |= 1;
                        l15 = l15;
                        str18 = str8;
                        l11 = l11;
                        break;
                    case 1:
                        str8 = str24;
                        l15 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l15);
                        i2 |= 2;
                        str18 = str8;
                        l11 = l11;
                        break;
                    case 2:
                        l11 = l11;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str24);
                        i2 |= 4;
                        l11 = l11;
                        break;
                    case 3:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str17);
                        i2 |= 8;
                        str18 = str24;
                        break;
                    case 4:
                        l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l11);
                        i2 |= 16;
                        str18 = str24;
                        str17 = str17;
                        break;
                    case 5:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str23);
                        i2 |= 32;
                        str18 = str24;
                        str17 = str17;
                        break;
                    case 6:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str20);
                        i2 |= 64;
                        str18 = str24;
                        str17 = str17;
                        break;
                    case 7:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str22);
                        i2 |= 128;
                        str18 = str24;
                        str17 = str17;
                        break;
                    case 8:
                        l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, l13);
                        i2 |= 256;
                        str18 = str24;
                        str17 = str17;
                        break;
                    case 9:
                        l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.f18151a, l12);
                        i2 |= 512;
                        str18 = str24;
                        str17 = str17;
                        break;
                    case 10:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.f18146a, num6);
                        i2 |= 1024;
                        str18 = str24;
                        str17 = str17;
                        break;
                    case 11:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str21);
                        i2 |= 2048;
                        str18 = str24;
                        str17 = str17;
                        break;
                    case 12:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str19);
                        i2 |= 4096;
                        str18 = str24;
                        str17 = str17;
                        break;
                    case 13:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.f18146a, num5);
                        i2 |= 8192;
                        str18 = str24;
                        str17 = str17;
                        break;
                    case 14:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str9);
                        i2 |= 16384;
                        str18 = str24;
                        str17 = str17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            l = l14;
            str = str17;
            num = num5;
            str2 = str19;
            num2 = num6;
            l2 = l12;
            l3 = l13;
            str3 = str20;
            str4 = str21;
            str5 = str22;
            str6 = str23;
            l4 = l15;
            str7 = str18;
            l5 = l11;
            i = i2;
        }
        String str25 = str9;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TITOTapOutDataOverBleApiModel(i, l, l4, str7, str, l5, str6, str3, str5, l3, l2, num2, str4, str2, num, str25);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TITOTapOutDataOverBleApiModel value = (TITOTapOutDataOverBleApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LongSerializer longSerializer = LongSerializer.f18151a;
        Long l = value.f10495a;
        Integer num = value.n;
        String str = value.l;
        Long l2 = value.e;
        String str2 = value.d;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, longSerializer, l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, longSerializer, value.b);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, longSerializer, l2);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, longSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, longSerializer, value.j);
        IntSerializer intSerializer = IntSerializer.f18146a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, intSerializer, value.k);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, str);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, intSerializer, num);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
