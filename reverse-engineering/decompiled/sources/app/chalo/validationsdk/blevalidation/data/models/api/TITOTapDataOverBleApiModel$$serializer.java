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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/validationsdk/blevalidation/data/models/api/TITOTapDataOverBleApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapDataOverBleApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TITOTapDataOverBleApiModel$$serializer implements GeneratedSerializer<TITOTapDataOverBleApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TITOTapDataOverBleApiModel$$serializer f10492a;
    private static final SerialDescriptor descriptor;

    static {
        TITOTapDataOverBleApiModel$$serializer tITOTapDataOverBleApiModel$$serializer = new TITOTapDataOverBleApiModel$$serializer();
        f10492a = tITOTapDataOverBleApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.validationsdk.blevalidation.data.models.api.TITOTapDataOverBleApiModel", tITOTapDataOverBleApiModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.j(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, true);
        pluginGeneratedSerialDescriptor.j("b", true);
        pluginGeneratedSerialDescriptor.j(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, true);
        pluginGeneratedSerialDescriptor.j("d", true);
        pluginGeneratedSerialDescriptor.j("e", true);
        pluginGeneratedSerialDescriptor.j("f", true);
        pluginGeneratedSerialDescriptor.j("g", true);
        pluginGeneratedSerialDescriptor.j("h", true);
        pluginGeneratedSerialDescriptor.j(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, true);
        pluginGeneratedSerialDescriptor.j("j", true);
        pluginGeneratedSerialDescriptor.j("k", true);
        pluginGeneratedSerialDescriptor.j(CmcdData.Factory.STREAM_TYPE_LIVE, true);
        pluginGeneratedSerialDescriptor.j(ApsMetricsDataMap.APSMETRICS_FIELD_METRICS, true);
        pluginGeneratedSerialDescriptor.j(ApsMetricsDataMap.APSMETRICS_FIELD_NAME, true);
        pluginGeneratedSerialDescriptor.j("o", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{kSerializerC, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(IntSerializer.f18146a), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        Long l;
        Long l2;
        String str5;
        String str6;
        String str7;
        String str8;
        Long l3;
        Long l4;
        String str9;
        String str10;
        int i;
        String str11;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Integer num2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.f18146a, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            num = num3;
            i = 32767;
            l = l8;
            str7 = str18;
            str5 = str17;
            str8 = str16;
            str6 = str15;
            str10 = str14;
            l2 = l7;
            l3 = l6;
            str9 = str13;
            str4 = str19;
            l4 = l5;
            str2 = str12;
        } else {
            boolean z = true;
            int i2 = 0;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            str = null;
            Long l9 = null;
            Long l10 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            Long l11 = null;
            String str28 = null;
            Long l12 = null;
            while (z) {
                String str29 = str21;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        str21 = str29;
                        str20 = str20;
                        i2 = i2;
                        break;
                    case 0:
                        str11 = str29;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str28);
                        i2 |= 1;
                        l12 = l12;
                        str21 = str11;
                        str20 = str20;
                        break;
                    case 1:
                        str11 = str29;
                        l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l12);
                        i2 |= 2;
                        str21 = str11;
                        str20 = str20;
                        break;
                    case 2:
                        str20 = str20;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str29);
                        i2 |= 4;
                        str20 = str20;
                        break;
                    case 3:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str20);
                        i2 |= 8;
                        str21 = str29;
                        break;
                    case 4:
                        l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l11);
                        i2 |= 16;
                        str21 = str29;
                        str20 = str20;
                        break;
                    case 5:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str25);
                        i2 |= 32;
                        str21 = str29;
                        str20 = str20;
                        break;
                    case 6:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str27);
                        i2 |= 64;
                        str21 = str29;
                        str20 = str20;
                        break;
                    case 7:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str24);
                        i2 |= 128;
                        str21 = str29;
                        str20 = str20;
                        break;
                    case 8:
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, l10);
                        i2 |= 256;
                        str21 = str29;
                        str20 = str20;
                        break;
                    case 9:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.f18151a, l9);
                        i2 |= 512;
                        str21 = str29;
                        str20 = str20;
                        break;
                    case 10:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str26);
                        i2 |= 1024;
                        str21 = str29;
                        str20 = str20;
                        break;
                    case 11:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str);
                        i2 |= 2048;
                        str21 = str29;
                        str20 = str20;
                        break;
                    case 12:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str23);
                        i2 |= 4096;
                        str21 = str29;
                        str20 = str20;
                        break;
                    case 13:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.f18146a, num2);
                        i2 |= 8192;
                        str21 = str29;
                        str20 = str20;
                        break;
                    case 14:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str22);
                        i2 |= 16384;
                        str21 = str29;
                        str20 = str20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str2 = str28;
            num = num2;
            str3 = str22;
            str4 = str23;
            l = l9;
            l2 = l10;
            str5 = str24;
            str6 = str25;
            str7 = str26;
            str8 = str27;
            l3 = l11;
            l4 = l12;
            str9 = str21;
            str10 = str20;
            i = i2;
        }
        String str30 = str;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TITOTapDataOverBleApiModel(i, str2, l4, str9, str10, l3, str6, str8, str5, l2, l, str7, str30, str4, num, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TITOTapDataOverBleApiModel value = (TITOTapDataOverBleApiModel) obj;
        Intrinsics.i(value, "value");
        String str = value.p;
        Integer num = value.o;
        String str2 = value.n;
        String str3 = value.m;
        String str4 = value.l;
        Long l = value.k;
        Long l2 = value.j;
        String str5 = value.i;
        String str6 = value.h;
        String str7 = value.g;
        Long l3 = value.f;
        String str8 = value.e;
        String str9 = value.d;
        Long l4 = value.c;
        String str10 = value.b;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TITOTapDataOverBleApiModel.Companion companion = TITOTapDataOverBleApiModel.INSTANCE;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str10 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || l4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str9 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str8 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || l3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str7 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, l2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || str2 != 0) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.f18146a, num);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
